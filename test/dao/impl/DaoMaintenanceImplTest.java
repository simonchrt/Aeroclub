/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Maintenance;
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
public class DaoMaintenanceImplTest {
    
    public DaoMaintenanceImplTest() {
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
     * Test of ajoute method, of class DaoMaintenanceImpl.
     */
    @Test
    public void testAjoute() throws Exception {
        Maintenance prmMaintenance = new Maintenance(1,1,"Réacteur détaché","01-05-2016");
        Maintenance prmMaintenance2 = new Maintenance(2,1,"Réacteur toujours pas réparé","02-05-2016");
        DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
        instance.ajoute(prmMaintenance);
        instance.ajoute(prmMaintenance2);
    }

    /**
     * Test of cherche method, of class DaoMaintenanceImpl.
     */
    @Test
    public void testCherche() throws Exception {
        int num = 1;
        DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
        int expResult = 1;
        int result = instance.cherche(num).getNum_avion();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoMaintenanceImpl.
     */
    @Test
    public void testSupprime() throws Exception {
        int prmMaintenance = 2;
        DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
        instance.supprime(prmMaintenance);
    }

    /**
     * Test of modifie method, of class DaoMaintenanceImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Maintenance prmMaintenance = new Maintenance(2,1,"Réacteur enfin réparé","02-05-2016");
        DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
        instance.modifie(prmMaintenance);
    }

    /**
     * Test of toutesLesMaintenances method, of class DaoMaintenanceImpl.
     */
    @Test
    public void testToutesLesMaintenances() throws Exception {
        DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
        int expResult = 2;
        int result = instance.toutesLesMaintenances().size();
        assertEquals(expResult, result);
    }
    
}
