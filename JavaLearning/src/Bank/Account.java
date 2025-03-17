package Bank;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class Main{
        public static void main(String[] args){
            Account account = new Account();
            account.setBalance(50);
            System.out.println("Amount is :" + account.getBalance());
        }
}
