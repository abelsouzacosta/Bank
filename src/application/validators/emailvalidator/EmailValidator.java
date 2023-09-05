/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.validators.emailvalidator;

import application.exceptions.InvalidEmailAddressException;
import domain.enums.ClientType;

/**
 *
 * @author junior
 */
public class EmailValidator {
    public static void validate(ClientType type, String email) throws InvalidEmailAddressException {
        EmailAddressValidator validator = EmailValidatorFactory.produce(type);
        validator.isValid(email);
    }
}
