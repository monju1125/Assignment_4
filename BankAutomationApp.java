public class BankAutomationApp {
    public static void main(String[] args) {
        updateAccountBalance(39000.50, 1000.00, 500.25);
    }
    public static void updateAccountBalance(double savingAccountBalance,
                                            double indexFundBalance,
                                            double depositeAmmount) {
        System.out.println("\nPyment Received: $" +depositeAmmount);
        if (savingAccountBalance > 50000.00){
            indexFundBalance += depositeAmmount;
            String output =  String.format("%.2f" , indexFundBalance);
            System.out.println("\nIndex fund balance is updated. New Balance: $" + output);
        } else  {
            savingAccountBalance += depositeAmmount;
            String output =  String.format("%.2f" , savingAccountBalance);
            System.out.println("Savings account balance is updated. New Balance: $" + output);
        }
    }
}
