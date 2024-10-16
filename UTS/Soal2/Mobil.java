package Soal2;

public class Mobil extends Kendaraan{
    public int jmlPintu;
    public String bahanBakar;

    public Mobil() {

    }

    public Mobil(String jenis, int jmlRoda, String tahun, int jmlPintu, String bahanBakar) {
        super(jenis, jmlRoda, tahun);
        this.jmlPintu = jmlPintu;
        this.bahanBakar = bahanBakar;
    }    

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jmlPintu);
        System.out.println("Bahan Bakar : " + bahanBakar);
    }
}
