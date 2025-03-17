package Classes.Inheritance;

public class ElectricBike extends Bike {
    public int power;
    public void electricBikeDetails(){
        super.bikeDetails();
        System.out.println("Electric Bike Power : "+ power + "\n");
    }
}
