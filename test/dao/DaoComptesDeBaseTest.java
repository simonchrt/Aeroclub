/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.CompteOperation;
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
public class DaoComptesDeBaseTest {
    
    public DaoComptesDeBaseTest() {
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
     * Test of cherche method, of class DaoComptesDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num = 0;
        DaoComptesDeBase instance = new DaoComptesDeBaseImpl();
        CompteOperation expResult = null;
        CompteOperation result = instance.cherche(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tousLesComptes method, of class DaoComptesDeBase.
     */
    @Test
    public void testTousLesComptes() {
        System.out.println("tousLesComptes");
        DaoComptesDeBase instance = new DaoComptesDeBaseImpl();
        List<CompteOperation> expResult = null;
        List<CompteOperation> result = instance.tousLesComptes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoComptesDeBaseImpl implements DaoComptesDeBase {

        public CompteOperation cherche(int num) {
            return null;
        }

        public List<CompteOperation> tousLesComptes() {
            return null;
        }
    }
    
}
