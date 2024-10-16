package Soal2;

public class Supra extends Mobil {
    public String plat;
    public int kecepatan;

    public Supra() {

    }

    public Supra(String jenis, int jmlRoda, String tahun, int jmlPintu, String bahanBakar, String plat, int kecepatan) {
        super(jenis, jmlRoda, tahun, jmlPintu, bahanBakar);
        this.plat = plat;
        this.kecepatan = kecepatan;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void kurangKecepatan(int decrement) {
        kecepatan -= decrement;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Plat nomor  : " + plat);
        System.out.println("Kecepatan   : " + kecepatan + " km/jam");
    }
}