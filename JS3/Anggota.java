package jobsheet3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int uang) {
        if (uang <= 0) {
            System.out.println("Jumlah pinjaman harus lebih dari 0.");
        } else if (uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(int uang) {
        if (uang < 0) {
            System.out.println("Jumlah angsuran harus lebih dari 0.");
        } else if (uang < jumlahPinjaman * 0.1) {
            System.out.println("Angsuran minimal adalah 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= uang;
        }
    }
}
