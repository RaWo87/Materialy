package SDA.urzytkownicy;

import SDA.Strumienie;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Users {

    static final Logger log = Logger.getLogger(Strumienie.class.getName());
    String resourcesPath = "C:/Users/m1rage/IdeaProjects/ZadaniaStrumienie/src/main/resources/";


    public void clearLog() throws IOException {
        FileUtils.write(new File(resourcesPath + "StrumienieLogs.log"), "", "UTF-8");
    }
    // ########################## USER
    public List<User> makeUsers() throws IOException {
        clearLog();
        List<User> userzy = new LinkedList<>();
        File tekstFile = new File(resourcesPath + "users.txt");
        LineIterator rekordUsera = FileUtils.lineIterator(tekstFile, "UTF-8");

        while (rekordUsera.hasNext()) {
            String[] dane = rekordUsera.nextLine().split(" ");
            userzy.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
            log.info("user " + dane[0] + " was made");

        }
        return userzy;
    }

    public List<User>[] makeAdults() throws IOException {
        clearLog();
        List<User> male = new LinkedList<>();
        List<User> female = new LinkedList<>();
        List<User>[] userzy = new List[]{male, female};

        File tekstFile = new File(resourcesPath + "users.txt");
        LineIterator rekordUsera = FileUtils.lineIterator(tekstFile, "UTF-8");

        while (rekordUsera.hasNext()) {
            String[] dane = rekordUsera.nextLine().split(" ");
            if (Integer.parseInt(dane[2]) > 18) {
                if (dane[0].charAt(dane[0].length() - 1) != 'a') {
                    male.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
                    log.info("man " + dane[0] + " was made");
                } else {
                    female.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
                    log.info("woman " + dane[0] + " was made");

                }
            } else log.error("user to young!");
        }
        return userzy;
    }
}
