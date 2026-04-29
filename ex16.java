import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result16 implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "Not First Division";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result16 r = new Result16();
        System.out.println(r.getDivision(sc.nextDouble()));
        sc.close();
    }
}
