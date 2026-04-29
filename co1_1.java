import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] notes = {100, 50, 10, 5, 2, 1};
        
        for (int note : notes) {
            if (amount >= note) {
                System.out.println(note + " : " + (amount / note));
                amount = amount % note;
            }
        }
        sc.close();
    }
}
