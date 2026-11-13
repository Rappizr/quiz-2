package id.ac.polinema.quiz2;

import java.util.List;

/**
 * TAHAP 3 (polimorfisme dan exception): perhitungan atas banyak perjalanan.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)}).
 * Semua method memproses objek lewat tipe {@code Ride}, tanpa mengecek
 * nama subclass.
 */

public class RideCalculator {

    public static double totalFare(List<Ride> orders){
        double total = 0.0;
        if(orders !=null){
            for(Ride order : orders){
                total += order.calculateFare();
            }
        }
        return total;
    }

    public static double totalInsurance(List<Ride> orders) {
        double total = 0.0;
        if(orders != null) {
            for(Ride order : orders) {
                if(order instanceof Insurable) {
                    total += ((Insurable) order).insuranceFee();
                }
            }
        }
        return total;
    }

    public static void validate(Ride order) throws InvalidDistanceException {
        double distance = order.getDistanceKm();
        if(distance <= 0 || distance > 50.0) {
            throw new InvalidDistanceException("Invalid distance: " + distance);
        }
    }

    public static boolean isAcceptable(Ride order) {
        try{
            validate(order);
            return true;
        }catch(InvalidDistanceException e) {
            return false;
        }
    }
}