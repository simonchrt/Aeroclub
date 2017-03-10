/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

import java.util.Date;

/**
 *
 * @author SSII-Dev
 */
public class Operation {
    private int num_operation;
    private int num_compte;
    private String date;
    private float montant;
    private String motif;
    private CompteOperation compte;

    public Operation(int num_operation, int num_compte, String date, float montant, String motif, CompteOperation compte) {
        this.num_operation = num_operation;
        this.num_compte = num_compte;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
        this.compte = compte;
    }
    
    public Operation(int num_operation, int num_compte, String date, float montant, String motif) {
        this.num_operation = num_operation;
        this.num_compte = num_compte;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public Operation() {
    }

    public int getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(int num_compte) {
        this.num_compte = num_compte;
    }

    public int getNum_operation() {
        return num_operation;
    }

    public void setNum_operation(int num_operation) {
        this.num_operation = num_operation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public CompteOperation getCompte() {
        return compte;
    }

    public void setCompte(CompteOperation compte) {
        this.compte = compte;
    }
}
