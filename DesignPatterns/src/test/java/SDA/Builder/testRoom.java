package SDA.Builder;

import SDA.Builder.Room;
import org.junit.Assert;
import org.junit.Test;

public class testRoom {

    @Test
    public void testBuilder() {
        Room r = new Room.RoomBuilder(1, 2)
                .bedCount(3)
                .hasBathroom(true)
                .roomisCleanNr(true)
                .available(true)
                .build();

        String[] testvalues = new String[]{"true", "false", "1", "2", "3"};
        Assert.assertTrue(r.toString().contains(testvalues[0]));
        Assert.assertFalse(r.toString().contains(testvalues[1]));
        Assert.assertTrue(r.toString().contains(testvalues[2]));
        Assert.assertTrue(r.toString().contains(testvalues[3]));
        Assert.assertTrue(r.toString().contains(testvalues[4]));

    }
}
