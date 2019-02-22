package SDA;

import SDA.Flights.FlightService;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Scierzki {
    static final String s = Paths.get("").toAbsolutePath().toString().replace("\\","/");
    static final String resourcesPath = s+"/src/main/resources/";

    public Path p1 =  Paths.get("/src/main/resources/");
    String workingDir = System.getProperty("user.dir")+"\\src\\main\\resources\\flights.csv";
    public String scierzka2 = "."+p1.toString() ;
    static public String scierzka = resourcesPath;

    public static void main(String[] args) {
        FlightService loty = new FlightService();

        // File flightsCSV2 = new File(resourcesPath+"flights.csv");
        //  File flightsCSV3 = new File(workingDir);

        String workingDir = System.getProperty("user.dir")+"\\src\\main\\resources\\flights.csv";
        System.out.println("working dir"+workingDir);
    }


}
