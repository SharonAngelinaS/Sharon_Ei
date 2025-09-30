public class CarRide extends Ride {
    @Override
    public void book(String pickup, String drop) {
        System.out.println("Car ride booked from " + pickup + " to " + drop);
    }
}