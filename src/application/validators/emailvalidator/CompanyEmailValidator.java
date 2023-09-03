/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.validators.emailvalidator;

import application.exceptions.InvalidEmailAddressException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author junior
 */
public class CompanyEmailValidator implements EmailAddressValidator {
    
    private static final Pattern COMPANY_GENERIC_EMAIL_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
    );

    @Override
    public void isValid(String email) throws InvalidEmailAddressException {
        if (email == null) 
            throw new IllegalArgumentException("Email cannot be null.");
        Matcher matcher = COMPANY_GENERIC_EMAIL_PATTERN.matcher(email);
        if (!matcher.matches()) 
            throw new InvalidEmailAddressException("Invalid email format: " + email);
        
    }
    
}
