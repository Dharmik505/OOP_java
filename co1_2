import java.util.Scanner;

public class AddOneToDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "";
        String s = String.valueOf(num);
        
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            result += (digit + 1) % 10;
        }
        
        System.out.println(result);
        sc.close();
    }
}
