package org.xworkz.bankapp.bank;

import org.xworkz.bankapp.rbi.Rbi;

public abstract class EximBank implements Rbi {

    public EximBank(long ab){
        System.out.println("Cons is invoked");
    }
    public EximBank(int a){
        System.out.println("Cons is invoked");
    }

    @Override
    public void knowYourCustomer() {
        System.out.println("We implement KYC");
    }

    @Override
    public void antiMoneyLaundering() {
        System.out.println("We implement AML");
    }

    @Override
    public void onlineTransactions() {
        System.out.println("We implement OT");

    }
}
