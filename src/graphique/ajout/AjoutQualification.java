/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

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
import javax.swing.JTextField;

/**
 *
 * @author SSII-Dev
 */
public class AjoutQualification {
    
    public AjoutQualification(){
        JFrame fenetreAjoutQualif = new JFrame("Ajouter une Qualification");
        fenetreAjoutQualif.setLayout(null);
        JLabel numQualif = new JLabel("Numéro Qualification");
        JLabel qualif = new JLabel("Nom Qualification");

        JTextField formNumQualif = new JTextField();
        JTextField formQualif = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutQualif.add(numQualif);
        fenetreAjoutQualif.add(qualif);
        fenetreAjoutQualif.add(formNumQualif);
        fenetreAjoutQualif.add(formQualif);
        fenetreAjoutQualif.add(boutonAjout);
        fenetreAjoutQualif.add(boutonEffacer);
        fenetreAjoutQualif.add(boutonRetour);

        numQualif.setBounds(20, 30, 120, 15);
        qualif.setBounds(20, 80, 120, 15);

        formNumQualif.setBounds(200, 25, 530, 30);
        formQualif.setBounds(200, 75, 530, 30);

        boutonAjout.setBounds(120, 140, 100, 30);
        boutonEffacer.setBounds(320, 140, 100, 30);
        boutonRetour.setBounds(520, 140, 100, 30);

        fenetreAjoutQualif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutQualif.setResizable(false);
        fenetreAjoutQualif.setSize(750, 210);
        fenetreAjoutQualif.setLocationRelativeTo(null);
        fenetreAjoutQualif.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Qualification cp1 = new Qualification();
                    cp1.setNum_qualif(Integer.parseUnsignedInt(formNumQualif.getText()));
                    cp1.setLibelle(formQualif.getText());
                    DaoQualifImpl instance = new DaoQualifImpl();
                    instance.ajoute(cp1);
                    formNumQualif.setText("");
                    formQualif.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutQualification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumQualif.setText("");
                    formQualif.setText("");
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutQualif.setVisible(false);
                new Choix();
            }
        });
    }
    
}
