import java.util.Scanner;

public class College {
    String collegeName;

    public College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            studentName = sc.nextLine();
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println(studentName);
            System.out.println(course);
            System.out.println(collegeName);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College col = new College(sc.nextLine());
        College.Admission adm = col.new Admission();
        adm.acceptDetails();
        adm.displayDetails();
    }
}
