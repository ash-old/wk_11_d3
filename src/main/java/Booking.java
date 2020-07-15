public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public int totalPrice() {
        int nightlyRate = bedroom.getPrice();
        return nightlyRate * nightsBooked;
    }
}
