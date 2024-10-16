package RumahSakit.Tugas;
import java.util.Scanner;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("BASDAT", "Rohman Alka", "2024", 4);
        Buku buku2 = new Buku("PBO", "Lutfi", "2023", 3);
        Buku buku3 = new Buku("JARKOM", "Wahyu", "2022", 5);
        Buku buku4 = new Buku("DASPRO", "Jeki", "2020", 3);

        Mahasiswa mahasiswa1 = new Mahasiswa("Alka", "23417", "Informatika", "087853478728");
        Mahasiswa mahasiswa2 = new Mahasiswa("Malik", "23416", "Sistem Informasi Bisnis", "081290348488");

        Perpustakaan perpus = new Perpustakaan("Perpustakaan POLINEMA", "Jl. Suhat");

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=====PILIHAN=====");
            System.out.println("1. Tambah Buku Perpus");
            System.out.println("2. Tambah Peminjam Perpus");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjam Perpus");
            System.out.println("6. Tampilkan Buku Perpus");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            System.out.println("=========================");

            switch (pilih) {
                case 1:
                    perpus.tambahBuku(buku1);
                    perpus.tambahBuku(buku2);
                    perpus.tambahBuku(buku3);
                    perpus.tambahBuku(buku4);
                    System.out.println("=========================");
                    break;
            
                case 2:
                    perpus.tambahMahasiswa(mahasiswa1);
                    perpus.tambahMahasiswa(mahasiswa2);
                    System.out.println("=========================");
                    break;

                case 3:
                    perpus.pinjamBuku(mahasiswa1, buku1);
                    perpus.pinjamBuku(mahasiswa1, buku2);
                    perpus.pinjamBuku(mahasiswa1, buku3);
                    perpus.pinjamBuku(mahasiswa1, buku4);
                    perpus.pinjamBuku(mahasiswa2, buku2);
                    break;

                case 4:
                    mahasiswa1.kembalikanBuku(buku1);
                    break;

                case 5:
                    perpus.tampilkanMahasiswa();
                    System.out.println("=========================");
                    break;

                case 6:
                    perpus.tampilkanBuku();
                    System.out.println("=========================");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
    }
}