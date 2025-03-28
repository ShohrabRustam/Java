package Classes.Inheritance;

import Interface.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start(){
        System.out.printf("Truck has been start\n");
    }
}
