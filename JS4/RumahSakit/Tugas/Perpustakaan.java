package RumahSakit.Tugas;

import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private String alamat;
    private ArrayList<Mahasiswa> DaftarMhs;
    private ArrayList<Buku> DaftarBuku;

    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.DaftarMhs = new ArrayList<Mahasiswa>();
        this.DaftarBuku = new ArrayList<Buku>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        DaftarMhs.add(mahasiswa);
        System.out.println("Mahasiswa " + mahasiswa.getNama() + " berhasil ditambahkan");
    }

    public void tambahBuku(Buku buku) {
        DaftarBuku.add(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan");
    }

    public void tampilkanBuku() {
        if (DaftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
        } else {
            for (Buku buku : DaftarBuku) {
                System.out.println(buku.getInfo());
            }
        }
    }
    
    public void tampilkanMahasiswa() {
        if (DaftarMhs.isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang terdaftar.");
        } else {
            for (Mahasiswa mahasiswa : DaftarMhs) {
                System.out.println(mahasiswa.getInfo());
            }
        }
    }

    public void pinjamBuku(Mahasiswa mahasiswa, Buku buku) {
        if (buku.getStok() > 0) {
            mahasiswa.pinjamBuku(buku);
            System.out.println("Mahasiswa " + mahasiswa.getNama() + " berhasil meminjam buku: " + buku.getJudul());
            System.out.println("Sisa stok buku " + buku.getJudul() + ": " + buku.getStok());
        } else {
            System.out.println("Maaf, buku " + buku.getJudul() + " sedang habis");
        }
    }
}
