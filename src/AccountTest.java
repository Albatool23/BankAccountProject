public class AccountTest {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();



          account1.displayAmount();
        account2.displayAmount();


        account1.deposit(23,true);
        account1.deposit(600,true);

        account2.deposit(1000,false);

        account2.withdraw(100,false);




        System.out.println("Account1 Check Balance:" +account1.getCheckingBalance()  );
        System.out.println("Account2 Save Balance: " +account2.getSavebalance() );
        System.out.println("Numbers of Bank Accounts: : " +account2.getaccountCount() );
        System.out.println(" Accounts Amount: " +account1.getaccountsAmount() );






}

}



