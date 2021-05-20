package Lectia11.Ex4;

public class Square extends Shape{
    double side;

    Square(double side){
        this.side=side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }
}
