/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

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
public class AjoutCompte {
       public AjoutCompte() {
        JFrame fenetreAjoutCompte = new JFrame("Ajouter un compte");
        fenetreAjoutCompte.setLayout(null);
        JLabel numCompte = new JLabel("Numéro du Compte");
        JLabel solde = new JLabel("Solde du Compte");

        JTextField formNumCompte = new JTextField();
        JTextField formSolde = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutCompte.add(numCompte);
        fenetreAjoutCompte.add(solde);
        fenetreAjoutCompte.add(formNumCompte);
        fenetreAjoutCompte.add(formSolde);
        fenetreAjoutCompte.add(boutonAjout);
        fenetreAjoutCompte.add(boutonEffacer);
        fenetreAjoutCompte.add(boutonRetour);

        numCompte.setBounds(20, 30, 120, 15);
        solde.setBounds(20, 80, 120, 15);

        formNumCompte.setBounds(200, 25, 530, 30);
        formSolde.setBounds(200, 75, 530, 30);

        boutonAjout.setBounds(120, 140, 100, 30);
        boutonEffacer.setBounds(320, 140, 100, 30);
        boutonRetour.setBounds(520, 140, 100, 30);

        fenetreAjoutCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutCompte.setResizable(false);
        fenetreAjoutCompte.setSize(750, 210);
        fenetreAjoutCompte.setLocationRelativeTo(null);
        fenetreAjoutCompte.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CompteOperation cp1 = new CompteOperation();
                    cp1.setNum(Integer.parseUnsignedInt(formNumCompte.getText()));
                    cp1.setSolde(Double.parseDouble(formSolde.getText()));
                    DaoComptesImpl instance = new DaoComptesImpl();
                    instance.ajoute(cp1);
                    formNumCompte.setText("");
                    formSolde.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutCompte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumCompte.setText("");
                    formSolde.setText("");
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutCompte.setVisible(false);
                new Choix();
            }
        });
    } 
}
