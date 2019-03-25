package SDA.Pełnomocnik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataLoaderImpl implements DataLoader {
    @Override
    public String fetchData() throws IOException {
        String tekst = "";

        tekst = new String(Files.readAllBytes(Paths.get("./Resources/dane.txt")));

        return tekst;
    }

}
