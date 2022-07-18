public class BankAccount {
    private double checkingBalance;
    private double savebalance ;
    private static int accountCount=0;
    private static double accountsAmount=0;


    public BankAccount(){
        accountCount++;
        savebalance=0;
        checkingBalance=0;
    }

    public double get_saveBalance(){
        return savebalance;
    }

    public double getcheckingBalance(){
        return checkingBalance;

    }

    public void deposit(double amount, Boolean checkingaccount){
        if ( checkingaccount ){
            checkingBalance = checkingBalance + amount;
            accountsAmount += amount;
        }else {

            savebalance = savebalance + amount;
            accountsAmount += amount;

        }
    }
    public void withdraw(double amount, Boolean checkingaccount){
        if ( checkingaccount ){
            if (checkingBalance >= amount){
                checkingBalance = checkingBalance - amount;
                accountsAmount -= amount;
            }else{

                System.out.println(" insufficient funds");
                return;
            }

        }else {
            if (savebalance >= amount){
                savebalance = savebalance -amount;
                accountsAmount -= amount;
            }else{

                System.out.println(" insufficient funds");
                return;
            }



        }
    }

    public void displayAmount (){
        System.out.println(accountsAmount);
        System.out.println(checkingBalance);
        System.out.println(savebalance);


    }
}
