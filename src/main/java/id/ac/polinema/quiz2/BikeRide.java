package id.ac.polinema.quiz2;

public class BikeRide extends Ride {

    public BikeRide(String code, Passenger passenger, double distance) {
        super(code, passenger, distance);
    }

    @Override
    public double calculateFare() {
        return getDistance() * 2500.0;
    }
}    

