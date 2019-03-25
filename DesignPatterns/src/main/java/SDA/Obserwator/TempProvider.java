package SDA.Obserwator;

import java.util.ArrayList;
import java.util.List;

public class TempProvider {
    private int currentTemp;
    List<Obserwator> observers = new ArrayList<>();
    public void howManyObserwers(){
        System.out.println(observers.size());
    }

    public void setCurrentTemp(int temp){
        this.currentTemp = temp;
        notifyObs();
    }
    public int getCurrentTemp(){
        return currentTemp;
    }


    public void addObserwer(Obserwator obs){
        observers.add(obs);
    }
    public void removeObserwer(Obserwator obs){
        observers.remove(obs);
    }
    private void notifyObs(){
        for(Obserwator obs: observers){
            obs.update();
        }
    }



}
