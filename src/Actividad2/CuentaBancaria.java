package Actividad2;

public class CuentaBancaria {
    String name;
    String lastName;
    int accountNumber;
    enum TypeAccount {SAVINGS, CHECKING};
    TypeAccount type;
    float accountBalance = 0;
    float monthlyInterestRate; 
    
    CuentaBancaria(String name, String lastName, int accountNumber, TypeAccount type, float monthlyInterestRate) {
        this.name = name;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.type = type;
        this.monthlyInterestRate = monthlyInterestRate;
    }
    
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Bank account number: " + accountNumber);
        System.out.println("Account balance: $" + accountBalance);
        System.out.println("Monthly interest rate: " + monthlyInterestRate + "%");
    }
    
    void checkBalance() {
        System.out.println("The actual balance is: $" + accountBalance);
    }
    
    boolean enterBalance(int value) {
        if (value > 0) {
            accountBalance = accountBalance + value;
            System.out.println("$" + value + " has been deposited into the account. The new balance is $" + accountBalance);
            return true;
        } else {
            System.out.println("The value to be entered must be greater than zero.");
            return false;
        }
    }
    
    boolean withdrawAmount(int value) {
        if ((value > 0) && (value <= accountBalance)) {
            accountBalance = accountBalance - value;
            System.out.println("$" + value + " has been withdrawn from the account. The new balance is $" + accountBalance);
            return true;
        } else {
            System.out.println("The amount to be withdrawn must be less than the current balance.");
            return false;
        }
    }

    void applyMonthlyInterest() {
        float interestAmount = accountBalance * (monthlyInterestRate / 100);
        accountBalance = accountBalance + interestAmount;
        System.out.println("Interest applied (" + monthlyInterestRate + "%). The new balance is $" + accountBalance);
    }
}