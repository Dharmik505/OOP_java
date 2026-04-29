import java.util.Scanner;

public class CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);

        if (D == 0) {
            System.out.println("Denominator is zero. The equation has no unique solution.");
        } else {
            double Dx = (e * d) - (b * f);
            double Dy = (a * f) - (c * e);
            double x = Dx / D;
            double y = Dy / D;
            System.out.println(x);
            System.out.println(y);
        }
        sc.close();
    }
}
