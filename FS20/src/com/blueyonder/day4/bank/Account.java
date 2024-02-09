package com.blueyonder.day4.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private long accountNumber;
    private @Getter Type type;
    private double balance;

    public void deposit(double amount)
    {
        balance+=amount;
    }

    public double showBalance()
    {
        return balance;
    }

    public boolean withdraw(double amount)
    {
        if(balance<amount)
            return false;
        balance-=amount;
        return true;
    }
}
