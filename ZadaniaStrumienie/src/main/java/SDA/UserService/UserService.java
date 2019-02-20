package SDA.UserService;

import java.io.File;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class UserService {
    static final String s = Paths.get("").toAbsolutePath().toString().replace("\\","/");
    List<User> userzy = new LinkedList<>();

    public void updateList (){

        File plik = new File(s+"\\src\\main\\resources\\userActions.csv");
        

    }
}
