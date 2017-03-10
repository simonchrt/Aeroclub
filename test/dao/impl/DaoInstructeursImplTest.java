/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

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
public class DaoInstructeursImplTest {
    
    public DaoInstructeursImplTest() {
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
     * Test of ajoute method, of class DaoInstructeursImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Instructeurs instructeur = new Instructeurs(1,"Hakem","Raphael",25,"20 Rue des moulins","59220","Testville","0312345678","0612345678","0412345678","Instructeur de test","BA-C5F-42");
        Instructeurs instructeur1 = new Instructeurs(2,"Lamoroso","Gigi",69,"69 Rue des moulins rouges","59669","SexVille","0312345678","0612345678","0412345678","Instructeur de sex","OQ-S3X-69");
        DaoInstructeursImpl instance = new DaoInstructeursImpl();
        instance.ajoute(instructeur);
        instance.ajoute(instructeur1);
    }

    /**
     * Test of cherche method, of class DaoInstructeursImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 2;
        DaoInstructeursImpl instance = new DaoInstructeursImpl();
        String expResult = "Gigi";
        String result = instance.cherche(num).getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoInstructeursImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        int prmInstructeur = 1;
        DaoInstructeursImpl instance = new DaoInstructeursImpl();
        instance.supprime(prmInstructeur);
    }

    /**
     * Test of modifie method, of class DaoInstructeursImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Instructeurs instructeur = new Instructeurs(2,"Joly","Alexandre",30,"20 Rue des moulins","59220","Testville","0312345678","0612345678","0412345678","Instructeur de test","BA-C5F-42");
        DaoInstructeursImpl instance = new DaoInstructeursImpl();
        instance.modifie(instructeur);
    }

    /**
     * Test of tousLesInstructeurs method, of class DaoInstructeursImpl.
     */
    @Test
    public void testTousLesInstructeurs() throws Exception {
        DaoInstructeursImpl instance = new DaoInstructeursImpl();
        int expResult = 2;
        int result = instance.tousLesInstructeurs().size();
        assertEquals(expResult, result);
    }
    
}
