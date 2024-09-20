package Polymorphism.Vehicle;

public class Bicycle extends Vehicle{
    @Override
    void speedUp(){
        speed+=2;
        System.out.println("Speed of Bicycle is"+speed);
    }
}
