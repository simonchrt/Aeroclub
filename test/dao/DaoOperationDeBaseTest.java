/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Operation;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SSII-Dev
 */
public class DaoOperationDeBaseTest {
    
    public DaoOperationDeBaseTest() {
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
     * Test of cherche method, of class DaoOperationDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num_operation = 0;
        DaoOperationDeBase instance = new DaoOperationDeBaseImpl();
        Operation expResult = null;
        Operation result = instance.cherche(num_operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toutesLesOperations method, of class DaoOperationDeBase.
     */
    @Test
    public void testToutesLesOperations() {
        System.out.println("toutesLesOperations");
        DaoOperationDeBase instance = new DaoOperationDeBaseImpl();
        List<Operation> expResult = null;
        List<Operation> result = instance.toutesLesOperations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoOperationDeBaseImpl implements DaoOperationDeBase {

        public Operation cherche(int num_operation) {
            return null;
        }

        public List<Operation> toutesLesOperations() {
            return null;
        }
    }
    
}
