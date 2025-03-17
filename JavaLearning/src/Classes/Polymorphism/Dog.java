package Classes.Polymorphism;

public class Dog  extends Animal {

    @Override
    public void  speak(){
        System.out.println( this.getClass().getSimpleName() + " Speak " +  "Bhoo Bhoo");
    }
}
