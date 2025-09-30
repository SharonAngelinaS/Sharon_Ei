public class AutoRide extends Ride {
    @Override
    public void book(String pickup, String drop) {
        System.out.println("Auto ride booked from " + pickup + " to " + drop);
    }
}