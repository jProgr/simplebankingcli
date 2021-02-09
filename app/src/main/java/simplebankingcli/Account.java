package simplebankingcli;

import java.util.UUID;

class Account
{
    private int balance;

    private int previousTransaction;

    private String customerName;

    private String customerId;

    public int getBalance()
    {
        return balance;
    }

    Account(String customerName)
    {
        this.customerName = customerName;
        this.customerId = UUID.randomUUID().toString();
    }

    void deposit(int amount)
    {
        balance = balance + amount;
        previousTransaction = amount;
    }

    void withdraw(int amount)
    {
        balance = balance - amount;
        previousTransaction = -amount;
    }

    void getPreviousTransaction()
    {
        System.out.println("Previous movement: " + previousTransaction);
    }
}
