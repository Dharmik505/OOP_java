import java.util.Scanner;

class Shape {
    double d1;
    double d2;

    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    public void calculateArea() {
        System.out.println(0.5 * d1 * d2);
    }
}

class RectangleShape extends Shape {
    public void calculateArea() {
        System.out.println(d1 * d2);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        t.getData(sc.nextDouble(), sc.nextDouble());
        t.calculateArea();

        RectangleShape r = new RectangleShape();
        r.getData(sc.nextDouble(), sc.nextDouble());
        r.calculateArea();
        sc.close();
    }
}
