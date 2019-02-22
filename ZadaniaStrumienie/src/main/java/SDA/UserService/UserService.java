package SDA.UserService;

import SDA.Pogoda.Pogoda;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class UserService {
    static final Logger log = Logger.getLogger(UserService.class.getName());
    static final String s = Paths.get("").toAbsolutePath().toString().replace("\\", "/");

    static final String resourcesPath = s + "/src/main/resources/";

    public void clearLog() throws IOException {
        FileUtils.write(new File(resourcesPath + "StrumienieLogs.log"), "", "UTF-8");
    }

    private List<User> userzy = new LinkedList<>();

    public void readFile() throws IOException {
        clearLog();

        File userActions = new File(s + "\\src\\main\\resources\\userActions.csv");
        LineIterator newLine = FileUtils.lineIterator(userActions, "UTF-8");

        while (newLine.hasNext()) {

            String[] line = newLine.nextLine().split(";");

            switch (line[0]) {

                case "CREATE": {
                    addUser(line);
                    break;
                }
                case "UPDATE": {
                    updateUser(line);
                    break;
                }
                case "REMOVE": {
                    removeUser(line);
                    break;
                }
                default:
                    log.error("invalid command");
            }

        }
    }

    public void showUsers() {
        for (User x : userzy
        ) {
            System.out.println(x.toString());
        }
    }

    public void addUser(String[] lines) {
        boolean loginTaken = false;
        try {
            for (User user : userzy
            ) {
                if (user.getLogin().equals(lines[1])) {
                    log.error("login: " + lines[1] + " is Taken");
                    loginTaken = true;
                }
            }
            if (!loginTaken) {
                userzy.add(new User(lines[1], lines[2], lines[3], lines[4], lines[5]));
                log.info("user " + lines[1] + " Created");
            }
        } catch (Exception e) {
            log.error("User " + lines[1] + " creation failure");
        }

    }

    public void updateUser(String[] lines) {
        try {
            for (User x : userzy
            ) {
                if (x.getLogin().equals(lines[1])) {
                    for (int i = 2; i < lines.length; i++) {
                        if (!lines[i].isEmpty()) {
                            switch (i) {
                                case 2:
                                    x.setPassword(lines[i]);
                                    break;
                                case 3:
                                    x.setFirstName(lines[i]);
                                    break;
                                case 4:
                                    x.setLastName(lines[i]);
                                    break;
                                case 5:
                                    x.setRole(lines[i]);
                                    break;
                            }
                        }
                    }
                    log.info("user " + lines[1] + " Updated");
                }
            }

        } catch (Exception e) {
            log.error("User " + lines[1] + " update failure");
        }

    }


    public void removeUser(String[] lines) {
        List<User> garbage = new LinkedList<>();
        try {

            for (User x : userzy
            ) {
                if (x.getLogin().equals(lines[1])) {
                    garbage.add(x);
                }
            }
            if (garbage.isEmpty()) {
                log.error(lines[1] + ": no such user");
            } else {
                userzy.removeAll(garbage);
                log.info("user " + lines[1] + " Deleted");
            }
        } catch (Exception e) {
            log.error("User " + lines[1] + " failed to remove");
        }
    }




    }
