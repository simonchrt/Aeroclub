/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Qualification;
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
public class DaoQualifImplTest {
    
    public DaoQualifImplTest() {
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
     * Test of ajoute method, of class DaoQualifImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Qualification prmQualif = new Qualification(1,"BAC + 1");
        Qualification prmQualif2 = new Qualification(2,"BAC + 2");
        DaoQualifImpl instance = new DaoQualifImpl();
        instance.ajoute(prmQualif);
        instance.ajoute(prmQualif2);
    }

    /**
     * Test of cherche method, of class DaoQualifImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num_qualif = 2;
        DaoQualifImpl instance = new DaoQualifImpl();
        String expResult = "BAC + 2";
        String result = instance.cherche(num_qualif).getLibelle();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoQualifImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        Qualification num_qualif = new Qualification();
        num_qualif.setNum_qualif(1);
        DaoQualifImpl instance = new DaoQualifImpl();
        instance.supprime(num_qualif);
    }

    /**
     * Test of modifie method, of class DaoQualifImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Qualification prmQualif = new Qualification(1,"BEPC");
        DaoQualifImpl instance = new DaoQualifImpl();
        instance.modifie(prmQualif);
    }

    /**
     * Test of toutesLesQualifications method, of class DaoQualifImpl.
     */
    @Test
    public void testToutesLesQualifications() throws Exception {
        DaoQualifImpl instance = new DaoQualifImpl();
        int expResult = 2;
        int result = instance.toutesLesQualifications().size();
        assertEquals(expResult, result);
    }
    
}
