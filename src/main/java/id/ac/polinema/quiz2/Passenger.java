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
    private String code;
    private String name;

    public Passenger(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
}
