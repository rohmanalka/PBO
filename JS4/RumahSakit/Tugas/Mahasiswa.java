package RumahSakit.Tugas;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String telp;
    private ArrayList<Buku> DaftarPinjam;

    public Mahasiswa(String nama, String nim, String jurusan, String telp) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.telp = telp;
        this.DaftarPinjam = new ArrayList<Buku>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getInfo() {
        String info = "";
        info += "Nama      : " + this.nama + "\n";
        info += "NIM       : " + this.nim + "\n";
        info += "Jurusan   : " + this.jurusan + "\n";
        info += "No. Telp  : " + this.telp ;

        for (Buku buku : DaftarPinjam) {
            System.out.println("> " + buku.getJudul());
        }
        return info;
    }

    public void pinjamBuku(Buku buku) {
        if (DaftarPinjam.size() < 3 && buku.getStok() > 0) {
            DaftarPinjam.add(buku);
            buku.setStok(buku.getStok() - 1);
            System.out.println("Buku " + buku.getJudul() + " berhasil dipinjam");
        } else if (buku.getStok() == 0) {
            System.out.println("Buku " + buku.getJudul() + " sedang habis");
        } else {
            System.out.println("Maaf, Anda sudah mencapai batas maksimal peminjaman (3 buku)");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (DaftarPinjam.contains(buku)) {
            DaftarPinjam.remove(buku);
            buku.setStok(buku.getStok() + 1);
            System.out.println("Buku " + buku.getJudul() + " berhasil dikembalikan");
        } else {
            System.out.println("Anda belum meminjam buku ini.");
        }
    }
    // public void pinjamBuku(Buku buku) {
    //     if (DaftarPinjam.size() < 3) {
    //         DaftarPinjam.add(buku);
    //         System.out.println("Buku " + buku.getJudul() + " berhasil dipinjam");
    //     } else {
    //         System.out.println("Maaf, Anda sudah mencapai batas maksimal peminjaman (3 buku)");
    //     }
    // }

    // public void kembalikanBuku(Buku buku) {
    //     DaftarPinjam.remove(buku);
    //     System.out.println("Buku " + buku.getJudul() + " berhasil dikembalikan");
    // }
}
