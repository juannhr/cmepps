/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author juanh_hj7z1sj
 */
public class Cuenta {
    
     public Cuenta() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Withdraw method, of class CuentaBancaria.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("Withdraw");
        int x = 0;
        Cuenta instance = null;
        instance.Withdraw(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deposit method, of class CuentaBancaria.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        int x = 0;
        Cuenta instance = null;
        instance.Deposit(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class CuentaBancaria.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Cuenta instance = null;
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}