package Classes.Polymorphism.Overriding;

public class Cat  extends Animal {

    @Override
    public void  speak(){
        System.out.println( this.getClass().getSimpleName() + " Speak " +  "Meau");
    }
}
