import java.util.Scanner;

public class VotingApp {
    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            checkEligibility(sc.nextInt());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
        sc.close();
    }
}
