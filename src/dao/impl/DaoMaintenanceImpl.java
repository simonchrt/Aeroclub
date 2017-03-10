/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Avions;
import domaine.Maintenance;
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
public class DaoMaintenanceImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoMaintenanceImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoMaintenanceImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Maintenance prmMaintenance) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_maintenance = prmMaintenance.getNum_maintenance();
                    int num_avion = prmMaintenance.getNum_avion();
                    String libelle = prmMaintenance.getLibelle();
                    String date = prmMaintenance.getDate();
                    st.executeUpdate("INSERT INTO maintenance VALUES(" + num_maintenance + ", " + num_avion + " , '" + libelle + "' , '" + date + "');");

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

    public Maintenance cherche(int num) throws SQLException {
        Maintenance obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM maintenance WHERE num_maintenance =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Maintenance();
                        obj1.setNum_maintenance(rs.getInt("num_maintenance"));
                        obj1.setNum_avion(rs.getInt("num_avion"));
                        obj1.setLibelle(rs.getString("libelle"));
                        obj1.setDate(rs.getString("date"));
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

    public void supprime(int prmMaintenance) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM maintenance WHERE num_maintenance =" + prmMaintenance + ";");
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

    public void modifie(Maintenance prmMaintenance) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_maintenance = prmMaintenance.getNum_maintenance();
                    int num_avion = prmMaintenance.getNum_avion();
                    String libelle = prmMaintenance.getLibelle();
                    String date = prmMaintenance.getDate();
                    st.executeUpdate("UPDATE maintenance SET num_maintenance = " + num_maintenance + " , num_avion = " + num_avion + " , libelle = '" + libelle + "' ,  date = '" + date + "' WHERE num_maintenance = " + num_maintenance + ";");
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

    public List<Maintenance> toutesLesMaintenances() throws SQLException {
        List<Maintenance> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM maintenance ORDER BY num_maintenance");
                    while (rs.next()) {
                        lst.add(new Maintenance(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),null));
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