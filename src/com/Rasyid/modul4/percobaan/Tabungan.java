package com.Rasyid.modul4.percobaan;

public class Tabungan {
    // Deklarasi atribut
    // Private karena agar tidak dapat langsung diakses oleh kelas lain
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    // Konstruktor tanpa access modifier karena sudah default dari kelasnya.
    Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }
}