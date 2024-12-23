package org.xworkz.bankingapp.bankac;

import org.xworkz.bankingapp.currentac.CurrentAccount;
import org.xworkz.bankingapp.savingac.SavingsAccount;

public class BankingApplication {
    private double balance ;

    public BankingApplication(){
        System.out.println("BankingApplication cons is invoked");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean debit(double amount){
        boolean isAmountDebited = false;
       if(balance >= amount){
           balance = balance - amount;
           isAmountDebited = true;
           System.out.println("Is Amount Debited:"+isAmountDebited);
           System.out.println("Balance:"+balance);
       }
       else{
           System.out.println("Amount is not debited");
       }
       return isAmountDebited;
    }

    public boolean credit(double amount){
        boolean isAmountCredited = false;
        if(amount > 0){
            balance = balance + amount;
            isAmountCredited = true;
            System.out.println("Is Amount Credited:"+isAmountCredited);
            System.out.println("Balance:"+balance);
        }
        else{
            System.out.println("Amount is not Credited");
        }
        return isAmountCredited;
    }
    public void transfer(BankingApplication beneficiaryAccount, double amount){
        this.debit(amount);
       // BankingApplication beneficiaryAccount = new CurrentAccount();

        beneficiaryAccount.credit(amount);
    }
    public void methodName(){
        System.out.println("Hi");
    }

}
