package JS10;

public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(double harga, String merk, String warna, String jenis) {
        super(harga, merk, warna);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getInfo() {
        System.out.println("=== KIPAS ===");
        String info = super.getInfo();
        info += "\nJenis Kipas: "  + jenis;
        return info;
    }
}
