/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Instructeurs;
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
public class DaoInstructeursDeBaseTest {
    
    public DaoInstructeursDeBaseTest() {
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
     * Test of cherche method, of class DaoInstructeursDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num_instructeur = 0;
        DaoInstructeursDeBase instance = new DaoInstructeursDeBaseImpl();
        Instructeurs expResult = null;
        Instructeurs result = instance.cherche(num_instructeur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tousLesInstructeurs method, of class DaoInstructeursDeBase.
     */
    @Test
    public void testTousLesInstructeurs() {
        System.out.println("tousLesInstructeurs");
        DaoInstructeursDeBase instance = new DaoInstructeursDeBaseImpl();
        List<Instructeurs> expResult = null;
        List<Instructeurs> result = instance.tousLesInstructeurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoInstructeursDeBaseImpl implements DaoInstructeursDeBase {

        public Instructeurs cherche(int num_instructeur) {
            return null;
        }

        public List<Instructeurs> tousLesInstructeurs() {
            return null;
        }
    }
    
}
