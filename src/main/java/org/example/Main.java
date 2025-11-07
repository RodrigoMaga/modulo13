package org.example;


import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());




//        Account acc1 = new Account(1001, "Alex", 1000.0);
//        acc1.withdraw(200.0);
//        System.out.println(acc1.getBalance());
//
//        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        acc2.withdraw(200.0);
//        System.out.println(acc2.getBalance());
//
//        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
//        acc3.withdraw(200.0);
//        System.out.println(acc3.getBalance());


//        Account acc = new Account(1001, "alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.00);
//
//        //UPCASTING
//
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//
//        //DOWNCASTING
//
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
////        BusinessAccount acc5 = (BusinessAccount) acc3;
//        if (acc3 instanceof BusinessAccount) {
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//        }
//
//        if (acc3 instanceof SavingsAccount) {
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }

    }
}
