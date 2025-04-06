import Classes.Inheritance.*;
import Classes.Polymorphism.Overloading.Theater;
import Classes.Polymorphism.Overriding.Animal;
import Classes.Polymorphism.Overriding.Cat;
import Classes.Polymorphism.Overriding.Dog;

import java.util.ArrayList;


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
        interfaceConcept();
        sequenceCollection();

    }

    private static void sequenceCollection(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list:" + list);
        System.out.println("first list : "+ list.get(0));
        System.out.println("first list : "+ list.getFirst());
        System.out.println("last list : "+list.get(list.size()-1));
        System.out.println("last list : "+list.getLast());
        System.out.println("reverse list : "+list.reversed());
        System.out.println("after remove first list : "+list.removeFirst());
        System.out.println("after remove last " + list.removeLast());
        System.out.println("list: "+ list);

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

    private static void interfaceConcept(){
        Car c1 = new Car();
        Truck t1 = new Truck();
        c1.honk();
        c1.start();
        t1.start();
    }
}