/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;


import domaine.Types;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simon
 */
public class DaoTypesImpl {
    Connection bdd;
    String user;
    String mdp;
    String url;
    String port;
    String base;
    Statement st;
    ResultSet rs;


public DaoTypesImpl() {
      /*  url = "localhost";
        port = "5432";
        base = "Aeroclub";
        user = "postgres";
        mdp = "root"; 
        url = "10.14.66.210";
        port = "5432";
        base = "aeroclub";
        user = "slam";
        mdp = "slam"; */
      
        url = "172.20.10.11";
        port = "5432";
        base = "aeroclub";
        user = "slam";
        mdp = "slam";
}

public DaoTypesImpl(String purl) {
        user = "postgres";
        mdp = "root";
        url = purl;
}

public void ajoute(Types prmTypes) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_types = prmTypes.getNum_types();

                    String libelle = prmTypes.getTypes_libelle();
                    
                    String tauxHoraire = prmTypes.getTypes_prixhoraire();
                    
                    st.executeUpdate("INSERT INTO types VALUES(" + num_types + ",'" + libelle + "','" + tauxHoraire + "')");

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

    public Types cherche(int num) throws SQLException {
        Types obj1 = null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();

                try {
                    rs = st.executeQuery("SELECT * FROM avions WHERE num_avion =" + num + ";");
                    while (rs.next()) {
                        obj1 = new Types();
                        obj1.setNum_types(rs.getInt("num_types"));
                        obj1.setTypes_libelle(rs.getString("types_libelle"));
                        obj1.setTypes_prixhoraire(rs.getString("types_prixhoraire"));
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

    public void supprime(int prmTypes) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    st.executeUpdate("DELETE FROM types WHERE num_types =" + prmTypes + ";");
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

    public void modifie(Types prmTypes) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    int num_types = prmTypes.getNum_types();
             /*       String type = prmTypes.getType();
                    int taux = prmTypes.getTaux();
                    int forfait1 = prmTypes.getForfait1();
                    int forfait2 = prmTypes.getForfait2();
                    int forfait3 = prmTypes.getForfait3();
                    int heures_forfait1 = prmTypes.getHeures_forfait1();
                    int heures_forfait2 = prmTypes.getHeures_forfait2();
                    int heures_forfait3 = prmTypes.getHeures_forfait3();
                    int reduction_semaine = prmTypes.getReduction_semaine(); */
                    String libelle = prmTypes.getTypes_libelle();
                    String prixhoraire = prmTypes.getTypes_prixhoraire();
                    st.executeUpdate("UPDATE types SET types_libelle = '" + libelle + "', types_prixhoraire = '" + prixhoraire + "' WHERE num_types = " + num_types + ";");
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

    public List<Types> tousLesTypes() throws SQLException {
        List<Types> lst = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            try {
                bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                st = bdd.createStatement();
                try {
                    rs = st.executeQuery("SELECT * FROM types ORDER BY num_types");
                    while (rs.next()) {
                        lst.add(new Types(rs.getInt(1), rs.getString(2),rs.getString(3)));
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
    public String sonId(String prmtrLibelle) throws SQLException {
        String num = null;
            try {
                Class.forName("org.postgresql.Driver");
                try {
                    bdd = DriverManager.getConnection("jdbc:postgresql://" + url + ":" + port + "/" + base, user, mdp);
                    st = bdd.createStatement();

                    try {
                        rs = st.executeQuery("SELECT * FROM types WHERE types_libelle = '" + prmtrLibelle + "';");
                    while (rs.next()) {
                        num = rs.getString("num_types");
                         System.out.println(rs.getString("num_types"));
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
            return num;
}

}
