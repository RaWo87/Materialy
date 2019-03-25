package SDA.Dekorator;

public class PHPTxt implements Decorator{
    private Decorator decorator;

    public PHPTxt(Decorator decorator) {
        this.decorator = decorator;
    }


    @Override
    public String sayHello() {
        return "<PHP>"+decorator.sayHello()+"</PHP>";
    }
}
