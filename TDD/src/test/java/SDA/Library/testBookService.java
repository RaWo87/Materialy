package SDA.Library;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class testBookService {
    private BookService service;

    @Test
    public void testGetBooks(){
        assertThat(service.getlist().entrySet()).containsExactly("songs of");
    }
}
