package tugas;

public class Perangkat {
    public String nama;
    public String merk;
    public double harga;
    public boolean hidup;

    public Perangkat() {
        System.out.println("====================");
    }

    public Perangkat(String nama, String merk, double harga) {
        System.out.println("====================");
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public boolean hidupkan () {
        hidup = true;
        System.out.println("Perangkat nyala");
        return hidup;

    }

    public boolean matikan () {
        hidup = false;
        System.out.println("Perangkat mati");
        return hidup;
    }

    public String getInfo() {
        String info = "";
        info += "Nama       : " + nama + "\n";
        info += "Merk       : " + merk + "\n";
        info += "Harga      : " + harga + "\n";

        return info;
    }
}
