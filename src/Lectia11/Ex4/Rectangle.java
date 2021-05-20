package Lectia11.Ex4;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width*height;
    }
}
