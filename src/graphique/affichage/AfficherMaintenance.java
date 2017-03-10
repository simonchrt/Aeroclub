/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoMaintenanceImpl;
import domaine.Maintenance;
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
public class AfficherMaintenance {

    public AfficherMaintenance() {
        JFrame fenetreAfficherMaintenance = new JFrame("Affichage operation(s)");
        JButton boutonTousLesQualifs = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelMaintenance = new JTextField(25);
        JLabel quelMaintenance = new JLabel("Quelle operation afficher ?");
        fenetreAfficherMaintenance.setLocationRelativeTo(null);
        fenetreAfficherMaintenance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherMaintenance.setSize(900, 375);
        fenetreAfficherMaintenance.setResizable(false);
        fenetreAfficherMaintenance.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelMaintenance);
        pan.add(formQuelMaintenance);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesQualifs);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Qualif", "N° Avion", "Libellé", "Date"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherMaintenance.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherMaintenance.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
                    Maintenance av1 = new Maintenance();
                    av1 = instance.cherche(Integer.parseInt(formQuelMaintenance.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_maintenance()), Integer.toString(av1.getNum_avion()), av1.getLibelle(), av1.getDate()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherMaintenance.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesQualifs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
                    List<Maintenance> toutesLesMaintenances = new ArrayList<Maintenance>();
                    toutesLesMaintenances = instance.toutesLesMaintenances();

                    for (int i = 0; i < toutesLesMaintenances.size(); i++) {
                        Maintenance av1 = new Maintenance(toutesLesMaintenances.get(i).getNum_maintenance(), toutesLesMaintenances.get(i).getNum_avion(), toutesLesMaintenances.get(i).getLibelle(), toutesLesMaintenances.get(i).getDate());
                        String[] contenu = {Integer.toString(av1.getNum_maintenance()), Integer.toString(av1.getNum_avion()), av1.getLibelle(), av1.getDate()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherMaintenance.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelMaintenance.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherMaintenance.setVisible(false);
                new Choix();
            }
        });

    }
}
