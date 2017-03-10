/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

/**
 *
 * @author SSII-Dev
 */
public class Qualification {
    private int num_qualif;
    private String libelle;

    public Qualification(int num_qualif, String libelle) {
        this.num_qualif = num_qualif;
        this.libelle = libelle;
    }

    public Qualification() {
    }

    public int getNum_qualif() {
        return num_qualif;
    }

    public void setNum_qualif(int num_qualif) {
        this.num_qualif = num_qualif;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

        
}
