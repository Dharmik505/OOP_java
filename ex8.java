import java.util.Scanner;

public class Point {
    int x;
    int y;

    public Point() {
        x = 5;
        y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.println(x + ", " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        p2.display();

        Point p3 = new Point(p2);
        p3.display();
        sc.close();
    }
}
