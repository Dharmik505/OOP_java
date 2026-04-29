public class RectangleCompare {
    double width;
    double height;

    public RectangleCompare(double width, double height) {
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
        RectangleCompare r1 = new RectangleCompare(4, 40);
        RectangleCompare r2 = new RectangleCompare(3.5, 35.9);

        System.out.println(r1.width + " " + r1.height + " " + r1.getArea() + " " + r1.getPerimeter());
        System.out.println(r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("First rectangle is larger.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Second rectangle is larger.");
        } else {
            System.out.println("Both have the same area.");
        }
    }
}
