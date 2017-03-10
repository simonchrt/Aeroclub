/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Membres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import domaine.Qualification;
import domaine.Civilite;

/**
 *
 * @author root
 */
public class DaoMembresImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoMembresImpl() 
    {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";
    }

    public DaoMembresImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Membres prmMembre) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_membre = prmMembre.getNum_membre();
                    String court = prmMembre.getCourt();
                    int num_qualif = prmMembre.getNum_qualif();
                    int num = prmMembre.getNum_compte();
                    String nom = prmMembre.getNom();
                    String prenom = prmMembre.getPrenom();
                    String adresse = prmMembre.getAdresse();
                    String code_postal = prmMembre.getCode_postal();
                    String ville = prmMembre.getVille();
                    String tel = prmMembre.getTel();
                    String email = prmMembre.getEmail();
                    int num_badge = prmMembre.getNum_badge();
                    String profession = prmMembre.getProfession();
                    String date_naissance = prmMembre.getDate_naissance();
                    String lieu_naissance = prmMembre.getLieu_naissance();
                    String date_entree = prmMembre.getDate_entree();
                    st.executeUpdate("INSERT INTO membres VALUES(" + num_membre + ",'" + court + "'," + num_qualif + "," + num + ",'" + nom + "','" + prenom + "','" + adresse + "','" + code_postal + "','" + ville + "','" + tel + "','" + email + "'," + num_badge + ",'" + profession + "','" + date_naissance + "','" + lieu_naissance + "','" + date_entree + "');");
             } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Membres cherche(int num) throws SQLException {
        Membres obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM membres WHERE num_membre =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Membres();
                        obj1.setNum_membre(rs.getInt("num_membre"));
                        obj1.setCourt(rs.getString("court"));
                        obj1.setNum_qualif(rs.getInt("num_qualif"));
                        obj1.setNum_compte(rs.getInt("num"));
                        obj1.setNom(rs.getString("nom"));
                        obj1.setPrenom(rs.getString("prenom"));
                        obj1.setAdresse(rs.getString("adresse"));
                        obj1.setCode_postal(rs.getString("code_postal"));
                        obj1.setVille(rs.getString("ville"));
                        obj1.setTel(rs.getString("tel"));
                        obj1.setEmail(rs.getString("email"));
                        obj1.setNum_badge(rs.getInt("num_badge"));
                        obj1.setProfession(rs.getString("profession"));
                        obj1.setDate_naissance(rs.getString("date_naissance"));
                        obj1.setLieu_naissance(rs.getString("lieu_naissance"));
                        obj1.setDate_entree(rs.getString("date_entree"));
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj1;
    }

    public void supprime(Membres prmMembre) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM membres WHERE num_membre =" + prmMembre.getNum_membre() + ";");  
                } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modifie(Membres prmMembre) throws SQLException {
        try 
        {
            Class.forName("org.postgresql.Driver");
            try 
            {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try 
                {
                    int num_membre = prmMembre.getNum_membre();
                    String court = prmMembre.getCourt();
                    int num_qualif = prmMembre.getNum_qualif();
                    int num = prmMembre.getNum_compte();
                    String nom = prmMembre.getNom();
                    String prenom = prmMembre.getPrenom();
                    String adresse = prmMembre.getAdresse();
                    String code_postal = prmMembre.getCode_postal();
                    String ville = prmMembre.getVille();
                    String tel = prmMembre.getTel();
                    String email = prmMembre.getEmail();
                    int num_badge = prmMembre.getNum_badge();
                    String profession = prmMembre.getProfession();
                    String date_naissance = prmMembre.getDate_naissance();
                    String lieu_naissance = prmMembre.getLieu_naissance();
                    String date_entree = prmMembre.getDate_entree();
                    st.executeUpdate("UPDATE membres SET num_membre = " + num_membre + ", court = '" + court + "', num_qualif = " + num_qualif + ", num = " + num + ", nom = '" + nom + "', prenom = '" + prenom + "', adresse = '" + adresse + "', code_postal ='" + code_postal + "', ville ='" + ville + "', tel = '" + tel + "', email = '" + email + "', num_badge = " + num_badge + ", profession = '" + profession + "', date_naissance = '" + date_naissance + "', lieu_naissance = '" + lieu_naissance + "', date_entree = '" + date_entree + "' WHERE num_membre = " + num_membre + ";");
                }
                catch (Exception e) 
                {
                    System.out.println(e);
                }
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

    public List<Membres> tousLesMembres() throws SQLException {
        List<Membres> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM membres ORDER BY num_membre");
                    while (rs.next()) {
                        Membres obj1 = new Membres();
                        obj1.setNum_membre(rs.getInt("num_membre"));
                        obj1.setCourt(rs.getString("court"));
                        obj1.setNum_qualif(rs.getInt("num_qualif"));
                        obj1.setNum_compte(rs.getInt("num"));
                        obj1.setNom(rs.getString("nom"));
                        obj1.setPrenom(rs.getString("prenom"));
                        obj1.setAdresse(rs.getString("adresse"));
                        obj1.setCode_postal(rs.getString("code_postal"));
                        obj1.setVille(rs.getString("ville"));
                        obj1.setTel(rs.getString("tel"));
                        obj1.setEmail(rs.getString("email"));
                        obj1.setNum_badge(rs.getInt("num_badge"));
                        obj1.setProfession(rs.getString("profession"));
                        obj1.setDate_naissance(rs.getString("date_naissance"));
                        obj1.setLieu_naissance(rs.getString("lieu_naissance"));
                        obj1.setDate_entree(rs.getString("date_entree"));
                        lst.add(obj1);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    lst = null;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }
}
