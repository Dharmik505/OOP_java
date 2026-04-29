import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        sc.close();
    }
}
