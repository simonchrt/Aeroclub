/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domaine.Operation;
import java.util.List;

/**
 *
 * @author SSII-Dev
 */
public interface DaoOperationDeBase {
    
    public Operation cherche(int num_operation);
    
    public List<Operation> toutesLesOperations();
    
}
