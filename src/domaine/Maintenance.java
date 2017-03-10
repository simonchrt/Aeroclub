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
public class Maintenance {
    private int num_maintenance;
    private int num_avion;
    private String libelle;
    private String date;
    private Avions avion;

    public Maintenance() {
    }

    public Maintenance(int num_maintenance, int num_avion, String libelle, String date, Avions avion) {
        this.num_maintenance = num_maintenance;
        this.num_avion = num_avion;
        this.libelle = libelle;
        this.date = date;
        this.avion = avion;
    }
    
    public Maintenance(int num_maintenance, int num_avion, String libelle, String date) {
        this.num_maintenance = num_maintenance;
        this.num_avion = num_avion;
        this.libelle = libelle;
        this.date = date;
    }

    public int getNum_maintenance() {
        return num_maintenance;
    }

    public void setNum_maintenance(int num_maintenance) {
        this.num_maintenance = num_maintenance;
    }

    public int getNum_avion() {
        return num_avion;
    }

    public void setNum_avion(int num_avion) {
        this.num_avion = num_avion;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Avions getAvion() {
        return avion;
    }

    public void setAvion(Avions avion) {
        this.avion = avion;
    }
    
}
