/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoQualifImpl;
import domaine.Qualification;
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
public class AfficherQualification {

    public AfficherQualification() {
        JFrame fenetreAfficherQualif = new JFrame("Affichage operation(s)");
        JButton boutonTousLesQualifs = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelQualif = new JTextField(25);
        JLabel quelQualif = new JLabel("Quelle operation afficher ?");
        fenetreAfficherQualif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherQualif.setSize(900, 375);
        fenetreAfficherQualif.setLocationRelativeTo(null);
        fenetreAfficherQualif.setResizable(true);
        fenetreAfficherQualif.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelQualif);
        pan.add(formQuelQualif);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesQualifs);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Qualif", "Libellé"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherQualif.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherQualif.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoQualifImpl instance = new DaoQualifImpl();
                    Qualification av1 = new Qualification();
                    av1 = instance.cherche(Integer.parseInt(formQuelQualif.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_qualif()), av1.getLibelle()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherQualification.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesQualifs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoQualifImpl instance = new DaoQualifImpl();
                    List<Qualification> tousLesQualifs = new ArrayList<Qualification>();
                    tousLesQualifs = instance.toutesLesQualifications();

                    for (int i = 0; i < tousLesQualifs.size(); i++) {
                        Qualification av1 = new Qualification(tousLesQualifs.get(i).getNum_qualif(), tousLesQualifs.get(i).getLibelle());
                        String[] contenu = {Integer.toString(av1.getNum_qualif()), av1.getLibelle()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherQualification.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelQualif.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherQualif.setVisible(false);
                new Choix();
            }
        });

    }
}
