/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Avions;
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
public class DaoAvionsDeBaseTest {
    
    public DaoAvionsDeBaseTest() {
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
     * Test of cherche method, of class DaoAvionsDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num_avion = 0;
        DaoAvionsDeBase instance = new DaoAvionsDeBaseImpl();
        Avions expResult = null;
        Avions result = instance.cherche(num_avion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tousLesCategories method, of class DaoAvionsDeBase.
     */
    @Test
    public void testTousLesCategories() {
        System.out.println("tousLesCategories");
        DaoAvionsDeBase instance = new DaoAvionsDeBaseImpl();
        List<Avions> expResult = null;
        List<Avions> result = instance.tousLesCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoAvionsDeBaseImpl implements DaoAvionsDeBase {

        public Avions cherche(int num_avion) {
            return null;
        }

        public List<Avions> tousLesCategories() {
            return null;
        }
    }
    
}
