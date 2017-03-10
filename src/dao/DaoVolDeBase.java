/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domaine.Vol;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SSII-Dev
 */
public interface DaoVolDeBase {
    
    public Vol cherche(int num_vol);
    
    public List<Vol> tousLesVols();
}
