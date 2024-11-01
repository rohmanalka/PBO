package JS10;

public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String merk, String warna) {
        super(harga, merk, warna);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int vol) {
        this.volume += vol;
    }

    @Override
    public void turunkanVolume(int vol) {
        this.volume -= vol;
    }

    public String getInfo() {
        System.out.println("=== TV ===");
        String info = super.getInfo();
        info += "\nJenis Layar: "  + jenisLayar;
        return info;
    }
}
