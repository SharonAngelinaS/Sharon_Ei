public class BikeRide extends Ride {
    @Override
    public void book(String pickup, String drop) {
        System.out.println("Bike ride booked from " + pickup + " to " + drop);
    }
}