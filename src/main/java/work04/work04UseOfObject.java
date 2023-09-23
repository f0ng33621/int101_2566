package work04;
import work04.*;
public class work04UseOfObject {
public static void main(String[] args) {
    Person A = new Person(1);
    System.out.println(A.getId());
    System.out.println(A.toString());
    Person B = A;
    Person C = new Person(3);
    B.setId(2);
    System.out.println(B.getId());
    System.out.println(C.getId());
    System.out.println(B.toString());
    System.out.println(C.toString());
    System.out.println("---------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println("Start of BankAccount");
    BankAccount T1 = new BankAccount(001,C);
    BankAccount T2 = new BankAccount(002,B);
    System.out.println("Owner is " + T1.getOwner());
    System.out.println("T1 Account Balance : " + T1.getBalance());
    T1.deposit(10000);
    System.out.println("T1 Account Balance : " + T1.getBalance());
    T1.withdraw(2000);
    System.out.println("T1 Account Balance : " + T1.getBalance());
    T1.transfer(6000,T2);
    System.out.println("T1 Account Balance : " + T1.getBalance());
    System.out.println("T2 Account Balance : "+ T2.getBalance());
    System.out.println(T1.toString());
    System.out.println(T2.toString());
    T2.deposit(2000);
    T1.withdraw(1000);
    System.out.println("T1 Account Balance : " +T1.getBalance());
    T1.deposit(20000);
    T1.deposit(-1000); // Test check amount statement if amount > 0 print can't deposit
    System.out.println("T2 Account Balance : "+T2.getBalance());
    System.out.println("T1 Account Balance : " +T1.getBalance());
    }

}
