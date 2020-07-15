import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 10);
    }

    @Test
    public void hasParameters(){
        assertEquals(1, bedroom.getRoomnumber());
        assertEquals(2, bedroom.getCapacity());
        assertEquals("double", bedroom.getType());
        assertEquals(0, bedroom.getGuests());
        assertEquals(10, bedroom.getPrice());
    }





}
