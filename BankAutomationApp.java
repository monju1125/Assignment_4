public class BankAutomationApp {
    public static void main(String[] args) {
        updateAccountBalance(39800.50, 1000.00, 500.25);
    }
    public static void updateAccountBalance(double savingAccountBalance,
                                            double indexFundBalance,
                                            double depositeAmmount) {
        System.out.println("\nPyment Received: $" +depositeAmmount);
        if ( savingAccountBalance >= 50000.00 ){
            indexFundBalance += depositeAmmount;
            String output =  String.format("%.2f" , indexFundBalance);
            System.out.println("\nIndex fund balance is updated. New Balance: $" + output);
        }
        else if ( (savingAccountBalance <= 50000.00 ) && (savingAccountBalance + depositeAmmount) > 50000.00 )
        {
                double additionalFund = (savingAccountBalance + depositeAmmount) - 50000;
                indexFundBalance += additionalFund;
                savingAccountBalance = 50000.00;
                String output1 =  String.format("%.2f " , savingAccountBalance);
                String output2 =  String.format("%.2f" , indexFundBalance);
                System.out.println("\nSavings account balance is updated. New Balance: $" +output1);
                System.out.println("\nIndex Fund  updated. New Balance: $" +output2);
        }
        else if((savingAccountBalance + depositeAmmount) <= 50000.00)  {
                savingAccountBalance += depositeAmmount;
                String output3 =  String.format("%.2f" , savingAccountBalance);
                System.out.println("\nSavings account balance is updated. New Balance: $" +output3);
            }
            else {
                System.out.println("invalid entry");
            }
    }
}
