package org.xworkz.bankapp;

import org.xworkz.bankapp.bank.*;
import org.xworkz.bankapp.rbi.Rbi;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main Started");

       Rbi rbi = new IciciBank();
       rbi.knowYourCustomer();

       Rbi ref = new IciciBank();
       String notification = ref.notifications();
       System.out.println(notification);

       Rbi ref1 = new StateBankOfIndiaBangalore();
       ref1.antiMoneyLaundering();






        System.out.println("Main Ended");
    }
}
