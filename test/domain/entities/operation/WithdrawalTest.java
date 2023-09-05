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
public class WithdrawalTest {
    
    private Withdrawal operation;
    
    public WithdrawalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Withdrawal class tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Withdrawal class tests - all done");
    }
    
    @Test
    public void testCreateWithdrawal() throws NegativeAmountException {
        double amount = 2000;
        this.operation = Withdrawal.createWithdrawal(amount);
        
        assertEquals(amount, this.operation.getAmount(), 0.0f);
    }
    
    @Test
    public void shouldThrowExceptionIfAmountIsNegative() throws NegativeAmountException {
        double amount = -1;
        
        assertThrows(NegativeAmountException.class, () -> {
            Withdrawal.createWithdrawal(amount);
        });
    }
    
}
