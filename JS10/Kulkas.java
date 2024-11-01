package JS10;

public class Kulkas extends AlatElektronik{
    private int jumlahPintu;

    public  Kulkas(int jumlahPintu, double harga, String merk, String warna) {
        super(harga, merk, warna);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "\nJumlah Pintu: "  + jumlahPintu;
        return info;
    }
}
