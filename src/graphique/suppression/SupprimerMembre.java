/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.suppression;

import dao.impl.DaoMembresImpl;
import domaine.Membres;
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
public class SupprimerMembre {

    public SupprimerMembre() {
        JFrame fenetreSupprimerMembre = new JFrame("Supprimer un membre");
        fenetreSupprimerMembre.setLayout(null);
        
        JLabel numMembre = new JLabel("N° Membre");

        JTextField formNumMembre = new JTextField();

        JButton boutonSupprimer = new JButton("Supprimer");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        
        fenetreSupprimerMembre.add(numMembre);
        
        fenetreSupprimerMembre.add(formNumMembre);
        
        fenetreSupprimerMembre.add(boutonSupprimer);
        fenetreSupprimerMembre.add(boutonEffacer);
        fenetreSupprimerMembre.add(boutonRetour);

        numMembre.setBounds(20, 30, 120, 15);
        formNumMembre.setBounds(200, 25, 200, 30);

        boutonSupprimer.setBounds(400, 25, 100, 30);
        boutonEffacer.setBounds(510, 25, 100, 30);
        boutonRetour.setBounds(620, 25, 100, 30);

        fenetreSupprimerMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreSupprimerMembre.setResizable(true);
        fenetreSupprimerMembre.setSize(750, 150);
        fenetreSupprimerMembre.setLocationRelativeTo(null);
        fenetreSupprimerMembre.setVisible(true);


        boutonSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Membres av1 = new Membres();
                    av1.setNum_membre(Integer.parseUnsignedInt(formNumMembre.getText()));
                    DaoMembresImpl instance = new DaoMembresImpl();
                    instance.supprime(av1);
                    formNumMembre.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(SupprimerMembre.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumMembre.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreSupprimerMembre.setVisible(false);
                new Choix();
            }
        });
    }
}
