package Classes;

public class Bike extends Vehicle{
    public String color;

    public void bikeDetails() {
        super.displayVehicleDetails();
        System.out.println("Bike Color is : " + color + "\n");
    }
}
