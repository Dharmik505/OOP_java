import java.util.Scanner;

class BaseEmployee {
    String name;
    String department;

    public BaseEmployee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println(name + " " + department);
    }
}

class Manager extends BaseEmployee {
    int teamSize;

    public Manager(String name, String department, int teamSize) {
        super(name, department);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(teamSize);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseEmployee emp = new BaseEmployee(sc.next(), sc.next());
        emp.displayDetails();

        BaseEmployee mgr = new Manager(sc.next(), sc.next(), sc.nextInt());
        mgr.displayDetails();
        sc.close();
    }
}
