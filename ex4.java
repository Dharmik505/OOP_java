import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightPounds = sc.nextDouble();
        double heightInches = sc.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println(bmi);
        sc.close();
    }
}
