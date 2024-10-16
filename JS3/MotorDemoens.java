package jobsheet3;

public class MotorDemoens {
    public static void main(String[] args) {
        Motorens motor1 = new Motorens();
        motor1.displayStatus();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motorens motor2 = new Motorens();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(120);
        motor2.displayStatus();

        Motorens motor3 = new Motorens();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}
