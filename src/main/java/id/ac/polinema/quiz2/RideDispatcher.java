package id.ac.polinema.quiz2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * TAHAP 4 dan 5 (collections dan SOLID): pengatur perjalanan yang menyimpan
 * dan memproses perjalanan.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)}).
 * Deklarasikan sendiri field-nya (semua private).
 *
 * Tahap 4: simpan perjalanan di {@code List} dan cari lewat kode
 * dengan {@code Map}. Jangan memakai array.
 * Tahap 5: metode pembayaran diberikan dari luar lewat constructor. Jangan
 * membuat CashPayment di dalam kelas ini.
 */

public class RideDispatcher {
    private PaymentMethod payment;
    private List<Ride> orders;
    private Map<String, Ride> orderMap;

    public RideDispatcher(PaymentMethod payment){
        this.payment = payment;
        this.orders = new ArrayList<>();
        this.orderMap = new HashMap<>();
    }

    public void add(Ride order){
        if(order != null){
            orders.add(order);
            orderMap.put(order.getRideId(), order);
        }
    }

    public Ride findById(String rideId){
        return orderMap.get(rideId);
    }

    public int count(){
        return orders.size();
    }

    public List<Ride> getOrders(){
        return new ArrayList<>(orders);
    }

    public void checkout(String rideId){
        Ride order = findById(rideId);
        if (order != null && payment != null){
            payment.pay(order.getRideId(), order.calculateFare());
        }
    }
}