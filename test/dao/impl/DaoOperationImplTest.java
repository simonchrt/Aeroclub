/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
public class DaoOperationImplTest {
    
    public DaoOperationImplTest() {
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
     * Test of ajoute method, of class DaoOperationImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Operation prmOperation1 = new Operation(1,2,"01-05-2016", (float) 125.15,"Utilisation du forfait");
        Operation prmOperation = new Operation(2,1,"01-05-2016", (float) 40.5,"Envol 2h");
        DaoOperationImpl instance = new DaoOperationImpl();
        instance.ajoute(prmOperation);
        instance.ajoute(prmOperation1);
    }

    /**
     * Test of cherche method, of class DaoOperationImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 1;
        DaoOperationImpl instance = new DaoOperationImpl();
        int expResult = 2;
        int result = instance.cherche(num).getNum_compte();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoOperationImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        int prmOperation = 2;
        DaoOperationImpl instance = new DaoOperationImpl();
        instance.supprime(prmOperation);
    }

    /**
     * Test of modifie method, of class DaoOperationImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Operation prmOperation1 = new Operation(1,2,"01-05-2016", 50,"Utilisation du forfait");
        DaoOperationImpl instance = new DaoOperationImpl();
        instance.modifie(prmOperation1);
    }

    /**
     * Test of toutesLesOperations method, of class DaoOperationImpl.
     */
    @Test
    public void testToutesLesOperations() throws Exception {
        DaoOperationImpl instance = new DaoOperationImpl();
        int expResult = 2;
        int result = instance.toutesLesOperations().size();
        assertEquals(expResult, result);
    }
    
}
