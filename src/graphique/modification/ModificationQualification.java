/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.modification;

import dao.impl.DaoQualifImpl;
import domaine.Qualification;
import graphique.Choix;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author SSII-Dev
 */
public class ModificationQualification {

    public ModificationQualification() {
        JFrame fenetreModificationQualification = new JFrame("Modifier une Qualification");
        fenetreModificationQualification.setLayout(null);
        
        JLabel numQualif = new JLabel("N° Qualification");
        JLabel libelle = new JLabel("Libellé");

        JTextField formNumQualification = new JTextField();
        JTextField formLibelle = new JTextField();;

        JButton boutonModification = new JButton("Modifier");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreModificationQualification.add(numQualif);
        fenetreModificationQualification.add(libelle);

        fenetreModificationQualification.add(formNumQualification);
        fenetreModificationQualification.add(formLibelle);
        fenetreModificationQualification.add(boutonModification);
        fenetreModificationQualification.add(boutonEffacer);
        fenetreModificationQualification.add(boutonRetour);

        numQualif.setBounds(20, 30, 120, 15);
        libelle.setBounds(20, 70, 120, 15);

        formNumQualification.setBounds(200, 25, 530, 30);
        formLibelle.setBounds(200, 65, 530, 30);

        boutonModification.setBounds(120, 115, 100, 30);
        boutonEffacer.setBounds(320, 115, 100, 30);
        boutonRetour.setBounds(520, 115, 100, 30);

        fenetreModificationQualification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreModificationQualification.setResizable(true);
        fenetreModificationQualification.setSize(750, 220);
        fenetreModificationQualification.setLocationRelativeTo(null);
        fenetreModificationQualification.setVisible(true);


        boutonModification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Qualification av1 = new Qualification();
                    av1.setNum_qualif(Integer.parseUnsignedInt(formNumQualification.getText()));
                    av1.setLibelle(formLibelle.getText());

                    DaoQualifImpl instance = new DaoQualifImpl();
                    instance.modifie(av1);
                    formNumQualification.setText("");
                    formLibelle.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(ModificationQualification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumQualification.setText("");
                formLibelle.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreModificationQualification.setVisible(false);
                new Choix();
            }
        });
    }
}
