import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }


    public int numberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
         this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addGuest(Guest guest, Bedroom bedroom) {
        bedroom.checkInGuest(guest);
    }

    public void removeGuest(Guest guest, Bedroom bedroom) {
        bedroom.checkOutGuest(guest);
    }

    public void addConferenceGuest(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.checkInGuest(guest);
    }

    public void removeConferenceGuest(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.checkOutGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked) {
        return new Booking(bedroom, nightsBooked);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
         this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public ArrayList<Bedroom> vacantBedrooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms){
            if(bedroom.getCapacity() > bedroom.getGuests()){
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }
}
