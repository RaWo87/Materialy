package SDA;

public class UserProvider {

    public static Object[] provideAduts(){
        return new Object[]{
                new Object[]{new User("Ania",25),true},
                new Object[]{new User("Ania",35),true},
                new Object[]{new User("Ania",55),true},
                new Object[]{new User("Ania",75),true}
        };

    }
    public static Object[] provideTeens(){
        return new Object[]{
                new Object[]{new User("Ola",12),false},
                new Object[]{new User("Ola",15),false},
                new Object[]{new User("Ola",17),false},
                new Object[]{new User("Ola",11),false}
        };
    }
    public static Object[] provideFalse(){
        return new Object[]{
                new Object[]{new User("#$@",0),false},
                new Object[]{new User("#$@",-10),false},
                new Object[]{new User("#$@",900),false}
        };
    }
}
