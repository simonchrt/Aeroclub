/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
public class DaoVolImplTest {
    
    public DaoVolImplTest() {
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
     * Test of ajoute method, of class DaoVolImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Vol prmVol1 = new Vol(1,1,1,1,"10-10-2016 10:35:00",40);
        Vol prmVol = new Vol(2,1,1,1,"10-10-2016 11:00:57",25);
        DaoVolImpl instance = new DaoVolImpl();
        instance.ajoute(prmVol);
        instance.ajoute(prmVol1);
    }

    /**
     * Test of cherche method, of class DaoVolImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 2;
        DaoVolImpl instance = new DaoVolImpl();
        int expResult = 25;
        int result = instance.cherche(num).getTemps();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoVolImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        int prmVol = 1;
        DaoVolImpl instance = new DaoVolImpl();
        instance.supprime(prmVol);
    }

    /**
     * Test of modifie method, of class DaoVolImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Vol vol = new Vol(2,1,1,1,"10-10-2016 12:00:57",25);
        DaoVolImpl instance = new DaoVolImpl();
        instance.modifie(vol);
    }

    /**
     * Test of tousLesVol method, of class DaoVolImpl.
     */
    @Test
    public void testTousLesVol() throws Exception {
        System.out.println("tousLesVol");
        DaoVolImpl instance = new DaoVolImpl();
        int expResult = 1;
        int result = instance.tousLesVol().size();
        assertEquals(expResult, result);
    }
    
}