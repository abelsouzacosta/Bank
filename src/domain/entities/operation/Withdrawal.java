/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.entities.operation;

import application.exceptions.NegativeAmountException;
import domain.entities.account.BankAccount;
import domain.entities.operation.policies.NoOverdraftWithdrawal;
import domain.exceptions.NotEnoughFundsException;
import domain.utils.ValidationUtils;

/**
 *
 * @author junior
 */
public class Withdrawal extends Operation {
    
    private final double amount;
    
    private Withdrawal(double amount) {
        this.amount = amount;
    }
    
    public static Withdrawal createWithdrawal(double amount) throws NegativeAmountException {
        ValidationUtils.validateNonNegativeNumber(amount);
        return new Withdrawal(amount);
    }
    
    public double getAmount() {
        return this.amount;
    }
   
    @Override
    public void execute(BankAccount account) {
        try {
            NoOverdraftWithdrawal.check(account, this.getAmount());
            double newBalance = account.getBalance() - this.getAmount();
            account.setBalance(newBalance);
        } catch (NotEnoughFundsException e) {
            System.out.println("Impossible to withdraw, not enough funds");
        }
    }
    
}
