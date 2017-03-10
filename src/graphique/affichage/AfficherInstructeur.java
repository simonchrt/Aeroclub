/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoInstructeursImpl;
import domaine.Instructeurs;
import graphique.Choix;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SSII-Dev
 */
public class AfficherInstructeur {

    public AfficherInstructeur() {
        JFrame fenetreAfficherInstructeur = new JFrame("Affichage instructeur(s)");
        JButton boutonTousLesInstructeurs = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelInstructeur = new JTextField(25);
        JLabel quelInstructeur = new JLabel("Quel instructeur afficher ?");
        fenetreAfficherInstructeur.setLocationRelativeTo(null);
        fenetreAfficherInstructeur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherInstructeur.setSize(900, 375);
        fenetreAfficherInstructeur.setResizable(true);
        fenetreAfficherInstructeur.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelInstructeur);
        pan.add(formQuelInstructeur);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesInstructeurs);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Instructeur", "Nom", "Prenom", "Taux", "Adresse", "Code Postal", "Ville", "Tel", "Portable", "Fax", "Commentaire", "Num Badge"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherInstructeur.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherInstructeur.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoInstructeursImpl instance = new DaoInstructeursImpl();
                    Instructeurs av1 = new Instructeurs();
                    av1 = instance.cherche(Integer.parseInt(formQuelInstructeur.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_instructeur()), av1.getNom(), av1.getPrenom(), Integer.toString(av1.getTaux_instructeur()), av1.getAdresse(), av1.getCode_postal(), av1.getVille(), av1.getTel(), av1.getPortable(), av1.getFax(), av1.getCommentaire(), av1.getNum_badge()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherInstructeur.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesInstructeurs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoInstructeursImpl instance = new DaoInstructeursImpl();
                    List<Instructeurs> tousLesInstructeurs = new ArrayList<Instructeurs>();
                    tousLesInstructeurs = instance.tousLesInstructeurs();

                    for (int i = 0; i < tousLesInstructeurs.size(); i++) {
                        Instructeurs av1 = new Instructeurs(tousLesInstructeurs.get(i).getNum_instructeur(), tousLesInstructeurs.get(i).getNom(), tousLesInstructeurs.get(i).getPrenom(), tousLesInstructeurs.get(i).getTaux_instructeur(), tousLesInstructeurs.get(i).getAdresse(), tousLesInstructeurs.get(i).getCode_postal(), tousLesInstructeurs.get(i).getVille(), tousLesInstructeurs.get(i).getTel(), tousLesInstructeurs.get(i).getPortable(), tousLesInstructeurs.get(i).getFax(), tousLesInstructeurs.get(i).getCommentaire(), tousLesInstructeurs.get(i).getNum_badge());
                        String[] contenu = {Integer.toString(av1.getNum_instructeur()), av1.getNom(), av1.getPrenom(), Integer.toString(av1.getTaux_instructeur()), av1.getAdresse(), av1.getCode_postal(), av1.getVille(), av1.getTel(), av1.getPortable(), av1.getFax(), av1.getCommentaire(), av1.getNum_badge()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherInstructeur.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelInstructeur.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherInstructeur.setVisible(false);
                new Choix();
            }
        });

    }
}
