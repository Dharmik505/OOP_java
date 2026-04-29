package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(rollNo + " " + name);
    }
}

package exam;
import student.Student;
import java.util.Scanner;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        System.out.println(total);
        System.out.println(total / 3.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        r.displayResult();
        sc.close();
    }
}
