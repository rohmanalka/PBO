package jobsheet3;

public class Motorens {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif");
        } else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak bolek lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("kecepatan maksimum hanya 100");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=======================");
    }
}