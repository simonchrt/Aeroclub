/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Qualification;
import java.util.List;

/**
 *
 * @author SSII-Dev
 */
public interface DaoQualifDeBase {
    
    public Qualification cherche(int num_qualif);
    
    public List<Qualification> toutesLesQualifs();
    
}
