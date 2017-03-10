/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
public class DaoAvionsImplTest {
    
    public DaoAvionsImplTest() {
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
     * Test of ajoute method, of class DaoAvionsImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Avions prmAvion1 = new Avions(1,"Airbus",33,1,40,7,50,252,0,5,"xwydtz3h");
        Avions prmAvion = new Avions(2,"Boeing",15,1,0,0,50,0,0,5,"XDgfjhfgjhFD2");
        DaoAvionsImpl instance = new DaoAvionsImpl();
        instance.ajoute(prmAvion);
        instance.ajoute(prmAvion1);
    }

    /**
     * Test of cherche method, of class DaoAvionsImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 2;
        DaoAvionsImpl instance = new DaoAvionsImpl();
        String expResult = "Boeing";
        String result = instance.cherche(num).getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoAvionsImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        int prmAvion = 1;
        DaoAvionsImpl instance = new DaoAvionsImpl();
        instance.supprime(prmAvion);
    }

    /**
     * Test of modifie method, of class DaoAvionsImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Avions avion = new Avions(2,"BoeingTest",15,1,0,0,50,0,0,5,"XDgfjhfgjhFD2");
        DaoAvionsImpl instance = new DaoAvionsImpl();
        instance.modifie(avion);
    }

    /**
     * Test of tousLesAvions method, of class DaoAvionsImpl.
     */
    @Test
    public void testTousLesAvions() throws Exception {
        System.out.println("tousLesAvions");
        DaoAvionsImpl instance = new DaoAvionsImpl();
        int expResult = 1;
        int result = instance.tousLesAvions().size();
        assertEquals(expResult, result);
    }
    
}
