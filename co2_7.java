import java.util.Scanner;

public class LoanCalculator {
    public void calculateEMI(int principal, int time, float rate) {
        double r = rate / 12 / 100;
        double emi = (principal * r * Math.pow(1 + r, time)) / (Math.pow(1 + r, time) - 1);
        System.out.println(emi);
    }

    public void calculateEMI(double principal, int time, double rate) {
        double r = rate / 12 / 100;
        double emi = (principal * r * Math.pow(1 + r, time)) / (Math.pow(1 + r, time) - 1);
        System.out.println(emi);
    }

    public void calculateEMI(int principal, int time) {
        double r = 0.10 / 12;
        double emi = (principal * r * Math.pow(1 + r, time)) / (Math.pow(1 + r, time) - 1);
        System.out.println(emi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator lc = new LoanCalculator();
        
        lc.calculateEMI(sc.nextInt(), sc.nextInt(), sc.nextFloat());
        lc.calculateEMI(sc.nextDouble(), sc.nextInt(), sc.nextDouble());
        lc.calculateEMI(sc.nextInt(), sc.nextInt());
        sc.close();
    }
}
