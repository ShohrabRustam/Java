package Classes.Polymorphism;

public class Dog  extends Animal {
    public void  speak(){
        System.out.println( this.getClass().getSimpleName() + " Speak " +  "Bhoo Bhoo");
    }
}
