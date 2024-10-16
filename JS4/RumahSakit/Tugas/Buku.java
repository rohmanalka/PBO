package RumahSakit.Tugas;

public class Buku {
    private String judul;
    private String pengarang;
    private String thnTerbit;
    private int stok;

    public Buku(String judul, String pengarang, String thnTerbit, int stok) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.thnTerbit = thnTerbit;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getThnTerbit() {
        return thnTerbit;
    }

    public void setThnTerbit(String thnTerbit) {
        this.thnTerbit = thnTerbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getInfo() {
        String info = "";
        info += "Judul          : " + this.judul + "\n";
        info += "Pengarang      : " + this.pengarang + "\n";
        info += "Tahun Terbit   : " + this.thnTerbit + "\n";
        info += "Stok buku      : " + this.stok;
        return info;
    }
}
