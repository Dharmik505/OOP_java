import java.util.Scanner;

public class ExceptionDemo {
    public static void average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;
        for (String val : values) {
            if (val == null) throw new NullPointerException();
            sum += Double.parseDouble(val);
        }
        System.out.println(sum / values.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = {sc.next(), sc.next(), sc.next()};
        String[] arr2 = {sc.next(), null};
        
        try {
            average(arr1);
            average(arr2);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Done");
        }
        sc.close();
    }
}
