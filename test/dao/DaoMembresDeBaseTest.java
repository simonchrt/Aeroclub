/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Membres;
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
public class DaoMembresDeBaseTest {
    
    public DaoMembresDeBaseTest() {
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
     * Test of cherche method, of class DaoMembresDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num_membre = 0;
        DaoMembresDeBase instance = new DaoMembresDeBaseImpl();
        Membres expResult = null;
        Membres result = instance.cherche(num_membre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tousLesCategories method, of class DaoMembresDeBase.
     */
    @Test
    public void testTousLesCategories() {
        System.out.println("tousLesCategories");
        DaoMembresDeBase instance = new DaoMembresDeBaseImpl();
        List<Membres> expResult = null;
        List<Membres> result = instance.tousLesCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoMembresDeBaseImpl implements DaoMembresDeBase {

        public Membres cherche(int num_membre) {
            return null;
        }

        public List<Membres> tousLesCategories() {
            return null;
        }
    }
    
}
