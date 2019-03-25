package SDA.Singleton;

import org.junit.Assert;
import org.junit.Test;

public class testSingleton {

    @Test
    public void testSession(){
        Session s = Session.getSession();
        Assert.assertEquals(s.getUser(),"please log in");
        s.logUser("asia");
        Assert.assertEquals(s.getUser(),"asia");
        Session b = Session.getSession();
        Assert.assertEquals(b.getUser(),"asia");


    }
}
