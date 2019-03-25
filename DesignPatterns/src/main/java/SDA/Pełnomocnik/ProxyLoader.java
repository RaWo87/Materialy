package SDA.Pełnomocnik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class ProxyLoader implements DataLoader {
    private String fetchedText = "";

    @Override
    public String fetchData() throws IOException {
        setTimer();
        if (fetchedText.isEmpty()) {
            this.fetchedText = readData();
        }
        return fetchedText;
    }

    public String readData() throws IOException {
        return new String(Files.readAllBytes(Paths.get("./Resources/dane.txt")));
    }


    public void setTimer() {
        Timer clock = new Timer();
        clock.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    System.out.println(fetchedText);
                    fetchedText = readData();
                }catch (Exception e){}
            }
        }, 5000, 5000);
    }
    private void emptyCache() {
        this.fetchedText = "";
    }
}
