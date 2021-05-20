package Lectia11.Ex4;

public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
}
