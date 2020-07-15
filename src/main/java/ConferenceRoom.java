import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;


    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public String getRoomName() {
        return this.name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuests() {
        return guests.size();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
