package SDA;

import java.util.ArrayList;
import java.util.List;

public class Names {
   private List<String> listOfNames = new ArrayList<>();
   private GenerateID idGenerator;
   public Names(GenerateID idGenerator){
       this.idGenerator = idGenerator;

       listOfNames.add("Jan");
       listOfNames.add("Tomek");
       listOfNames.add("Olgierd");
   }
   public String getRandomName(){

       return listOfNames.get(idGenerator.getUniqueId());
   }
}
