package Polymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();
        v1.speedUp();
        v2.speedUp();
    }
}
