import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 2, "double", 10);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void getTotalPrice(){
        assertEquals(20, booking.totalPrice());
    }




}
