/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.entities.operation.policies;

import domain.entities.account.BankAccount;
import domain.exceptions.NotEnoughFundsException;

/**
 *
 * @author junior
 */
public class NoOverdraftWithdrawal {
    public static void check(BankAccount account, double amount) throws NotEnoughFundsException {
        double accountBalance = account.getBalance();
        
        if (amount > accountBalance) 
            throw new NotEnoughFundsException("Not enough funds");
    }
}
