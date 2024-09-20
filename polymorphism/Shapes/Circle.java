package Polymorphism.Shapes;

public class Circle extends Shapes{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calculateArea(){
        return 3.14 * radius *radius;
    }
}
