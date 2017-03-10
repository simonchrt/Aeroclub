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
public class Civilite {
    private String num_type;
    private String court;
    private String entier;

    public Civilite(String num_type, String court, String entier) {
        this.num_type = num_type;
        this.court = court;
        this.entier = entier;
    }

    public Civilite() {
    }

    public String getNum_type() {
        return num_type;
    }

    public void setNum_type(String num_type) {
        this.num_type = num_type;
    }

    
    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public String getEntier() {
        return entier;
    }

    public void setEntier(String entier) {
        this.entier = entier;
    }
    
    
    
}
