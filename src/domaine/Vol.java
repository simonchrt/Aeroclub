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
public class Vol {
    private int num_vol;
    private int num_membre;
    private int num_avion;
    private int num_instructeur;
    private String dateHoraire;
    private String horaire;
    private int temps;
    private Instructeurs instructeur;
    private Membres membre;
    private Avions avion;

    public Vol(int num_vol, int num_membre, int num_avion, int num_instructeur, String dateHoraire, int temps) {
        this.num_vol = num_vol;
        this.num_membre = num_membre;
        this.num_avion = num_avion;
        this.num_instructeur = num_instructeur;
        this.dateHoraire = dateHoraire;
        this.temps = temps;
    }

    public Vol() {
    }

    public int getNum_vol() {
        return num_vol;
    }

    public void setNum_vol(int num_vol) {
        this.num_vol = num_vol;
    }

    public int getNum_membre() {
        return num_membre;
    }

    public void setNum_membre(int num_membre) {
        this.num_membre = num_membre;
    }

    public int getNum_avion() {
        return num_avion;
    }

    public void setNum_avion(int num_avion) {
        this.num_avion = num_avion;
    }

    public int getNum_instructeur() {
        return num_instructeur;
    }

    public void setNum_instructeur(int num_instructeur) {
        this.num_instructeur = num_instructeur;
    }

    public String getDateHoraire() {
        return dateHoraire;
    }

    public void setDateHoraire(String date) {
        this.dateHoraire = dateHoraire;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public Instructeurs getInstructeur() {
        return instructeur;
    }

    public void setInstructeur(Instructeurs instructeur) {
        this.instructeur = instructeur;
    }

    public Membres getMembre() {
        return membre;
    }

    public void setMembre(Membres membre) {
        this.membre = membre;
    }

    public Avions getAvion() {
        return avion;
    }

    public void setAvion(Avions avion) {
        this.avion = avion;
    }
}
