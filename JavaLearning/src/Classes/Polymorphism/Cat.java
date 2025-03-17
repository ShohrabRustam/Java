package Classes.Polymorphism;

public class Cat  extends Animal {
    public void  speak(){
        System.out.println( this.getClass().getSimpleName() + " Speak " +  "Meau");
    }
}
