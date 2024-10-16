public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 2;
        pp.lebar = 4;

        pp.displayInfo();
        pp.getLuas();
        pp.getKeliling();
    }
}
