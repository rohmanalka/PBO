package Soal2;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Sport", 4, "1990");
        kendaraan.cetakInfo();
        System.out.println();

        Mobil mobil = new Mobil("SUV", 4, "2010", 4, "Bensin");
        mobil.cetakInfo();
        System.out.println();

        Supra supra = new Supra("Sedan", 4, "2020", 2, "Solar", "B 1234 ABC", 100);
        supra.tambahKecepatan(90);
        supra.kurangKecepatan(20);
        supra.cetakInfo();
    }
}
