public class DemoLaptop {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        lp1.merk = "Dell";
        lp1.tipe = "e5290";
        lp1.memori = "SSD 128";
        lp1.ram = "8";
        lp1.warna = "Hitam";

        lp1.displayInfo();
        lp1.kirimPesan("ini Laptop dell");
        System.out.println("=====================");

        Laptop lp2 = new Laptop();
        lp2.merk = "Asus";
        lp2.tipe = "TUF";
        lp2.memori = "Asus";
        lp2.ram = "Asus";
        lp2.warna = "Silver";

        lp2.displayInfo();
        lp2.kirimPesan("ini Laptop asus");
    }
}
