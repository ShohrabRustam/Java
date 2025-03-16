import Classes.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "Red";
        c1.speed = 50;
        c1.start();
        System.out.println("Hello, World!");
    }
}