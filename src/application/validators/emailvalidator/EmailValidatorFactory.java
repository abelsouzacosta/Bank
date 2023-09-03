/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.validators.emailvalidator;

import bank.domain.enums.ClientType;

/**
 *
 * @author junior
 */
public class EmailValidatorFactory {
   public static EmailAddressValidator produce(ClientType type) {
       switch (type)
       {
           case INDIVIDUAL:
               return new IndividualEmailValidator();
           case COMPANY:
               return new CompanyEmailValidator();
           default:
               throw new AssertionError();
       }
   } 
}
