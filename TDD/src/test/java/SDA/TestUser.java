package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestUser {

    @Test
    @Parameters(method = "userParams")
    public void testUser(User u1, User u2){
        Assert.assertEquals(u1, u2);
    }
    @Test
    @Parameters(source = UserProvider.class)
    public void testAdult(User u, boolean valid){
        Assert.assertEquals(u.checkAdult(),valid);
    }


    private Object[] userParams(){
        return new Object[]{
                new Object[]{new User("jan",15), new User("JAN",22)},
                new Object[]{new User("jan",15), new User("JAN",22)},
                new Object[]{new User("jan",15), new User("JAN",22)},
                new Object[]{new User("jan",15), new User("jan",15)},
                new Object[]{new User("jan",15), new User("jan",15)},
                new Object[]{new User("jan",15), new User("jan",15)}

        };
    }


}
