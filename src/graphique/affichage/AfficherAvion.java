/*
 * To change fenetreAfficherAvion license header, choose License Headers in Project Properties.
 * To change fenetreAfficherAvion template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoAvionsImpl;
import domaine.Avions;
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
public class AfficherAvion {

    public AfficherAvion() {
        JFrame fenetreAfficherAvion = new JFrame("Affichage avion(s)");
        JButton boutonTousLesAvions = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelAvion = new JTextField(25);
        JLabel quelAvion = new JLabel("Quel avion afficher ?");
        fenetreAfficherAvion.setLocationRelativeTo(null);
        fenetreAfficherAvion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherAvion.setSize(900, 375);
        fenetreAfficherAvion.setResizable(false);
        fenetreAfficherAvion.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelAvion);
        pan.add(formQuelAvion);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesAvions);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Avion", "Type", "Type", "Forfait 1", "Forfait 2", "Forfait 3", "H Forfait 1", "H Forfait 2", "H Forfait 3", "Réduction", "Immatric."};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherAvion.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherAvion.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoAvionsImpl instance = new DaoAvionsImpl();
                    Avions av1 = new Avions();
                    av1 = instance.cherche(Integer.parseInt(formQuelAvion.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_avion()), av1.getImmatriculation()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherAvion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesAvions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoAvionsImpl instance = new DaoAvionsImpl();
                    List<Avions> tousLesAvions = new ArrayList<Avions>();
                    tousLesAvions = instance.tousLesAvions();

                    for (int i = 0; i < tousLesAvions.size(); i++) {
                        Avions av1 = new Avions(tousLesAvions.get(i).getNum_avion(),tousLesAvions.get(i).getImmatriculation(),tousLesAvions.get(i).getType());
                        String[] contenu = {Integer.toString(av1.getNum_avion()), av1.getImmatriculation()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherAvion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
                boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelAvion.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherAvion.setVisible(false);
                new Choix();
            }
        });

    }
}
