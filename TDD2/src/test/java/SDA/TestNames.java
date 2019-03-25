package SDA;

import org.junit.Before;
import org.junit.Test;
//  Assertions.assertThat(org.assertj.core.api) <- to jest poprawne
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

public class TestNames {

    private Names names;
    private GenerateID idGenerator = mock(GenerateID.class);

    @Before
    public void setUp()throws Exception{
        when(idGenerator.getUniqueId()).thenReturn(0);
        this.names = new Names(idGenerator);
    }

    @Test
    public void randomNameTest(){
        assertThat(names.getRandomName()).isEqualTo("Jan");
        System.out.println(names.getRandomName());
    }
    @Test
    public void verifyUniqueId(){
        verify(idGenerator,never()).getUniqueId();
        names.getRandomName();
        verify(idGenerator).getUniqueId();
    }



}
