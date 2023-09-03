/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank.domain.entities.client;


import application.exceptions.InvalidEmailAddressException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class IndividualTest {
    
    private Individual client;
    
    public IndividualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Individual class test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Individual class tests - all done");
    } 
    
    @Test
    public void testCreateIndividualClientWithValidEmail() throws InvalidEmailAddressException {
        String name = "Name";
        String phoneNumber = "+55 (75) 999999-9999";
        String email = "valid@gmail.com";
        String cpf = "90909090909";
        
        this.client = Individual.createIndividualClient(name, phoneNumber, email, cpf);
        
        assertEquals(name, this.client.getName());
        assertEquals(phoneNumber, this.client.getPhoneNumber());
        assertEquals(email, this.client.getEmail());
        assertEquals(cpf, this.client.getCpf());
    }
    
    @Test
    public void testCreateIndividualClientWithInvalidEmail() {
        String name = "Name";
        String phoneNumber = "+55 (75) 999999-9999";
        String invalidEmail = "invalidgmail.com";
        String cpf = "90909090909";
        
        assertThrows(InvalidEmailAddressException.class, () -> {
           Individual.createIndividualClient(name, phoneNumber, invalidEmail, cpf);
        });
    }
}
