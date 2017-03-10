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
public class Avions {
    private int num_avion;
    private String immatriculation;
    private Types type;

    public Avions(int num_avion, String immatriculation, Types type) {
        this.num_avion = num_avion;
        this.immatriculation = immatriculation;
        this.type = type;
    }

    public Avions() {
    }

    public int getNum_avion() {
        return num_avion;
    }

    public void setNum_avion(int num_avion) {
        this.num_avion = num_avion;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

  

 
    
}
