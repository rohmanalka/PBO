public class Laptop {
    public String merk;
    public String tipe;
    public String memori;
    public String ram;
    public String warna;

    public void kirimPesan(String pesan) {
        System.out.println("Pesan : " + pesan);
    }

    public void displayInfo() {
        System.out.println("Merk    : " + merk);
        System.out.println("Tipe    : " + tipe);
        System.out.println("Memori  : " + memori);
        System.out.println("Ram     : " + ram);
        System.out.println("Warna   : " + warna);
    }
}