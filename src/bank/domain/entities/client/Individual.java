/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.domain.entities.client;

import application.exceptions.InvalidEmailAddressException;
import application.validators.emailvalidator.EmailValidator;
import bank.domain.enums.ClientType;

/**
 *
 * @author junior
 */
public class Individual extends Client {
    
    private final String cpf;
    
    public Individual(String name, String phoneNumber, String email, ClientType type, String cpf) {
        super(name, phoneNumber, email, type);
        this.cpf = cpf;
    }
    
    public static Individual createIndividualClient(String name, String phoneNumber, String email, String cpf) throws InvalidEmailAddressException {
        EmailValidator.validate(ClientType.INDIVIDUAL, email);
        return new Individual(name, phoneNumber, email, ClientType.INDIVIDUAL, cpf);
    } 
    
    public String getCpf() {
        return this.cpf;
    }
    
}
