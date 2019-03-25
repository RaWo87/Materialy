package SDA.user;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)

public class TestUserValidation {
    User user;
    UserValidation userValidation;
    @Before
            public void setUp(){
        this.user = new User("jnowak@gmail.com", "password123");
        this.userValidation = new UserValidation();
    }
    @Test
    @Parameters({"a,12345678,false","1234,5,false","1234,12345678,true","a,a,false","123,12345678,true"})
    public void validUserTest(String mail, String pass, boolean valid){
        this.user = new User (mail,pass);
        Assert.assertEquals(userValidation.validUser(user),valid);
    }

    @Test (expected = NullPointerException.class)
    public void validUserException(){

        Assert.assertFalse(userValidation.validUser(null));


    }

   @Test
   @Parameters({"1234,true","12,false"})
   public void validUserEmailTest(String mail, Boolean valid){
        Assert.assertEquals(userValidation.validEmail(mail),valid);
   }
   @Test
   @Parameters({"12345678,true","1234567,false","123,false"})
    public void validUserPasswordTest(String pass, boolean valid){
        Assert.assertEquals(userValidation.validPassword(pass),valid);
   }

}
