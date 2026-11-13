package id.ac.polinema.quiz2;

/**
 * TAHAP 1 (pemanasan): penumpang yang membuat pesanan.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)} dengan kode yang benar).
 * Jangan mengubah nama kelas, nama method, atau signature-nya.
 *
 * Deklarasikan sendiri field-nya sesuai diagram kelas di README.
 * Semua field harus private.
 */
// Pertahankan baris package bawaan file aslinya di sini

public class Passenger {
    private String passengerId;
    private String name;

    public Passenger(String passengerId, String name){
        this.passengerId = passengerId;
        this.name = name;
    }

    public String getPassengerId(){
        return passengerId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
    }
}