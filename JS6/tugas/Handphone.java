package tugas;

public class Handphone extends Perangkat {
    public String layar;
    public String memori;
    public int volume;

    public Handphone() {
        super();
        this.layar = "Unknown";
        this.memori = "Unknown";
        this.volume = 0;
    }

    public Handphone(String nama, String merk, double harga, String layar, String memori, int volume) {
        super(nama, merk, harga);
        this.layar = layar;
        this.memori = memori;
        this.volume = volume;
    }

    public void ambilFoto() {
        System.out.println("Berhasil memfoto");
    }

    public int tambahVolume(int increment) {
        volume += increment;
        if (volume > 100) {
            volume = 100;
            System.out.println("volume full");
        } else if (volume < 0) {
            volume = 0;
            System.out.println("volume nol");
        }
        System.out.println("Volume bertambah menjadi " + volume);
        return volume;
    }

    public int kurangVolume(int decrement) {
        volume -= decrement;
        if (volume > 100) {
            volume = 100;
            System.out.println("volume full");
        } else if (volume < 0) {
            volume = 0;
            System.out.println("volume nol");
        }
        System.out.println("Volume bertambah menjadi " + volume);
        return volume;
    }

    public String getInfoHp() {
        return "Layar      : " + this.layar + "\n" +
               "Memori     : " + this.memori + "\n" +
               "Volume     : " + this.volume;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfoHp();

        return info;
    }
}
