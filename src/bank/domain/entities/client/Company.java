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
public class Company extends Client {
    
    private final String cnpj;
    
    public Company(String name, String phoneNumber, String email, ClientType type, String cnpj) {
        super(name, phoneNumber, email, type);
        this.cnpj = cnpj;
    }
    
    public static Company createCompanyClient(String name, String phoneNumber, String email, String cnpj) throws InvalidEmailAddressException {
        EmailValidator.validate(ClientType.COMPANY, email);
        return new Company(name, phoneNumber, email, ClientType.COMPANY, cnpj);
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
}
