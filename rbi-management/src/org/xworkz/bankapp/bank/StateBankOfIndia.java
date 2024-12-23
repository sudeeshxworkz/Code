package org.xworkz.bankapp.bank;

import org.xworkz.bankapp.rbi.Rbi;

public abstract class StateBankOfIndia implements Rbi {

    @Override
    public void knowYourCustomer() {
        System.out.println("We implement KYC");
    }

    @Override
    public void onlineTransactions() {
        System.out.println("We implement OT");

    }
    @Override
    public String notifications(){
        return "SBI Bank provide sms to our customers";
 }

    public abstract void savingsAcc811();
}
