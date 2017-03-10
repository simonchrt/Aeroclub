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
public class Membres 
{
    private int num_membre;
    private String court;
    private int num_qualif;
    private int num_compte;
    private String nom;
    private String prenom;
    private String adresse;
    private String code_postal;
    private String ville;
    private String tel;
    private String email;
    private int num_badge;
    private String profession;
    private String date_naissance;
    private String lieu_naissance;
    private String date_entree;
    
    
    public Membres(int num_membre, String court,  int num_qualif, int num_compte, String nom, String prenom, String adresse, String code_postal, String ville, String tel, String email, int num_badge, String profession, String date_naissance, String lieu_naissance, String date_entree) 
    {
        this.num_membre = num_membre;
        this.court = court;
        this.num_qualif = num_qualif;
        this.num_compte = num_compte;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
        this.email = email;
        this.num_badge = num_badge;
        this.profession = profession;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.date_entree = date_entree;
    }

    public Membres() 
    {
    }

    public int getNum_membre() 
    {
        return num_membre;
    }

    public void setNum_membre(int num_membre) 
    {
        this.num_membre = num_membre;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) 
    {
        this.court = court;
    }

    public int getNum_qualif() 
    {
        return num_qualif;
    }

    public void setNum_qualif(int num_qualif) 
    {
        this.num_qualif = num_qualif;
    }

    public String getNom() 
    {
        return nom;
    }

    public void setNom(String nom) 
    {
        this.nom = nom;
    }

    public String getPrenom() 
    {
        return prenom;
    }

    public void setPrenom(String prenom) 
    {
        this.prenom = prenom;
    }

    public String getAdresse() 
    {
        return adresse;
    }

    public void setAdresse(String adresse) 
    {
        this.adresse = adresse;
    }

    public String getCode_postal() 
    {
        return code_postal;
    }

    public void setCode_postal(String code_postal) 
    {
        this.code_postal = code_postal;
    }

    public String getVille() 
    {
        return ville;
    }

    public void setVille(String ville) 
    {
        this.ville = ville;
    }

    public String getTel() 
    {
        return tel;
    }

    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public int getNum_badge() 
    {
        return num_badge;
    }

    public void setNum_badge(int num_badge) 
    {
        this.num_badge = num_badge;
    }
    
        public int getNum_compte() 
        {
        return num_compte;
    }

    public void setNum_compte(int num_compte) 
    {
        this.num_compte = num_compte;
    }

    public String getProfession() 
    {
        return profession;
    }

    public void setProfession(String profession) 
    {
        this.profession = profession;
    }

    public String getDate_naissance() 
    {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) 
    {
        this.date_naissance = date_naissance;
    }

    public String getLieu_naissance() 
    {
        return lieu_naissance;
    }

    public void setLieu_naissance(String lieu_naissance) 
    {
        this.lieu_naissance = lieu_naissance;
    }

    public String getDate_entree() 
    {
        return date_entree;
    }

    public void setDate_entree(String date_entree) 
    {
        this.date_entree = date_entree;
    }
}
