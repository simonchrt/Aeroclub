/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.DaoOperationImpl;
import domaine.Operation;
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
public class AjoutOperation {

    public AjoutOperation() {

        JFrame fenetreAjoutOperation = new JFrame("Ajouter une operation");
        fenetreAjoutOperation.setLayout(null);
        JLabel numOperation = new JLabel("N° Operation");
        JLabel numCompte = new JLabel("N° Compte");
        JLabel date = new JLabel("Date");
        JLabel montant = new JLabel("Montant");
        JLabel motif = new JLabel("Motif / Libellé");

        JTextField formNumOperation = new JTextField();
        JTextField formNumCompte = new JTextField();
        JTextField formDate = new JTextField();
        JTextField formMontant = new JTextField();
        JTextField formMotif = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutOperation.add(numOperation);
        fenetreAjoutOperation.add(numCompte);
        fenetreAjoutOperation.add(date);
        fenetreAjoutOperation.add(montant);
        fenetreAjoutOperation.add(motif);

        fenetreAjoutOperation.add(formNumOperation);
        fenetreAjoutOperation.add(formNumCompte);
        fenetreAjoutOperation.add(formDate);
        fenetreAjoutOperation.add(formMontant);
        fenetreAjoutOperation.add(formMotif);

        fenetreAjoutOperation.add(boutonAjout);
        fenetreAjoutOperation.add(boutonEffacer);
        fenetreAjoutOperation.add(boutonRetour);

        numOperation.setBounds(20, 30, 120, 15);
        numCompte.setBounds(20, 80, 120, 15);
        date.setBounds(20, 130, 120, 15);
        montant.setBounds(20, 180, 120, 15);
        motif.setBounds(20, 230, 230, 15);

        formNumOperation.setBounds(200, 25, 530, 30);
        formNumCompte.setBounds(200, 75, 530, 30);
        formDate.setBounds(200, 125, 530, 30);
        formMontant.setBounds(200, 175, 530, 30);
        formMotif.setBounds(200, 225, 530, 30);

        boutonAjout.setBounds(120, 295, 100, 30);
        boutonEffacer.setBounds(320, 295, 100, 30);
        boutonRetour.setBounds(520, 295, 100, 30);

        fenetreAjoutOperation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutOperation.setResizable(false);
        fenetreAjoutOperation.setLocationRelativeTo(null);
        fenetreAjoutOperation.setSize(750, 375);
        fenetreAjoutOperation.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Operation av1 = new Operation();
                    av1.setNum_operation(Integer.parseUnsignedInt(formNumOperation.getText()));
                    av1.setNum_compte(Integer.parseUnsignedInt(formNumCompte.getText()));
                    av1.setMontant(Integer.parseUnsignedInt(formMontant.getText()));
                    av1.setDate(formDate.getText());
                    av1.setMotif(formMotif.getText());
                    DaoOperationImpl instance = new DaoOperationImpl();
                    instance.ajoute(av1);
                    formNumOperation.setText("");
                    formNumCompte.setText("");
                    formDate.setText("");
                    formMontant.setText("");
                    formMotif.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumOperation.setText("");
                formNumCompte.setText("");
                formDate.setText("");
                formMontant.setText("");
                formMotif.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutOperation.setVisible(false);
                new Choix();
            }
        });
    }
}
