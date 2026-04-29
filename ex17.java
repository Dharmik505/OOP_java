import java.util.Scanner;

interface Exam {
    boolean isPassed(int mark);
}

interface ClassifyMultiple {
    String getDivision(double average);
}

class FinalResult implements Exam, ClassifyMultiple {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else {
            return "Third Division";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalResult fr = new FinalResult();
        System.out.println(fr.isPassed(sc.nextInt()));
        System.out.println(fr.getDivision(sc.nextDouble()));
        sc.close();
    }
}
