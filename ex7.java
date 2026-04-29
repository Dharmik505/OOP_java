import java.util.Scanner;

public class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        employeeName = sc.nextLine();
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println(employeeName);
        System.out.println(employeeSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
