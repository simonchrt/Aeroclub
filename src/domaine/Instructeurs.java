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
public class Instructeurs {
    private int num_instructeur;
    private String nom;
    private String prenom;
    private int taux_instructeur;
    private String adresse;
    private String code_postal;
    private String ville;
    private String tel;
    private String portable;
    private String fax;
    private String commentaire;
    private String num_badge;

    public Instructeurs() {
    }

    public Instructeurs(int num_instructeur, String nom, String prenom, int taux_instructeur, String adresse, String code_postal, String ville, String tel, String portable, String fax, String commentaire, String num_badge) {
        this.num_instructeur = num_instructeur;
        this.nom = nom;
        this.prenom = prenom;
        this.taux_instructeur = taux_instructeur;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
        this.portable = portable;
        this.fax = fax;
        this.commentaire = commentaire;
        this.num_badge = num_badge;
    }

    public int getNum_instructeur() {
        return num_instructeur;
    }

    public void setNum_instructeur(int num_instructeur) {
        this.num_instructeur = num_instructeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTaux_instructeur() {
        return taux_instructeur;
    }

    public void setTaux_instructeur(int taux_instructeur) {
        this.taux_instructeur = taux_instructeur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPortable() {
        return portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNum_badge() {
        return num_badge;
    }

    public void setNum_badge(String num_badge) {
        this.num_badge = num_badge;
    }
    
    
}
