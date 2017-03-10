/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domaine.CompteOperation;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SSII-Dev
 */
public interface DaoComptesDeBase {
    
    public CompteOperation cherche(int num);
    
    public List<CompteOperation> tousLesComptes();
}