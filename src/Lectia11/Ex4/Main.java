package Lectia11.Ex4;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5);
        Circle circle = new Circle(5);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(triangle.area());
        System.out.println(circle.area());
        System.out.println(square.area());
        System.out.println(rectangle.area());
    }
}
