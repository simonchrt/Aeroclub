/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.CompteOperation;
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
public class DaoComptesImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoComptesImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoComptesImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public void ajoute(CompteOperation prmCompte) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num = prmCompte.getNum();
                    double solde = prmCompte.getSolde();
                    st.executeUpdate("INSERT INTO comptes VALUES(" + num + "," + solde + ")");

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

    public CompteOperation cherche(int num) throws SQLException {
        CompteOperation obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM comptes WHERE num =" + num + ";");
                    while (rs.next()) {
                        obj1 = new CompteOperation();
                        obj1.setNum(rs.getInt("num"));
                        obj1.setSolde(rs.getDouble("solde"));
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

    public void supprime(CompteOperation prmCompte) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM comptes WHERE num =" + prmCompte.getNum() + ";");
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

    public void modifie(CompteOperation prmCompte) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num = prmCompte.getNum();
                    double solde = prmCompte.getSolde();
                    st.executeUpdate("UPDATE comptes SET solde = " + solde + " WHERE num = " + num + ";");
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

    public List<CompteOperation> tousLesComptes() throws SQLException {
        List<CompteOperation> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM comptes ORDER BY num");
                    while (rs.next()) {
                        lst.add(new CompteOperation(rs.getInt(1), rs.getDouble(2)));
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
