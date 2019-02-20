package SDA.UserService;

import java.io.IOException;

public class TestServisu {
    public static void main(String[] args) throws IOException {
        UserService service = new UserService();

        service.readFile();

        service.showUsers();
    }
}
