public class University {
    static int totalStudents = 0;
    static String universityName;

    static {
        universityName = "GTU";
        System.out.println(universityName);
    }

    {
        totalStudents++;
        System.out.println("Object created");
    }

    public static void getTotalStudents() {
        System.out.println(totalStudents);
    }

    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        University.getTotalStudents();
    }
}
