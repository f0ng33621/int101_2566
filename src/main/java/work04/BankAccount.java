package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount (int number,Person owner){
        this.number = number;
        this.owner = owner;
        this.balance = 0;
    }
    public Person getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        }
        else {
            System.out.println("Deposit can't be less than 0");
        }
        return balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public void transfer(double amount,BankAccount account){
        withdraw(amount);
        account.deposit(amount);
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
