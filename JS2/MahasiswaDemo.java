public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();
        System.out.println("===============================");

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023412";
        m2.nama = "Muhammad Rohman";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2C";

        m2.displayBiodata();
        System.out.println("===============================");

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023409";
        m3.nama = "Lutfi";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2C";

        m3.displayBiodata();
    }
}