/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Operation;
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
public class DaoOperationImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoOperationImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoOperationImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(Operation prmOperation) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_operation = prmOperation.getNum_operation();
                    int num_compte = prmOperation.getNum_compte();
                    String date = prmOperation.getDate();
                    float montant = prmOperation.getMontant();
                    String motif = prmOperation.getMotif();
                    st.executeUpdate("INSERT INTO operation VALUES(" + num_operation + ", " + num_compte + " , '" + date +"' , " + montant + ", '" + motif + "')");

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

    public Operation cherche(int num) throws SQLException {
        Operation obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM operation WHERE num_operation =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Operation();
                        obj1.setNum_operation(rs.getInt("num_operation"));
                        obj1.setNum_compte(rs.getInt("num_compte"));
                        obj1.setDate(rs.getString("date"));
                        obj1.setMontant(rs.getFloat("montant"));
                        obj1.setMotif(rs.getString("motif"));
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

    public void supprime(int prmOperation) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM operation WHERE num_operation =" + prmOperation + ";");
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

    public void modifie(Operation prmOperation) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_operation = prmOperation.getNum_operation();
                    int num_compte = prmOperation.getNum_compte();
                    String date = prmOperation.getDate();
                    float montant = prmOperation.getMontant();
                    String motif = prmOperation.getMotif();
                    st.executeUpdate("UPDATE operation SET num_operation = " + num_operation + ", num_compte = " + num_compte + " , date = '" + date +"' , montant = " + montant + ", motif =  '" + motif + "' WHERE num_operation = " + num_operation + ";");
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

    public List<Operation> toutesLesOperations() throws SQLException {
        List<Operation> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM operation ORDER BY num_operation");
                    while (rs.next()) {
                        lst.add(new Operation(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getFloat(4), rs.getString(5)));
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
