package org.xworkz.bankingapp.savingac;

import org.xworkz.bankingapp.bankac.BankingApplication;

public class SavingsAccount extends BankingApplication {
    public SavingsAccount(){
        System.out.println("SavingsAccount cons is invoked");
    }
    public double interest;

    public SavingsAccount(double minBalance){

        super.setBalance(minBalance);
    }
    public SavingsAccount(double interest , double minBalance){
        this.interest = interest;
        setBalance(minBalance);
    }
    public void calculateRateOfInterest(){
        double calculatedRateOfInterest = (getBalance()*interest)/100;
       super.credit(calculatedRateOfInterest);
    }
}
