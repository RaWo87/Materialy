package SDA.Obserwator;

public class SMSNotification extends Obserwator{

    public SMSNotification(TempProvider tempProvider){
        this.subject = tempProvider;
        tempProvider.addObserwer(this);
    }

    @Override
    public void update() {
        System.out.println("hej hej, przyszedl sms"+subject.getCurrentTemp());
    }
}
