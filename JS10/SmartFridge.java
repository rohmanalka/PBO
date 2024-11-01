package JS10;

public class SmartFridge extends Kulkas implements Audible{
private int volume;

public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
    super(jumlahPintu, harga, merk, warna);
    this.volume = volume;
}

public int getVolume() {
    return volume;
}

public void setVolume (int volume) {
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
    System.out.println("=== Smart Fridge ===");
    String info = super.getInfo();
    return info;
}
}