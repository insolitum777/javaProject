package objects;

public class BankAccount {
    String accountNumber;
    String accountHolderName;

    double balance;
    double dailyWithdrawLimit = 5000;
    double getDailyWithdrawedAmount;


    public boolean withdraw(double amount) {
        if (amount < dailyWithdrawLimit) {
            System.out.println("The daily withdrawal limit should not exceed 5000$");
            return false;

        }
        if (amount <= balance) {
            System.out.println("The balance is sufficient");
            return false;

        }
        if (amount > 0 && amount <= balance && amount <= dailyWithdrawLimit && getDailyWithdrawedAmount +
                amount <= dailyWithdrawLimit) {
            System.out.println("Transaction is approved. Withdrawing:" + amount + "$");
            balance -= amount;
            getDailyWithdrawedAmount += amount;
            return true;
        } else
            System.out.println("Something happened ! Failed to withdraw. Please try again");
        return false;
    }


    public void setAccountNumber(String accountNumber) {    //  "89632145"
        boolean isValidAccountNumber = true;

        if (accountNumber.length() == 8) {
            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                    break;
                }
            }
        } else {
            System.out.println("WARNING: The length of account number must be 8");
            isValidAccountNumber = false;
        }
        //Log message - is a message of developer for developer/user, which tells what is going on in the application

        if (isValidAccountNumber) {
            System.out.println("SUCCESSFUL, account number is valid.");
            this.accountNumber = accountNumber;
        } else {
            System.out.println("FAILURE: The provided account number is not valid");
        }

    }


}



