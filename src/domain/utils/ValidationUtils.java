/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.utils;

import application.exceptions.NegativeAmountException;

/**
 *
 * @author junior
 */
public class ValidationUtils {
    public static void validateNonNegativeNumber(double amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException("Amount should be bigger than zero");
    }
}
