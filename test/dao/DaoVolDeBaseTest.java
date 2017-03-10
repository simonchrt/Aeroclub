/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Vol;
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
public class DaoVolDeBaseTest {
    
    public DaoVolDeBaseTest() {
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
     * Test of cherche method, of class DaoVolDeBase.
     */
    @Test
    public void testCherche() {
        System.out.println("cherche");
        int num_vol = 0;
        DaoVolDeBase instance = new DaoVolDeBaseImpl();
        Vol expResult = null;
        Vol result = instance.cherche(num_vol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tousLesVols method, of class DaoVolDeBase.
     */
    @Test
    public void testTousLesVols() {
        System.out.println("tousLesVols");
        DaoVolDeBase instance = new DaoVolDeBaseImpl();
        List<Vol> expResult = null;
        List<Vol> result = instance.tousLesVols();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DaoVolDeBaseImpl implements DaoVolDeBase {

        public Vol cherche(int num_vol) {
            return null;
        }

        public List<Vol> tousLesVols() {
            return null;
        }
    }
    
}
