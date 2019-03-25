package SDA.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class testIterator {

    @Test
    public void testIterator() {
        Iterator<Integer> iterator = new ListWithId<>();
        ((ListWithId) iterator).add(1);
        ((ListWithId) iterator).add(2);
        ((ListWithId) iterator).add(3);
        ((ListWithId) iterator).add(4);

        while (iterator.hasNext()) {
            Assert.assertTrue(iterator.getNext() != null);
        }

        Assert.assertTrue(iterator.getNext() != null);
        Assert.assertEquals(iterator.getNext(),2,0);
        ((ListWithId) iterator).removeCurrent();
        Assert.assertEquals(iterator.getNext(),2,0);

    }
}
