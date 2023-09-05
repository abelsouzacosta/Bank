/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package domain.entities.operation;


import application.exceptions.NegativeAmountException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class DepositTest {
    
    private Deposit operation;
    
    public DepositTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Deposit class tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Deposit class tests - all done");
    }
    
    @Test
    public void testCreateDeposit() throws NegativeAmountException {
        double amount = 2000;
        this.operation = Deposit.createDeposit(amount);
        
        assertEquals(amount, this.operation.getAmount(), 0.0f);
    }
    
    @Test
    public void shouldThrowExceptionIfAmountNegative() {
        double amount = -1;
        
        assertThrows(NegativeAmountException.class, () -> {
            Deposit.createDeposit(amount);
        });
    }
    
}
