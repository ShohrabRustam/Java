import Classes.Inheritance.*;
import Classes.Polymorphism.Overloading.Theater;
import Classes.Polymorphism.Overriding.Animal;
import Classes.Polymorphism.Overriding.Cat;
import Classes.Polymorphism.Overriding.Dog;


public class Main {
    public static void main(String[] args) {
        classObj();
        inheitance();
        multiInheitance();
        polymorphism();
        bookTicket(5);
        Thread t = new Thread();
        t.start();
        System.out.println(t.getState());

    }

    private static void classObj(){
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "Red";
        c1.speed = 50;
        c1.start();
    }


    private  static void inheitance(){
        Bike eb1 = new Bike();
        eb1. speed= 50;
        eb1.color = "Black";
        eb1.bikeDetails();

    }

    private  static void multiInheitance(){
        ElectricBike eb1 = new ElectricBike();
        eb1. speed= 50;
        eb1.color = "Black";
        eb1.power = 10;
        eb1.electricBikeDetails();
    }

    private  static void polymorphism(){
        Animal a1 = new Cat();
        a1.speak();
        Animal a2 = new Dog();
        a2.speak();
    }


    private  static void bookTicket(int numberOfTicket){
        Theater t1 = new Theater();
        t1.bookTicket(numberOfTicket);
        t1.bookTicket(numberOfTicket *2,"VIP");
        t1.bookTicket(numberOfTicket * 3, "VIP", 100);
    }
}