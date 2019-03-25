package SDA.Obserwator;

public abstract class Obserwator {
    protected TempProvider subject;
    public abstract void update();
}
