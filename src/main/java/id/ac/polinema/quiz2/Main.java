package id.ac.polinema.quiz2;

import java.util.List;

/**
 * Tempat bebas untuk mencoba programmu. Kelas ini TIDAK dinilai.
 *
 * Ide percobaan (tulis sendiri setelah tiap tahap selesai):
 *  1. Buat satu Passenger, lalu coba ubah namanya.
 *  2. Buat satu BikeRide dan satu CarRide, lalu tampilkan tarif-nya.
 *  3. Masukkan keduanya ke RideCalculator.totalFare(...) lewat sebuah List.
 *  4. Buat RideDispatcher dengan new CashPayment(), tambahkan perjalanan, lalu panggil checkout(...).
 *
 * Jalankan lewat NetBeans (Run Project), VS Code (Run di atas main),
 * atau terminal: mvn -q compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("P1", "Rappizr");
        passenger.setName(" ");
        passenger.setName("Mukhammad Rappi Zabra");
        System.out.println("Penumpang: "+passenger.getPassengerId()+" - "+passenger.getName());

        Ride bikeRide = new BikeRide("L1", passenger, 5.0);
        Ride carRide = new CarRide("L2", passenger, 5.0);

        System.out.println("Tarif Ojek Motor (5Km): Rp " + bikeRide.calculateFare());
        System.out.println("Tarif Ojek Mobil (5Km): Rp " + carRide.calculateFare());
        
        List<Ride> rides = List.of(bikeRide, carRide);
        System.out.println("Total Tarif: Rp " + RideCalculator.totalFare(rides));
        System.out.println("Total Asuransi: Rp " + RideCalculator.totalInsurance(rides));

        Ride invalidRide = new BikeRide("L3", passenger, 55.0);
        System.out.println("L1 Apakah valid? " + RideCalculator.isAcceptable(bikeRide)); 
        System.out.println("L3 (55km) Apakah valid? " + RideCalculator.isAcceptable(invalidRide)); 

        RideDispatcher dispatcher = new RideDispatcher(new CashPayment());
        dispatcher.add(bikeRide);
        dispatcher.add(carRide);

        dispatcher.checkout("L1"); 
        dispatcher.checkout("L2");
    
    }
}