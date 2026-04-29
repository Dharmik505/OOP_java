import java.util.Scanner;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false;
            if (Character.isDigit(c)) digitCount++;
        }
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isValidPassword(sc.next())) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        sc.close();
    }
}
