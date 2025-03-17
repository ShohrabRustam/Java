package Classes.Polymorphism.Overloading;

public class Theater {

    public void bookTicket(int ticketCount){
        System.out.println("Booked "+ ticketCount + " ticket/tickets.");
    }

    public void bookTicket(int ticketCount, String type){
        System.out.println("Booked "+ ticketCount + " ticket/tickets " + "Type : " + type );
    }

    public void bookTicket(int ticketCount, String type, int discount){
        System.out.println("Booked "+ ticketCount + " ticket/tickets " + "Type : " + type  + " Discount of " + discount + " rupees." );
    }
}
