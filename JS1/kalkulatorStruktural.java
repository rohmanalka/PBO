import java.util.Scanner;

public class kalkulatorStruktural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan angka1: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka2: ");
        int angka2 = sc.nextInt();

        int hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4: 
                if (angka2 == 0) {
                    System.out.println("Tidak bisa dibagi 0");
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        System.out.println("Hasil: " + hasil);
    }
}