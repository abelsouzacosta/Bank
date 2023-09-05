/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.entities.operation;

import application.exceptions.NegativeAmountException;
import domain.entities.account.BankAccount;
import domain.utils.ValidationUtils;

/**
 *
 * @author junior
 */
public class Deposit extends Operation {
    
    private final double amount;
    
    private Deposit(double amount) {
        this.amount = amount;
    }
    
    public static Deposit createDeposit(double amount) throws NegativeAmountException {
        ValidationUtils.validateNonNegativeNumber(amount);
        return new Deposit(amount);
    }
    
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void execute(BankAccount account) {
        double newBalance = account.getBalance() + this.getAmount();
        account.setBalance(newBalance);
    }
    
}
