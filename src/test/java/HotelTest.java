import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Booking booking1;
    private Booking booking2;
    private DiningRoom diningRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest1 = new Guest("Craig");
        guest2 = new Guest("David");
        guest3 = new Guest("Ash");
        guest4 = new Guest("Bobby");
        conferenceRoom1 = new ConferenceRoom("Wee Room", 1);
        conferenceRoom2 = new ConferenceRoom("Big Room", 100);
        bedroom1 = new Bedroom(1, 2, "double", 10);
        bedroom2 = new Bedroom(2, 1, "single", 10);
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom2);
        hotel.addConferenceRoom(conferenceRoom1);
        booking1 = new Booking(bedroom1, 2);
        diningRoom = new DiningRoom("Big Dining Room");
        hotel.addDiningRoom(diningRoom);
    }

    @Test
    public void addRooms() {
        assertEquals(2, hotel.numberOfBedrooms());
        assertEquals(2, hotel.numberOfConferenceRooms());
    }


    @Test
    public void checkInGuest(){
        hotel.addGuest(guest1, bedroom2);
        hotel.addGuest(guest2, bedroom2);
        assertEquals(1, bedroom2.getGuests());
    }

    @Test
    public void checkOutGuest(){
        hotel.addGuest(guest1, bedroom1);
        hotel.removeGuest(guest1, bedroom1);
        assertEquals(0, bedroom1.getGuests());

    }

    @Test
    public void checkInConferenceGuest(){
        hotel.addConferenceGuest(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.getGuests());
    }

    @Test
    public void checkOutConferenceGuest(){
        hotel.addConferenceGuest(guest1, conferenceRoom1);
        hotel.removeConferenceGuest(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.getGuests());
    }

    @Test
    public void checkVacantBedrooms(){
        hotel.addGuest(guest1, bedroom2);
        assertEquals(1, hotel.vacantBedrooms().size());
    }

//    @Test
//    public void bookRoom(){
//        assertEquals(booking1, hotel.bookRoom(bedroom1, 2));
//    }



}
