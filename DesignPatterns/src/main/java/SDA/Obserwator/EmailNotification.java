package SDA.Obserwator;

public class EmailNotification extends Obserwator{

   public EmailNotification(TempProvider tempProvider){
        this.subject = tempProvider;
        tempProvider.addObserwer(this);
    }
    @Override
    public void update() {
        System.out.println("beep beep mail notif"+subject.getCurrentTemp());
    }

}
