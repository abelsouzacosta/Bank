/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.generators;

import java.util.Random;

/**
 *
 * @author junior
 */
public class RandomAccountNumberGenerator implements AccountNumberGenerator {
   
    private static final int ACCOUNT_NUMBER_GENERATOR_LENGTH = 10;
    private Random random;
    
    public RandomAccountNumberGenerator() {
        this.random = new Random();
    }
    
    @Override
    public String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder(ACCOUNT_NUMBER_GENERATOR_LENGTH);
        
        for (int count = 0; count < ACCOUNT_NUMBER_GENERATOR_LENGTH; count += 1) {
            int digit = random.nextInt(10);
            accountNumber.append(digit);
        }
        
        return accountNumber.toString();
    }
}
