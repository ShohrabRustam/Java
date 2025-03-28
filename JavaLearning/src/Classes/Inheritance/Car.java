package Classes.Inheritance;


import Interface.Vehicle;

public class Car implements Vehicle {
    public String brand;
    public Integer speed;
    public String color;

    @Override
    public void start(){
        System.out.printf("Car has been start\n");
        System.out.printf("Car Brand "+ brand + " \n");
        System.out.printf("Car speed "+ speed + " \n");
        System.out.printf("Car Color "+ color + " \n");

    }
}
