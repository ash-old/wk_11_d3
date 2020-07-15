import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Big Room", 100);
    }

    @Test
    public void hasParameters(){
        assertEquals("Big Room", conferenceRoom.getRoomName());
        assertEquals(100, conferenceRoom.getCapacity());
        assertEquals(0, conferenceRoom.getGuests());
    }
}
