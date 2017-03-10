/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoComptesImpl;
import domaine.CompteOperation;
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
public class AfficherCompte {

    public AfficherCompte() {
        JFrame fenetreAfficherCompte = new JFrame("Affichage operation(s)");
        JButton boutonTousLesQualifs = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelCompte = new JTextField(25);
        JLabel quelCompte = new JLabel("Quelle operation afficher ?");
        fenetreAfficherCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherCompte.setSize(900, 375);
        fenetreAfficherCompte.setLocationRelativeTo(null);
        fenetreAfficherCompte.setResizable(false);
        fenetreAfficherCompte.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelCompte);
        pan.add(formQuelCompte);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesQualifs);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Compte", "Solde restant (€)"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherCompte.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherCompte.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoComptesImpl instance = new DaoComptesImpl();
                    CompteOperation av1 = new CompteOperation();
                    av1 = instance.cherche(Integer.parseInt(formQuelCompte.getText()));
                    String[] contenu = {Integer.toString(av1.getNum()), Double.toString(av1.getSolde())};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherCompte.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesQualifs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoComptesImpl instance = new DaoComptesImpl();
                    List<CompteOperation> tousLesComptes = new ArrayList<CompteOperation>();
                    tousLesComptes = instance.tousLesComptes();

                    for (int i = 0; i < tousLesComptes.size(); i++) {
                        CompteOperation av1 = new CompteOperation(tousLesComptes.get(i).getNum(), tousLesComptes.get(i).getSolde());
                        String[] contenu = {Integer.toString(av1.getNum()), Double.toString(av1.getSolde())};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherCompte.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelCompte.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherCompte.setVisible(false);
                new Choix();
            }
        });

    }
}

