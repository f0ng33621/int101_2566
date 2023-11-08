package work03;

import work02.Person;

import static work01.Utilitor.computeIsbn10;
import static work01.Utilitor.testPositive;

public class Account {
    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException("Null can't be set");
        }
        this.owner = owner;
        balance = 0.0;
        long result = computeIsbn10(nextNo);
        if(result == 10){
            do {
                nextNo++;
                result = computeIsbn10(nextNo);
            } while (result == 10);
        }
        no = 10*nextNo+result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (testPositive(amount) == amount) {
            balance += amount;
        } else {
            throw new IllegalArgumentException();
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (testPositive(amount) == amount) {
            try{
                balance -= amount;
                testPositive(balance);
            }catch (IllegalArgumentException e){
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
        return balance;
    }

    public void transfer(double amount, Account account) {
        if (account == null) {
            throw new IllegalArgumentException();
        }
        try {
            withdraw(amount);
            account.deposit(amount);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString(){
        return "Account(no: "+no+" balance:"+balance+")";
    }
    public boolean equals(Account in){
        var current = this;
        return current == in;
    }
}
