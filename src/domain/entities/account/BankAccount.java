/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.entities.account;

import domain.entities.client.Client;
import domain.entities.operation.Operation;
import domain.generators.RandomAccountNumberGenerator;
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
    
    // TODO: move method to operation service
    // also create a method to add a operation in the list 
    // of operations
    public void performOperation(Operation operation) {
        operation.execute(this);
        this.operations.add(operation);
    }
    
    public List<Operation> getOperations() {
        return this.operations;
    }
    
    public Client getClient() {
        return this.client;
    }
}
