package tugas;

class Dosen extends Manusia {
    void lembur() {
        System.out.println("Dosen sedang lembur");
    }

    void makan() {
        System.out.println("Dosen sedang makan");
    }
}

class Mahasiswa extends Manusia {
    void tidur() {
        System.out.println("Mahasiswa tidur karna lelah");
    }

    void makan() {
        System.out.println("Mahasiswa sedang makan");
    }
}

public class Manusia {
    void bernafas() {
        System.out.println("Manusia bisa bernafas");
    }

    void makan() {
        System.out.println("Manusia bisa makan");
    }
    
    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        mns.makan();
        ds.makan();
        mhs.makan();
        System.out.println("==========");

        Manusia orang1 = new Dosen();
        orang1.makan();
        System.out.println("==========");

        Manusia orang2 = new Mahasiswa();
        orang2.makan();
    }
}