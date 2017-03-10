/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Instructeurs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class DaoInstructeursImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoInstructeursImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoInstructeursImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Instructeurs prmInstructeur) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_instructeur = prmInstructeur.getNum_instructeur();
                    String nom = prmInstructeur.getNom();
                    String prenom = prmInstructeur.getPrenom();
                    int taux_instructeur = prmInstructeur.getTaux_instructeur();
                    String adresse = prmInstructeur.getAdresse();
                    String code_postal = prmInstructeur.getCode_postal();
                    String ville = prmInstructeur.getVille();
                    String tel = prmInstructeur.getTel();
                    String portable = prmInstructeur.getPortable();
                    String fax = prmInstructeur.getFax();
                    String commentaire = prmInstructeur.getCommentaire();
                    String num_badge = prmInstructeur.getNum_badge();
                    st.executeUpdate("INSERT INTO instructeurs VALUES(" + num_instructeur + "', '" + nom + "', '" + prenom + "', " + taux_instructeur + ", '" + adresse + "' , '" + code_postal + "' , '" + ville + "' , '" + tel + "' , '" + portable + "', '" + fax + "' , '" + commentaire + "' , '" + num_badge + "');");
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

    public Instructeurs cherche(int num) throws SQLException {
        Instructeurs obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM instructeurs WHERE num_instructeur =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Instructeurs();
                        obj1.setNum_instructeur(rs.getInt("num_instructeur"));
                        obj1.setNom(rs.getString("nom"));
                        obj1.setPrenom(rs.getString("prenom"));
                        obj1.setTaux_instructeur(rs.getInt("taux_instructeur"));
                        obj1.setAdresse(rs.getString("adresse"));
                        obj1.setCode_postal(rs.getString("code_postal"));
                        obj1.setVille(rs.getString("ville"));
                        obj1.setTel(rs.getString("tel"));
                        obj1.setPortable(rs.getString("portable"));
                        obj1.setFax(rs.getString("fax"));
                        obj1.setCommentaire(rs.getString("commentaire"));
                        obj1.setNum_badge(rs.getString("num_badge"));
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

    public void supprime(int prmInstructeur) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM instructeurs WHERE num_instructeur =" + prmInstructeur + ";");
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

    public void modifie(Instructeurs prmInstructeur) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_instructeur = prmInstructeur.getNum_instructeur();
                    String nom = prmInstructeur.getNom();
                    String prenom = prmInstructeur.getPrenom();
                    int taux_instructeur = prmInstructeur.getTaux_instructeur();
                    String adresse = prmInstructeur.getAdresse();
                    String code_postal = prmInstructeur.getCode_postal();
                    String ville = prmInstructeur.getVille();
                    String tel = prmInstructeur.getTel();
                    String portable = prmInstructeur.getPortable();
                    String fax = prmInstructeur.getFax();
                    String commentaire = prmInstructeur.getCommentaire();
                    String num_badge = prmInstructeur.getNum_badge();
                    st.executeUpdate("UPDATE instructeurs SET nom = '" + nom + "', prenom = '" + prenom + "', taux_instructeur = " + taux_instructeur + ", adresse = '" + adresse + "' , code_postal = '" + code_postal + "' , ville = '" + ville + "' , tel = '" + tel + "' , portable = '" + portable + "', fax = '" + fax + "' , commentaire = '" + commentaire + "' , num_badge = '" + num_badge + "' WHERE num_instructeur = " + num_instructeur + ";");
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

    public List<Instructeurs> tousLesInstructeurs() throws SQLException {
        List<Instructeurs> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM instructeurs ORDER BY num_instructeur");
                    while (rs.next()) {
                        lst.add(new Instructeurs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)));
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
