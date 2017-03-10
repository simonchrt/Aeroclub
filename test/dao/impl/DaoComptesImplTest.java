/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
public class DaoComptesImplTest {
    
    public DaoComptesImplTest() {
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
     * Test of ajoute method, of class DaoComptesImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        CompteOperation compte = new CompteOperation(1,500);
        CompteOperation compte2 = new CompteOperation(2,2574);
        DaoComptesImpl instance = new DaoComptesImpl();
        instance.ajoute(compte);
        instance.ajoute(compte2);
    }

    /**
     * Test of cherche method, of class DaoComptesImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 2;
        DaoComptesImpl instance = new DaoComptesImpl();
        int expResult = 36547;
        int result = (int) instance.cherche(num).getSolde();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoComptesImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        CompteOperation leCompte = new CompteOperation();
        leCompte.setNum(1);
        DaoComptesImpl instance = new DaoComptesImpl();
        instance.supprime(leCompte);
    }

    /**
     * Test of modifie method, of class DaoComptesImpl.
     */
    @Test
    public void testModifie() throws Exception {
        CompteOperation compte = new CompteOperation(2,36547);
        DaoComptesImpl instance = new DaoComptesImpl();
        instance.modifie(compte);
    }

    /**
     * Test of tousLesComptes method, of class DaoComptesImpl.
     */
    @Test
    public void testTousLesComptes() throws Exception {
        System.out.println("tousLesComptes");
        DaoComptesImpl instance = new DaoComptesImpl();
        int expResult = 1;
        int result = instance.tousLesComptes().size();
        assertEquals(expResult, result);
    }
    
}
