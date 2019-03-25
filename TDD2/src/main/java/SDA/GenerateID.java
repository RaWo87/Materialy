package SDA;

import java.util.Random;

public class GenerateID {

    public Integer getUniqueId(){
        Random rng = new Random();
        return rng.nextInt(1000);
    }



}
