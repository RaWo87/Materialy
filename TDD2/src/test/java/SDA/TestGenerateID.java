package SDA;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestGenerateID {

    private GenerateID generateID;
    private GenerateID mockGenerator;

    @Before
    public void setUp()throws Exception{
        this.generateID = new GenerateID();
        this.mockGenerator = mock(GenerateID.class);
    }

    @Test
    public void testGenerator(){
        when(mockGenerator.getUniqueId()).thenReturn(15);

        System.out.println(generateID.getUniqueId());
        System.out.println(mockGenerator.getUniqueId());

        verify(mockGenerator).getUniqueId();

    }
}
