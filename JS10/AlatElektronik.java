package JS10;

public class AlatElektronik {
    private double harga;
    private String merk;
    private String warna;

    public AlatElektronik(double harga, String merk, String  warna) {
        this.harga = harga;
        this.merk = merk;
        this.warna = warna;
    } 

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public  void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getInfo() {
        String info = "";
        info += "Harga: " + harga + "\n";
        info += "Merk: " + merk + "\n";
        info += "Warna: " + warna;
        return info;
    }
}
