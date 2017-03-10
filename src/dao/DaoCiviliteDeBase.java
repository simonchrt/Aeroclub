/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domaine.Civilite;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SSII-Dev
 */
public interface DaoCiviliteDeBase {
    
    public Civilite cherche (String num_avions);
    
    public List<Civilite> tousLesCivilité();
}
