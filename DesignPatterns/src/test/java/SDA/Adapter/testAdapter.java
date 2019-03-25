package SDA.Adapter;

import org.junit.Test;

public class testAdapter {

    @Test
    public void testAdapter() {
        AccountServiceAdapter asa = new AccountServiceAdapter();
        asa.saveUser("jan", "nowak");
    }


}
