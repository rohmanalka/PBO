package tugas;
import java.util.Scanner;

public class PerangkatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\n==========MENU==========");
            System.out.println("1. Opsi tanpa parameter");
            System.out.println("2. Opsi dengan parameter");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    Laptop laptop1 = new Laptop();
                    laptop1.hidupkan();
                    laptop1.nama = "ROG";
                    laptop1.merk = "Asus";
                    laptop1.harga = 24000000;
                    laptop1.prosesor = "Intel Core i9";
                    laptop1.ram = "32gb";
                    laptop1.kecerahan = 20;
                    System.out.println("Kecerahan: " + laptop1.kecerahan);
                    laptop1.tambahKecerahan(80);
                    laptop1.kurangKecerahan(50);
                    laptop1.matikan();
                    System.out.println(laptop1.getAllInfo());

                    Handphone hp1 = new Handphone();
                    hp1.hidupkan();
                    hp1.nama = "Redmi 13 Pro";
                    hp1.merk = "Xiaomi";
                    hp1.harga = 3000000;
                    hp1.layar = "Amoled";
                    hp1.memori = "256gb";
                    hp1.volume = 20;
                    System.out.println("Volume: " + hp1.volume);
                    hp1.tambahVolume(80);
                    hp1.kurangVolume(50);
                    hp1.matikan();
                    System.out.println(hp1.getAllInfo());
                    break;
            
                case 2:
                    Laptop laptop2 = new Laptop("Asus", "ROG", 15000000, "Intel Core i9", "16GB", 80);
                    laptop2.hidupkan();
                    System.out.println("Kecerahan: " + laptop2.kecerahan);
                    laptop2.tambahKecerahan(20);
                    laptop2.kurangKecerahan(100);
                    laptop2.matikan();
                    System.out.println(laptop2.getAllInfo());

                    Handphone hp2 = new Handphone("Redmi 13 Pro", "Xiaomi", 3000000, "Amoled", "256GB", 50);
                    hp2.hidupkan();
                    System.out.println("Volume: " + hp2.volume);
                    hp2.tambahVolume(50);
                    hp2.kurangVolume(100);
                    hp2.matikan();
                    System.out.println(hp2.getAllInfo());
                    break;

                case 3:
                    System.out.println("Terimakasih");
                default:
                    break;
            }
        } while (pilih != 3);
    }
}