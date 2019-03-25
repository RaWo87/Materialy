package SDA;

import SDA.Dekorator.*;
import SDA.Adapter.AccountService;
import SDA.Adapter.AccountServiceAdapter;
import SDA.Builder.Room;
import SDA.Factory.Car;
import SDA.Factory.FactoryCar;
import SDA.Iterator.Iterator;
import SDA.Iterator.ListWithId;
import SDA.Obserwator.EmailNotification;
import SDA.Obserwator.SMSNotification;
import SDA.Obserwator.TempProvider;
import SDA.Pełnomocnik.DataLoader;
import SDA.Pełnomocnik.DataLoaderImpl;

import SDA.Pełnomocnik.ProxyLoader;
import SDA.Singleton.Session;
import SDA.Strategy.TaxContekst;
import SDA.Strategy.TaxPL;

import java.io.IOException;
import java.math.BigDecimal;


public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        TempProvider tp = new TempProvider();
        TempProvider provider2 = new TempProvider();
        tp.addObserwer(new EmailNotification(tp));
        EmailNotification emailObs = new EmailNotification(provider2);
        SMSNotification smsObs = new SMSNotification(tp);
        tp.howManyObserwers();
        provider2.setCurrentTemp(22);
        tp.setCurrentTemp(25);
    }



}
