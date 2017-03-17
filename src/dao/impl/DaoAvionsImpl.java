/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Avions;
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
public class DaoAvionsImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoAvionsImpl() {
      /*  url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root"; 
        url = "10.14.66.210";
        port = "5432";
        base = "aeroclub";
        user = "slam";
        mdp = "slam";
    */
        url = "172.20.10.11";
        port = "5432";
        base = "aeroclub";
        user = "slam";
        mdp = "slam";
     
    }

    public DaoAvionsImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Avions prmAvion) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_avion = prmAvion.getNum_avion();
                    String type = prmAvion.getType();
                    
                    String immatriculation = prmAvion.getImmatriculation();
                    /*PreparedStatement preparedStatement = bdd.prepareStatement("INSERT INTO avions VALUES(" + num_avion + "," + type + "," + taux + "," + forfait1 + "," + forfait2 + "," + forfait3 + "," + heures_forfait1 + "," + heures_forfait2 + "," + heures_forfait3 + "," + reduction_semaine + "," + immatriculation + ")");
                    preparedStatement.executeUpdate();*/
                    st.executeUpdate("INSERT INTO avions VALUES(" + num_avion + ",'" + type + "','" + immatriculation + "')");

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

    public Avions cherche(int num) throws SQLException {
        Avions obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM avions WHERE num_avion =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Avions();
                        obj1.setNum_avion(rs.getInt("num_avion"));
 /*                       obj1.setType(rs.getString("type"));
                        obj1.setTaux(rs.getInt("num_avion"));
                        obj1.setForfait1(rs.getInt("forfait1"));
                        obj1.setForfait2(rs.getInt("forfait2"));
                        obj1.setForfait3(rs.getInt("forfait3"));
                        obj1.setHeures_forfait1(rs.getInt("heures_forfait1"));
                        obj1.setHeures_forfait2(rs.getInt("heures_forfait2"));
                        obj1.setHeures_forfait3(rs.getInt("heures_forfait3"));
                        obj1.setReduction_semaine(rs.getInt("reduction_semaine")); */
                        obj1.setImmatriculation(rs.getString("immatriculation"));
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

    public void supprime(int prmAvion) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM avions WHERE num_avion =" + prmAvion + ";");
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

    public void modifie(Avions prmAvion) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_avion = prmAvion.getNum_avion();
                    String type = prmAvion.getType();
                /*    int taux = prmAvion.getTaux();
                    int forfait1 = prmAvion.getForfait1();
                    int forfait2 = prmAvion.getForfait2();
                    int forfait3 = prmAvion.getForfait3();
                    int heures_forfait1 = prmAvion.getHeures_forfait1();
                    int heures_forfait2 = prmAvion.getHeures_forfait2();
                    int heures_forfait3 = prmAvion.getHeures_forfait3();
                    int reduction_semaine = prmAvion.getReduction_semaine(); */
                    String immatriculation = prmAvion.getImmatriculation();
                    st.executeUpdate("UPDATE avions SET immatriculation = '" + immatriculation + "',num_types = '"+ type + "' WHERE num_avion = " + num_avion + ";");
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

    public List<Avions> tousLesAvions() throws SQLException {
        List<Avions> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM avions ORDER BY num_avion");
                    while (rs.next()) {
                        lst.add(new Avions(rs.getInt(1), rs.getString(3),rs.getString(2)));
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
