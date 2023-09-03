/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank.domain.entities.client;

import application.exceptions.InvalidEmailAddressException;
import bank.domain.enums.ClientType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class CompanyTest {
    
    private Company client;
    
    public CompanyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Company class tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Company class tests - all done");
    }
    
    @Test
    public void createCompanyClientValidEmail() throws InvalidEmailAddressException {
        String name = "Name";
        String phoneNumber = "+55 (75) 999999-9999";
        String email = "valid@company.com";
        String cnpj = "90909090909";
        
        this.client = Company.createCompanyClient(name, phoneNumber, email, cnpj);
        
        assertEquals(name, this.client.getName());
        assertEquals(phoneNumber, this.client.getPhoneNumber());
        assertEquals(email, this.client.getEmail());
        assertEquals(cnpj, this.client.getCnpj());
    }
    
    @Test
    public void createCompanyClientInvalidEmail() {
        String name = "Name";
        String phoneNumber = "+55 (75) 999999-9999";
        String invalidEmail = "invalidgmail.com";
        String cpf = "90909090909";
        
        assertThrows(InvalidEmailAddressException.class, () -> {
           Company.createCompanyClient(name, phoneNumber, invalidEmail, cpf);
        });
    }
}
