package Soal2;

public class Kendaraan {
    public String jenis;
    public int jmlRoda;
    public String tahun;

    public Kendaraan() {

    }

    public Kendaraan(String jenis, int jmlRoda, String tahun) {
        this.jenis = jenis;
        this.jmlRoda = jmlRoda;
        this.tahun = tahun;
    }

    public void cetakInfo() {
        String info = "";
        info += "Jenis       : " + jenis + "\n";
        info += "Jumlah Roda : " + jmlRoda + "\n";
        info += "Tahun       : " + tahun;
        System.out.println(info);
    }
}