import Classes.Inheritance.*;
import Classes.Polymorphism.Overloading.Theater;
import Classes.Polymorphism.Overriding.Animal;
import Classes.Polymorphism.Overriding.Cat;
import Classes.Polymorphism.Overriding.Dog;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;



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
        try {
            thread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void sequenceCollection(){
        arrayList();
        linedHashSet();
        linkedHashMap();

    }

    private static void arrayList(){
        LinkedHashSet set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set: " + set);
        System.out.println("first set : "+ set.getFirst());
        System.out.println("last set : "+set.getLast());
        System.out.println("reverse set : "+set.reversed());
    }

    private static void linedHashSet(){
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

    private static void linkedHashMap(){
        LinkedHashMap map = new LinkedHashMap<>();
        map.put(1,2);
        map.put(1,2);
        map.put(3,2);
        map.put("Data",2);

        System.out.println("set: " + map.firstEntry());
        System.out.println("first set : "+ map.lastEntry());
        System.out.println("map reverse : "+ map.reversed());
        System.out.println("sequencedKeySet set : "+ map.sequencedKeySet());
        System.out.println("sequencedValues set : "+ map.sequencedValues());
        System.out.println("sequencedEntrySet : "+ map.sequencedEntrySet());

    }
    private static void thread() throws InterruptedException {
        final int threadCount = 1000;
        List<Thread> threads = new ArrayList<>();
        Runnable runnable = () ->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for(int i=0;i<threadCount;i++){
            Thread thread =  new Thread(runnable);
            thread.setName("Thread-:" + i);
            thread.start();
            threads.add(thread);
        }

        for(Thread thread : threads){
            thread.join();
            System.out.println(String.format("Completed : %s", thread.getName()));}

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