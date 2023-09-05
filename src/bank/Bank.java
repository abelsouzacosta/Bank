/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import application.exceptions.InvalidEmailAddressException;
import domain.entities.account.BankAccount;
import domain.entities.client.Individual;

/**
 *
 * @author junior
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidEmailAddressException {
        Individual client = Individual.
                createIndividualClient("Abel Souza",
                        "+55 (75) 99264 6244",
                        "abelsouzacosta@gmail.com",
                        "90909090909");
        
        BankAccount account = BankAccount.createBankAccount(client);
    }
    
}
