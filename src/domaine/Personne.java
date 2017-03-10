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
public class Personne {
   private String num_personne;
   private String personne_nom;
   private String personne_prenom;
   private String personne_adresse;
   private String personne_telFixe;
   private String personne_telPortable;
   private String personne_mail;
   private String personne_badge;
   private String personne_commentaire;

    public Personne(String num_personne, String personne_nom, String personne_prenom, String personne_adresse, String personne_telFixe, String personne_telPortable, String personne_mail, String personne_badge, String personne_commentaire) {
        this.num_personne = num_personne;
        this.personne_nom = personne_nom;
        this.personne_prenom = personne_prenom;
        this.personne_adresse = personne_adresse;
        this.personne_telFixe = personne_telFixe;
        this.personne_telPortable = personne_telPortable;
        this.personne_mail = personne_mail;
        this.personne_badge = personne_badge;
        this.personne_commentaire = personne_commentaire;
    }

    public String getNum_personne() {
        return num_personne;
    }

    public void setNum_personne(String num_personne) {
        this.num_personne = num_personne;
    }

    public String getPersonne_nom() {
        return personne_nom;
    }

    public void setPersonne_nom(String personne_nom) {
        this.personne_nom = personne_nom;
    }

    public String getPersonne_prenom() {
        return personne_prenom;
    }

    public void setPersonne_prenom(String personne_prenom) {
        this.personne_prenom = personne_prenom;
    }

    public String getPersonne_adresse() {
        return personne_adresse;
    }

    public void setPersonne_adresse(String personne_adresse) {
        this.personne_adresse = personne_adresse;
    }

    public String getPersonne_telFixe() {
        return personne_telFixe;
    }

    public void setPersonne_telFixe(String personne_telFixe) {
        this.personne_telFixe = personne_telFixe;
    }

    public String getPersonne_telPortable() {
        return personne_telPortable;
    }

    public void setPersonne_telPortable(String personne_telPortable) {
        this.personne_telPortable = personne_telPortable;
    }

    public String getPersonne_mail() {
        return personne_mail;
    }

    public void setPersonne_mail(String personne_mail) {
        this.personne_mail = personne_mail;
    }

    public String getPersonne_badge() {
        return personne_badge;
    }

    public void setPersonne_badge(String personne_badge) {
        this.personne_badge = personne_badge;
    }

    public String getPersonne_commentaire() {
        return personne_commentaire;
    }

    public void setPersonne_commentaire(String personne_commentaire) {
        this.personne_commentaire = personne_commentaire;
    }
   
   
   
}
