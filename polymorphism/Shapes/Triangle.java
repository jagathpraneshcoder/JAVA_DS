package Polymorphism.Shapes;

public class Triangle extends Shapes{
    private double height,breadth;
    Triangle(double height,double breadth){
        this.height=height;
        this.breadth=breadth;
    }

    @Override
    double calculateArea(){
        return 0.5 * this.height * this.breadth;
    }
}
