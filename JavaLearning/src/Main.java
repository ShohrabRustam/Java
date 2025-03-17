import Classes.Inheritance.*;

public class Main {
    public static void main(String[] args) {
        classObj();
        inheitance();
        multiInheitance();
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
}