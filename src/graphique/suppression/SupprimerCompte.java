/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.suppression;

import dao.impl.DaoComptesImpl;
import domaine.CompteOperation;
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
public class SupprimerCompte {

    public SupprimerCompte() {
        JFrame fenetreSupprimerCompte = new JFrame("Supprimer un compte");
        fenetreSupprimerCompte.setLayout(null);
        
        JLabel numCompte = new JLabel("N° Compte");

        JTextField formNumCompte = new JTextField();

        JButton boutonSupprimer = new JButton("Supprimer");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        
        fenetreSupprimerCompte.add(numCompte);
        
        fenetreSupprimerCompte.add(formNumCompte);
        
        fenetreSupprimerCompte.add(boutonSupprimer);
        fenetreSupprimerCompte.add(boutonEffacer);
        fenetreSupprimerCompte.add(boutonRetour);

        numCompte.setBounds(20, 30, 120, 15);
        formNumCompte.setBounds(200, 25, 200, 30);

        boutonSupprimer.setBounds(400, 25, 100, 30);
        boutonEffacer.setBounds(510, 25, 100, 30);
        boutonRetour.setBounds(620, 25, 100, 30);

        fenetreSupprimerCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreSupprimerCompte.setResizable(false);
        fenetreSupprimerCompte.setSize(750, 150);
        fenetreSupprimerCompte.setLocationRelativeTo(null);
        fenetreSupprimerCompte.setVisible(true);


        boutonSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CompteOperation av1 = new CompteOperation();
                    av1.setNum(Integer.parseUnsignedInt(formNumCompte.getText()));
                    DaoComptesImpl instance = new DaoComptesImpl();
                    instance.supprime(av1);
                    formNumCompte.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(SupprimerCompte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumCompte.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreSupprimerCompte.setVisible(false);
                new Choix();
            }
        });
    }
}
