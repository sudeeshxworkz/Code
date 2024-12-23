package org.xworkz.bankingapp;

import org.xworkz.bankingapp.bankac.BankingApplication;
import org.xworkz.bankingapp.currentac.CurrentAccount;
import org.xworkz.bankingapp.savingac.SavingsAccount;

public class Tester {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.interest=2.70;
        sa.credit(200000);
        System.out.println("Available balance: "+sa.getBalance());
        sa.credit(500);
        sa.calculateRateOfInterest();
        System.out.println("Available balance after Interest: "+sa.getBalance());
        System.out.println("-------------");

        CurrentAccount myAcc = new CurrentAccount();
        myAcc.credit(1000);
        myAcc.debit(500);
//        myAcc.interest = 5;

        System.out.println("Available Balance:"+myAcc.getBalance());
//        myAcc.calculateRateOfInterest();
        System.out.println("Available Balance after Interest:"+myAcc.getBalance());
        System.out.println("-------------");
        System.out.println("-------------");

        sa.transfer(myAcc,100000.00);
        System.out.println("SA Available Balance:  "+sa.getBalance());
        System.out.println("myAcc available balace:  "+myAcc.getBalance());


        sa.methodName();
    }
}
