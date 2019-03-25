package SDA.Dekorator;

public class JavaTxt implements Decorator {
    private Decorator decorator;
    public JavaTxt(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String sayHello() {
        return "System.out.println(" + decorator.sayHello() + ")";
    }
}
