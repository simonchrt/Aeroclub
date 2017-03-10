/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoVolImpl;
import domaine.Vol;
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
public class AfficherVol {

    public AfficherVol() {
        JFrame fenetreAfficherVol = new JFrame("Affichage vol(s)");
        JButton boutonTousLesVols = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelVol = new JTextField(25);
        JLabel quelVol = new JLabel("Quel vol afficher ?");
        fenetreAfficherVol.setLocationRelativeTo(null);
        fenetreAfficherVol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherVol.setSize(900, 375);
        fenetreAfficherVol.setResizable(false);
        fenetreAfficherVol.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelVol);
        pan.add(formQuelVol);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesVols);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Vol", "N° Membre", "N° Avion", "N° Instructeur", "Date & Heure", "Durée"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherVol.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherVol.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoVolImpl instance = new DaoVolImpl();
                    Vol av1 = new Vol();
                    av1 = instance.cherche(Integer.parseInt(formQuelVol.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_vol()), Integer.toString(av1.getNum_membre()), Integer.toString(av1.getNum_avion()), Integer.toString(av1.getNum_instructeur()), av1.getDateHoraire(), Integer.toString(av1.getTemps())};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherVol.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesVols.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoVolImpl instance = new DaoVolImpl();
                    List<Vol> tousLesVols = new ArrayList<Vol>();
                    tousLesVols = instance.tousLesVol();

                    for (int i = 0; i < tousLesVols.size(); i++) {
                        Vol av1 = new Vol(tousLesVols.get(i).getNum_vol(), tousLesVols.get(i).getNum_membre(), tousLesVols.get(i).getNum_avion(), tousLesVols.get(i).getNum_instructeur(), tousLesVols.get(i).getDateHoraire(), tousLesVols.get(i).getTemps());
                        String[] contenu = {Integer.toString(av1.getNum_vol()), Integer.toString(av1.getNum_membre()), Integer.toString(av1.getNum_avion()), Integer.toString(av1.getNum_instructeur()), av1.getDateHoraire(), Integer.toString(av1.getTemps())};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherVol.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelVol.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherVol.setVisible(false);
                new Choix();
            }
        });

    }
}
