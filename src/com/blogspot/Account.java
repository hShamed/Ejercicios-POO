/*
*   Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia.
*   La clase contendrá un constructor por defecto, un constructor con parámetros,
*   un constructor copia y los métodos getters y setters.
*/

package com.blogspot;

public class Account {
    private String fullName;
    private String accountNumber;
    private double rateInterest;
    private double balance;

    // Default constructor
    public Account() {}

    // Parameterized constructor
    public Account(String fullName, String accountNumber, double rateInterest, double balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.rateInterest = rateInterest;
        this.balance = balance;
    }

    // Copy constructor
    public Account(Account account) {
        this.fullName = account.fullName;
        this.accountNumber = account.accountNumber;
        this.rateInterest = account.rateInterest;;
        this.balance = account.balance;;
    }

    public boolean pay(double balance) {
        if (balance > 0) {
            this.balance += balance;
            return true;
        }

        return false;
    }

    public boolean repay(double balance) {
        if (this.balance != 0) {
            if (balance > 0) {
                this.balance -= balance;
                return true;
            }
        }

        return false;
    }

    public boolean transfer(Account account, double balance) {
        if (this.balance != 0) {
            if (balance > 0) {
                this.balance -= balance;
                account.balance += balance;

                return true;
            }
        }

        return false;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getRateInterest() {
        return rateInterest;
    }

    public void setRateInterest(double rateInterest) {
        this.rateInterest = rateInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
