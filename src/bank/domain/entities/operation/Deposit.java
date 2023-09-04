/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.domain.entities.operation;

import bank.domain.entities.account.BankAccount;

/**
 *
 * @author junior
 */
public class Deposit extends Operation {
    
    private double amount;
    
    public Deposit(double amount) {
        this.amount = amount;
    }
    
    public static Deposit createDeposit(double amount) {
        return new Deposit(amount);
    }
    
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void execute(BankAccount account) {
        
    }
    
}
