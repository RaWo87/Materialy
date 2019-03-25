package SDA;

import java.util.Objects;

public class User {
    private String name;
    private int age;

    User(String name, int age){
        this.name=name;
        this.age=age;
    }

    public boolean checkAdult(){
        return this.age>18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
