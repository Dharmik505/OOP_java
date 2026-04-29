public class CmdException {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);
            System.out.println(num / den);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing arguments");
        }
    }
}
