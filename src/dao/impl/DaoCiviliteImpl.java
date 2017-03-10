/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domaine.Civilite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Raphael Hakem
 */
public class DaoCiviliteImpl {

    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;

    public DaoCiviliteImpl() {
        url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root";

    }

    public DaoCiviliteImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
    }

    public Civilite cherche(String court) throws SQLException, ClassNotFoundException {
        Civilite obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM civilite WHERE court ='" + court + "';");
                    while (rs.next()) {
                        obj1 = new Civilite();
                        obj1.setCourt(rs.getString("court"));
                        obj1.setEntier(rs.getString("entier"));
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
}
