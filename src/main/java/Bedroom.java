import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int price;

    public Bedroom(int roomNumber, int capacity, String type, int price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.price = price;
    }

    public int getRoomnumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int getGuests(){
        return this.guests.size();
    }


    public void checkInGuest(Guest guest) {
        if(capacity > getGuests()) {
            this.guests.add(guest);
        }
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public int getPrice() {
       return this.price;
    }
}
