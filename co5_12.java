import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
    }
}

class FinalOrder extends PartialOrder {
    public void cancelOrder(int orderId) {
        System.out.println(orderId);
    }

    public void generateBill() {
        System.out.println(item + " " + qty);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder fo = new FinalOrder();
        fo.placeOrder(sc.next(), sc.nextInt());
        int choice = sc.nextInt();
        
        if (choice == 1) {
            fo.generateBill();
        } else {
            fo.cancelOrder(sc.nextInt());
        }
        sc.close();
    }
}
