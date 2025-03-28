package Interface;

public interface Vehicle {
    void start();
    default void honk(){
        System.out.println("Vehicle Honk!!");
    }
}
