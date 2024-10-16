package tugas;
import java.util.Scanner;

public class Laptop extends Perangkat {
    public String prosesor;
    public String ram;
    public int kecerahan;
    Scanner sc = new Scanner(System.in);

    public Laptop() {
        super();
        this.prosesor = "Unknown";
        this.ram = "Unknown";
        this.kecerahan = 0;
    }

    public Laptop(String nama, String merk, double harga, String prosesor, String ram, int kecerahan) {
        super(nama, merk, harga);
        this.prosesor = prosesor;
        this.ram = ram;
        this.kecerahan = kecerahan;
    }

    public String mengirimPesan() {
        System.out.println("Kirim Pesan: ");
        String pesan = sc.next();
        return pesan;
    }

    public int tambahKecerahan(int increment) {
        kecerahan += increment;
        if (kecerahan > 100) {
            kecerahan = 100;
            System.out.println("Kecerahan full");
        } else if (kecerahan < 0) {
            kecerahan = 0;
            System.out.println("Kecerahan nol");
        }
        System.out.println("Kecerahan bertambah menjadi " + kecerahan);
        return kecerahan;
    }

    public int kurangKecerahan(int decrement) {
        kecerahan -= decrement;
        if (kecerahan > 100) {
            kecerahan = 100;
            System.out.println("Kecerahan full");
        } else if (kecerahan < 0) {
            kecerahan = 0;
            System.out.println("Kecerahan nol");
        }
        System.out.println("Kecerahan berkurang menjadi " + kecerahan);
        return kecerahan;
    }

    public String getInfoLp() {
        return "Prosesor   : " + this.prosesor + "\n" +
               "RAM        : " + this.ram + "\n" +
               "Kecerahan  : " + this.kecerahan;

    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfoLp();

        return info;
    }
}