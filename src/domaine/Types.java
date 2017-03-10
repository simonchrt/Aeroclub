/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

/**
 *
 * @author Simon
 */
public class Types {
    private int num_types;
    private String  types_libelle;
    private String types_prixhoraire;

    public Types(int num_types, String types_libelle, String types_prixhoraire) {
        this.num_types = num_types;
        this.types_libelle = types_libelle;
        this.types_prixhoraire = types_prixhoraire;
    }

    public Types() {
    }

    public int getNum_types() {
        return num_types;
    }

    public void setNum_types(int num_types) {
        this.num_types = num_types;
    }

    public String getTypes_libelle() {
        return types_libelle;
    }

    public void setTypes_libelle(String types_libelle) {
        this.types_libelle = types_libelle;
    }

    public String getTypes_prixhoraire() {
        return types_prixhoraire;
    }

    public void setTypes_prixhoraire(String types_prixhoraire) {
        this.types_prixhoraire = types_prixhoraire;
    }
    
    
}
