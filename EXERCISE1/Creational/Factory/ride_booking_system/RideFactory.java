public class RideFactory {
    public static Ride getRide(int choice) {
        switch (choice) {
            case 1: return new BikeRide();
            case 2: return new CarRide();
            case 3: return new AutoRide();
            default: return null;
        }
    }
}