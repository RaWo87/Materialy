package SDA.Dekorator;

public class RawTxt implements Decorator{
    @Override
    public String sayHello() {
        return "Hello! ";
    }
}
