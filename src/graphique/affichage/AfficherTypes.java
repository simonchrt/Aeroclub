/*
 * To change fenetreAfficherTypes license header, choose License Headers in Project Properties.
 * To change fenetreAfficherTypes template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

import dao.impl.DaoTypesImpl;
import domaine.Types;
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
public class AfficherTypes {

    public AfficherTypes() {
        JFrame fenetreAfficherTypes = new JFrame("Affichage type(s)");
        JButton boutonTousLesTypes = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelType = new JTextField(25);
        JLabel quelType = new JLabel("Quel type afficher ?");
        fenetreAfficherTypes.setLocationRelativeTo(null);
        fenetreAfficherTypes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherTypes.setSize(900, 375);
        fenetreAfficherTypes.setResizable(false);
        fenetreAfficherTypes.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelType);
        pan.add(formQuelType);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesTypes);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Types", "Libelle", "Prix horaire"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherTypes.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherTypes.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoTypesImpl instance = new DaoTypesImpl();
                    Types types1 = new Types();
                    types1 = instance.cherche(Integer.parseInt(formQuelType.getText()));
                    String[] contenu = {Integer.toString(types1.getNum_types()), types1.getTypes_libelle()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherTypes.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesTypes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoTypesImpl instance = new DaoTypesImpl();
                    List<Types> tousLesTypes = new ArrayList<Types>();
                    tousLesTypes = instance.tousLesTypes();

                    for (int i = 0; i < tousLesTypes.size(); i++) {
                        Types types1 = new Types(tousLesTypes.get(i).getNum_types(),tousLesTypes.get(i).getTypes_libelle(),tousLesTypes.get(i).getTypes_prixhoraire());
                        String[] contenu = {Integer.toString(types1.getNum_types()), types1.getTypes_libelle(), types1.getTypes_prixhoraire()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherTypes.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
                boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelType.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherTypes.setVisible(false);
                new Choix();
            }
        });

    }
}
