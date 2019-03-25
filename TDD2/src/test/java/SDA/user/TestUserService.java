package SDA.user;

import SDA.email.EmailSender;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import sun.invoke.empty.Empty;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(JUnitParamsRunner.class)
public class TestUserService {
    private UserDatabase mockDatabase;
    private EmailSender mockEmailSender;
    private UserValidation mockValidation;

    private UserService service;
    private User user;
@Before
    public void setUP(){
    this.mockDatabase = mock(UserDatabase.class);
    this.mockEmailSender = mock(EmailSender.class);
    this.mockValidation = mock(UserValidation.class);
    this.service = new UserService(mockDatabase,mockEmailSender,mockValidation);
}
// tutaj sprawdzamy czy finalna metoda(add) została wykonana,
// fizycznie nie jestesmy w stanie dodac usera do mocka,
// wiec nie mozemy weryfikowac bezposrednio czy nowy user jest na liscie.
@Test

    public void registerTest(){
    this.user = new User("jan@","password");

    when(mockValidation.validUser(any(User.class))).thenReturn(true);
    when(mockDatabase.containsMail(anyString())).thenReturn(false);
    when(mockEmailSender.sendWelcomeTo(any(User.class))).thenReturn(true);
    service.register(user);

    assertThat(service.register(user)).isNotNull();// tu też metoda add jest wywoływana
    verify(mockDatabase, times(2)).add(user);
}
@Test
@Parameters({
        "true,true,true","true,true,false","false,true,true",
        "false,true,false","false,false,true","true,false,false"
})
    public void registerTestFails(boolean a, boolean b, boolean c){
    this.user = new User("jan@","password");

    when(mockValidation.validUser(any(User.class))).thenReturn(a);
    when(mockDatabase.containsMail(anyString())).thenReturn(b);
    when(mockEmailSender.sendWelcomeTo(any(User.class))).thenReturn(c);
    service.register(user);

    verify(mockDatabase, never()).add(user);
}
@Test
    public void loginTest() {
    when(mockValidation.validEmail(anyString())).thenReturn(true);
    when(mockValidation.validPassword(anyString())).thenReturn(true);
    service.login("", "");
    verify(mockDatabase).login(anyString(), anyString());
}
    @Test
    @Parameters({"true,false","false,true","false,false"})
    public void loginTestFails(boolean a , boolean b){
        when(mockValidation.validEmail(anyString())).thenReturn(a);
        when(mockValidation.validPassword(anyString())).thenReturn(b);
        service.login("","");
        verify(mockDatabase, never()).login(anyString(),anyString());
    }




}
