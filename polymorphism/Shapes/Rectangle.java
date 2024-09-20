package Polymorphism.Shapes;

public class Rectangle extends Shapes{
    private double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    double calculateArea(){
        return this.length * this.breadth;
    }
}
