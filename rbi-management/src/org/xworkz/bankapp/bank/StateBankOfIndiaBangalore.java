package org.xworkz.bankapp.bank;

public abstract class StateBankOfIndiaBangalore extends StateBankOfIndia, StateBankOfIndiaMysuru{


    @Override
    public void antiMoneyLaundering() {
        System.out.println("AML is applicable in Bangalore only");
    }
}
