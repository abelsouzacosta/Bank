/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.domain.entities.account;

import bank.domain.entities.client.Client;
import bank.domain.entities.operation.Operation;
import bank.domain.generators.generators.RandomAccountNumberGenerator;
import java.util.List;

/**
 *
 * @author junior
 */
public class BankAccount {
    private final String accountNumber;
    private final RandomAccountNumberGenerator numberGenerator = new RandomAccountNumberGenerator();
    private List<Operation> operations;
    private final Client client; 
    private double balance;
    
    public BankAccount(Client client) {
        this.accountNumber = numberGenerator.generateAccountNumber();
        this.client = client;
        this.balance = 0;
    }
    
    public static BankAccount createBankAccount(Client client) {
        return new BankAccount(client);
    } 
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void performOperation(Operation operation) {
        operation.execute(this);
        this.operations.add(operation);
    }
}
