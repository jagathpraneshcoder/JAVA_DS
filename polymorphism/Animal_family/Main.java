package JAVA_OOPS.Polymorphism.Animal_family;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Animal bir = new Bird();
        Animal cat = new Cat();

        ani.sound();
        cat.sound();
        bir.sound();
    }
}