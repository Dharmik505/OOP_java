import java.util.Scanner;

public class VolumeCalculator {
    public void calculateVolume(double side) {
        System.out.println(side * side * side);
    }

    public void calculateVolume(double length, double width, double height) {
        System.out.println(length * width * height);
    }

    public void calculateVolume(float radius) {
        System.out.println((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        vc.calculateVolume(sc.nextDouble());
        vc.calculateVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        vc.calculateVolume(sc.nextFloat());
        sc.close();
    }
}
