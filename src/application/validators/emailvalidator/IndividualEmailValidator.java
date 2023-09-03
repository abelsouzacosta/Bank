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
public class IndividualEmailValidator implements EmailAddressValidator {
    
     // Pattern for specific domains
    private static final Pattern INDIVIDUAL_DOMAIN_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9._%+-]+@(gmail\\.com|outlook@com|yahoo\\.com|icloud\\.com|protonmail\\.com)$"
    );

    @Override
    public void isValid(String email) throws InvalidEmailAddressException {
        if (email == null) 
            throw new IllegalArgumentException("Email cannot be null.");
        Matcher matcher = INDIVIDUAL_DOMAIN_PATTERN.matcher(email);
        if (!matcher.matches()) 
            throw new InvalidEmailAddressException("Invalid email format or domain: " + email);
    }
    
}
