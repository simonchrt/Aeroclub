/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.modification;

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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author SSII-Dev
 */
public class ModificationCompte {

    public ModificationCompte() {
        JFrame fenetreModificationCompte = new JFrame("Modifier un compte");
        fenetreModificationCompte.setLayout(null);
        
        JLabel numCompte = new JLabel("N° Compte");
        JLabel solde = new JLabel("Solde");

        JTextField formNumCompte = new JTextField();
        JTextField formSolde = new JTextField();;

        JButton boutonModification = new JButton("Modifier");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreModificationCompte.add(numCompte);
        fenetreModificationCompte.add(solde);

        fenetreModificationCompte.add(formNumCompte);
        fenetreModificationCompte.add(formSolde);
        fenetreModificationCompte.add(boutonModification);
        fenetreModificationCompte.add(boutonEffacer);
        fenetreModificationCompte.add(boutonRetour);

        numCompte.setBounds(20, 30, 120, 15);
        solde.setBounds(20, 70, 120, 15);

        formNumCompte.setBounds(200, 25, 530, 30);
        formSolde.setBounds(200, 65, 530, 30);

        boutonModification.setBounds(120, 115, 100, 30);
        boutonEffacer.setBounds(320, 115, 100, 30);
        boutonRetour.setBounds(520, 115, 100, 30);

        fenetreModificationCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreModificationCompte.setResizable(true);
        fenetreModificationCompte.setSize(750, 220);
        fenetreModificationCompte.setLocationRelativeTo(null);
        fenetreModificationCompte.setVisible(true);


        boutonModification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CompteOperation av1 = new CompteOperation();
                    av1.setNum(Integer.parseUnsignedInt(formNumCompte.getText()));
                    av1.setSolde(Double.parseDouble(formSolde.getText()));

                    DaoComptesImpl instance = new DaoComptesImpl();
                    instance.modifie(av1);
                    formNumCompte.setText("");
                    formSolde.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(ModificationCompte.class.getName()).log(Level.SEVERE, null, ex);
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
                fenetreModificationCompte.setVisible(false);
                new Choix();
            }
        });
    }
}
