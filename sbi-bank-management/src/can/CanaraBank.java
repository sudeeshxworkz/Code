package can;

import com.bank.account.BankAccount;

public class CanaraBank {
    public static void main(String[] bank) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("9876543211234");
        account.setBalance(5000.75);
        account.setAccountHolderName("Bob");

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
    }
}
