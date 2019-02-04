package sda.UserService;

public class Tester {
    public static void main(String[] args) {
        UserService a = new UserService();

        User user1 = new User();
        user1.setHaslo("tajne");
        user1.setImie("andzej");
        user1.setLogin("andrzej111");
        user1.setNazwisko("kowalski");
        user1.setWiek(1990, 5,1);
        user1.setEmail("gmail3");

        User user2 = new User();
        user2.setHaslo("nietajne");
        user2.setImie("maciek");
        user2.setLogin("maciek111");
        user2.setNazwisko("nowak");
        user2.setWiek(2002, 1,30);
        user2.setEmail("wp.pl");

        User user3 = new User();
        user3.setHaslo("qwerty");
        user3.setImie("tomek");
        user3.setLogin("tomek111");
        user3.setNazwisko("duda");
        user3.setWiek(1987, 12,30);
        user3.setEmail("gmaiggl");

        a.addToMap(user1);
        a.addToMap(user2);
        a.addToMap(user3);

        System.out.println(a.getAllUsers());
        System.out.println(a.getUserByID(1));



    }
}
