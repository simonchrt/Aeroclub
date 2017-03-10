/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoOperationImpl;
import domaine.Operation;
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
public class AfficherOperation {

    public AfficherOperation() {
        JFrame fenetreAfficherOperation = new JFrame("Affichage operation(s)");
        JButton boutonTousLesOperations = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelOperation = new JTextField(25);
        JLabel quelOperation = new JLabel("Quel operation afficher ?");
        fenetreAfficherOperation.setLocationRelativeTo(null);
        fenetreAfficherOperation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherOperation.setSize(900, 375);
        fenetreAfficherOperation.setResizable(false);
        fenetreAfficherOperation.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelOperation);
        pan.add(formQuelOperation);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesOperations);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Operation", "N° Compte", "Date", "Montant", "Motif"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherOperation.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherOperation.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoOperationImpl instance = new DaoOperationImpl();
                    Operation av1 = new Operation();
                    av1 = instance.cherche(Integer.parseInt(formQuelOperation.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_operation()), Integer.toString(av1.getNum_operation()), av1.getDate(), Float.toString(av1.getMontant()), av1.getMotif()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherOperation.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoOperationImpl instance = new DaoOperationImpl();
                    List<Operation> tousLesOperations = new ArrayList<Operation>();
                    tousLesOperations = instance.toutesLesOperations();

                    for (int i = 0; i < tousLesOperations.size(); i++) {
                        Operation av1 = new Operation(tousLesOperations.get(i).getNum_operation(), tousLesOperations.get(i).getNum_compte(), tousLesOperations.get(i).getDate(), tousLesOperations.get(i).getMontant(), tousLesOperations.get(i).getMotif());
                        String[] contenu = {Integer.toString(av1.getNum_operation()), Integer.toString(av1.getNum_operation()), av1.getDate(), Float.toString(av1.getMontant()), av1.getMotif()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherOperation.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelOperation.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherOperation.setVisible(false);
                new Choix();
            }
        });

    }
}
