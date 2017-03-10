/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Civilite;
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
public class DaoCiviliteImplTest {
    
    public DaoCiviliteImplTest() {
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
     * Test of cherche method, of class DaoCiviliteImpl.
     * @throws java.lang.Exception
     */
    @Test
    public void testCherche() throws Exception {
        String court = "Mme";
        DaoCiviliteImpl instance = new DaoCiviliteImpl();
        String expResult = "Madame";
        String result = instance.cherche(court).getEntier();
        assertEquals(expResult, result);
    }
    
}
