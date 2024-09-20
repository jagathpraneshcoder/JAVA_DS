package Polymorphism.Vehicle;

public class Car extends Vehicle{
        @Override
        void speedUp(){
            speed+=10;
            System.out.println("Speed of Car is"+speed);
        }
}
