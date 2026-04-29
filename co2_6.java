import java.util.Scanner;

public class BillGenerator {
    public void generateBill(int itemTotal) {
        System.out.println(itemTotal);
    }

    public void generateBill(int itemTotal, int discount) {
        System.out.println(itemTotal - discount);
    }

    public void generateBill(int itemTotal, double discountPercent) {
        System.out.println(itemTotal - (itemTotal * discountPercent / 100));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();
        
        bg.generateBill(sc.nextInt());
        bg.generateBill(sc.nextInt(), sc.nextInt());
        bg.generateBill(sc.nextInt(), sc.nextDouble());
        sc.close();
    }
}
