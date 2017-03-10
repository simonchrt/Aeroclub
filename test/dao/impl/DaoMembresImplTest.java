/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Civilite;
import domaine.Membres;
import domaine.Qualification;
import java.util.Date;
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
public class DaoMembresImplTest {
    
    public DaoMembresImplTest() {
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
     * Test of ajoute method, of class DaoMembresImpl.
     *
    @Test
    public void testAjoute() throws Exception {
        Membres prmMembre1 = new Membres();
        prmMembre1.setNum_membre(1);
	prmMembre1.setCourt("M.");
	prmMembre1.setNum(1);
	prmMembre1.setNum_qualif(2);
	prmMembre1.setNom("Joly");
	prmMembre1.setPrenom("Alexandre");
	prmMembre1.setAdresse("7 rue de la chapelle");
	prmMembre1.setCode_postal("edfgergerg");
	prmMembre1.setVille("edfgergerg");
	prmMembre1.setTel("edfgergerg");
	prmMembre1.setEmail("edfgergerg");
	prmMembre1.setCommentaire("edfgergerg");
	prmMembre1.setDate_vm("10-10-2016");
	prmMembre1.setDate_sep("10-10-2016");
	prmMembre1.setValidite_sep("10-10-2016");
	prmMembre1.setNum_badge(7844);
	prmMembre1.setProfession("edfgergerg");
	prmMembre1.setDate_naissance("10-10-2016");
	prmMembre1.setLieu_naissance("edfgergerg");
	prmMembre1.setCarte_federale("edfgergerg");
	prmMembre1.setDate_attestation("10-10-2016");
	prmMembre1.setDate_theorique_bb("10-10-2016");
	prmMembre1.setDate_theorique_ppla("10-10-2016");
	prmMembre1.setDate_bb("10-10-2016");
	prmMembre1.setDate_ppla("10-10-2016");
	prmMembre1.setNumero_bb("45864652");
	prmMembre1.setDate_entree("10-10-2016");
	prmMembre1.setMembre_actif(true);
	prmMembre1.setMembre_inscrit(false);
        Membres prmMembre = new Membres(2,"Mme",2,2,"Hakem","Raph","7 rue de la chapelle","62500","St Omer","0312345678","alexjoly@hotmail.fr","blabla","10-10-2016","10-10-2016","10-10-2016",25,"Eboueur","10-10-2016","ST Omer","","10-10-2016","10-10-2016","10-10-2016","10-10-2016","10-10-2016","586465","10-10-2016",false,true, new Civilite(), new Qualification());
        DaoMembresImpl instance = new DaoMembresImpl();
        instance.ajoute(prmMembre);
        instance.ajoute(prmMembre1);
    }

    /**
     * Test of cherche method, of class DaoMembresImpl.
     *
    @Test
    public void testCherche() throws Exception {
        int num = 1;
        DaoMembresImpl instance = new DaoMembresImpl();
        String expResult = "Alexandre";
        String result = instance.cherche(num).getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of supprime method, of class DaoMembresImpl.
     *
    @Test
    public void testSupprime() throws Exception {
        int prmMembre = 2;
        DaoMembresImpl instance = new DaoMembresImpl();
        instance.supprime(prmMembre);
    }

    /**
     * Test of modifie method, of class DaoMembresImpl.
     */
    @Test
    public void testModifie() throws Exception {
        Membres prmMembre1 = new Membres();
        prmMembre1.setNum_membre(1);
	prmMembre1.setCourt("M.");
	prmMembre1.setNum_qualif(2);
        prmMembre1.setNum_compte(1);
	prmMembre1.setNom("PasJoly");
	prmMembre1.setPrenom("Alexandre");
	prmMembre1.setAdresse("7 rue de la chapelle");
	prmMembre1.setCode_postal("edfgergerg");
	prmMembre1.setVille("edfgergerg");
	prmMembre1.setTel("edfgergerg");
	prmMembre1.setNum_badge(7844);
	prmMembre1.setProfession("edfgergerg");
	prmMembre1.setDate_naissance("10-10-2016");
	prmMembre1.setLieu_naissance("edfgergerg");
	prmMembre1.setDate_entree("10-10-2016");    
        DaoMembresImpl instance = new DaoMembresImpl();
        instance.modifie(prmMembre1);
    }

    /**
     * Test of tousLesMembres method, of class DaoMembresImpl.
     *
    @Test
    public void testTousLesMembres() throws Exception {
        DaoMembresImpl instance = new DaoMembresImpl();
        int expResult = 1;
        int result = instance.tousLesMembres().size();
        assertEquals(expResult, result);
    }
    */
}
