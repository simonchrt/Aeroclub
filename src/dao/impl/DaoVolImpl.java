/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Avions;
import domaine.Membres;
import domaine.Instructeurs;
import domaine.Vol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class DaoVolImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoVolImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoVolImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Vol prmVol) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_vol = prmVol.getNum_vol();
                    int num_membre = prmVol.getNum_membre();
                    int num_avion = prmVol.getNum_avion();
                    int num_instructeur = prmVol.getNum_instructeur();
                    String dateHoraire = prmVol.getDateHoraire();
                    int temps = prmVol.getTemps();
                    /*PreparedStatement preparedStatement = bdd.prepareStatement("INSERT INTO vol VALUES(" + num_vol + "," + type + "," + taux + "," + forfait1 + "," + forfait2 + "," + forfait3 + "," + heures_forfait1 + "," + heures_forfait2 + "," + heures_forfait3 + "," + reduction_semaine + "," + immatriculation + ")");
                    preparedStatement.executeUpdate();*/
                    st.executeUpdate("INSERT INTO vol VALUES(" + num_vol + ",'" + num_membre + "'," + num_avion + "," + num_instructeur + ",'" + dateHoraire + "'," + temps + " )");

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

    public Vol cherche(int num) throws SQLException {
        Vol obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM vol WHERE num_vol =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Vol();
                        obj1.setNum_vol(rs.getInt("num_vol"));
                        obj1.setNum_membre(rs.getInt("num_membre"));
                        obj1.setNum_avion(rs.getInt("num_avion"));
                        obj1.setNum_instructeur(rs.getInt("num_instructeur"));
                        obj1.setDateHoraire(rs.getString("datehoraire"));
                        obj1.setTemps(rs.getInt("temps"));
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

    public void supprime(int prmVol) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM vol WHERE num_vol =" + prmVol + ";");
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

    public void modifie(Vol prmVol) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_vol = prmVol.getNum_vol();
                    int num_membre = prmVol.getNum_membre();
                    int num_avion = prmVol.getNum_avion();
                    int num_instructeur = prmVol.getNum_instructeur();
                    String dateHoraire = prmVol.getDateHoraire();
                    int temps = prmVol.getTemps();
                    st.executeUpdate("UPDATE vol SET num_membre = " + num_membre + ", num_avion = " + num_avion + ", num_instructeur = " + num_instructeur + ", datehoraire = '" + dateHoraire + "', temps = '" + temps + "' WHERE num_vol = " + num_vol + ";");
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

    public List<Vol> tousLesVol() throws SQLException {
        List<Vol> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM vol ORDER BY num_vol");
                    while (rs.next()) {
                        lst.add(new Vol(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
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