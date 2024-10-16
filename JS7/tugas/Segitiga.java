package tugas;

public class Segitiga {
    int sudut = 180;

    public void totalSudut(int sudutA) {
        System.out.println("Total sudut: " + (sudut - sudutA));
    }

    public void totalSudut(int sudutA, int sudutB) {
        System.out.println("Total susut: " + (sudut - (sudutA + sudutB)));
    }

    public void keliling(int sisiA, int sisiB, int sisiC) {
        System.out.println("Keliling: " + (sisiA + sisiB + sisiC));
    }

    public void keliling(double sisiA, double sisiB) {
        double kuadratSisiA = Math.pow(sisiA, 2);
        double kuadratSisiB = Math.pow(sisiB, 2);

        double jumlahKuadrat = kuadratSisiA + kuadratSisiB;
        double sisiC = Math.sqrt(jumlahKuadrat);

        System.out.println("Sisi C: " + sisiC);
    }

    public static void main(String[] args) {
        Segitiga sg1 = new Segitiga();
        Segitiga sg2 = new Segitiga();

        sg1.totalSudut(90);
        sg1.totalSudut(90, 45);

        sg2.keliling(6, 9, 9);
        sg2.keliling(3, 4);
    }
}
