package Bank;

public class Account {
    public double balance;
}

class Main{
        public static void main(String[] args){
            Account account = new Account();
            account.balance = 50;
            System.out.println("Amount is :" + account.balance);
        }
}
