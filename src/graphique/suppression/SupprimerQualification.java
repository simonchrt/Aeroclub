/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.suppression;

import dao.impl.DaoMembresImpl;
import dao.impl.DaoQualifImpl;
import domaine.Membres;
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
public class SupprimerQualification {

    public SupprimerQualification() {
        JFrame fenetreSupprimerQualification = new JFrame("Supprimer une qualification");
        fenetreSupprimerQualification.setLayout(null);
        
        JLabel numQualification = new JLabel("N° Qualification");

        JTextField formNumQualification = new JTextField();

        JButton boutonSupprimer = new JButton("Supprimer");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        
        fenetreSupprimerQualification.add(numQualification);
        
        fenetreSupprimerQualification.add(formNumQualification);
        
        fenetreSupprimerQualification.add(boutonSupprimer);
        fenetreSupprimerQualification.add(boutonEffacer);
        fenetreSupprimerQualification.add(boutonRetour);

        numQualification.setBounds(20, 30, 120, 15);
        formNumQualification.setBounds(200, 25, 200, 30);

        boutonSupprimer.setBounds(400, 25, 100, 30);
        boutonEffacer.setBounds(510, 25, 100, 30);
        boutonRetour.setBounds(620, 25, 100, 30);

        fenetreSupprimerQualification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreSupprimerQualification.setResizable(false);
        fenetreSupprimerQualification.setSize(750, 150);
        fenetreSupprimerQualification.setLocationRelativeTo(null);
        fenetreSupprimerQualification.setVisible(true);


        boutonSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Qualification av1 = new Qualification();
                    av1.setNum_qualif(Integer.parseUnsignedInt(formNumQualification.getText()));
                    DaoQualifImpl instance = new DaoQualifImpl();
                    instance.supprime(av1);
                    formNumQualification.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(SupprimerQualification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumQualification.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreSupprimerQualification.setVisible(false);
                new Choix();
            }
        });
    }
}
