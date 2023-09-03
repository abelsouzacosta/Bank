/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.validators.emailvalidator;

import application.exceptions.InvalidEmailAddressException;

/**
 *
 * @author junior
 */
public interface EmailAddressValidator {
    void isValid(String email) throws InvalidEmailAddressException;
}
