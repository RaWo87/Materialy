package SDA.Singleton;

public class Session {
    private static Session session;
    private String loggedUser = "please log in";

    private Session() {
    }
    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void logUser(String user) {
        this.loggedUser = user;
    }

    public void logOut() {
        this.loggedUser = "no user";
    }

    public String getUser() {
        return loggedUser;
    }




}
