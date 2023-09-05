/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.entities.operation;

import domain.entities.account.BankAccount;
import java.util.Date;

/**
 *
 * @author junior
 */
public abstract class Operation {
    private final Date timestamp;
    
    public Operation() {
        this.timestamp = new Date();
    }
    
    public abstract void execute(BankAccount account);
}
