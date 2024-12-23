package org.xworkz.bankapp.rbi;

import org.xworkz.bankapp.bank.IciciBank;
import org.xworkz.bankapp.bank.SwissBank;
import org.xworkz.bankapp.bank.USSSBank;

public interface Rbi {

    void knowYourCustomer();
    void antiMoneyLaundering();
    void onlineTransactions();
    String notifications();
}
