/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.DaoInstructeursImpl;
import domaine.Instructeurs;
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
public class AjoutInstructeur {
    public AjoutInstructeur(){
    JFrame fenetreAjoutInstructeur = new JFrame("Ajouter un instructeur");
        fenetreAjoutInstructeur.setLayout(null);
        JLabel numInstructeur = new JLabel("Numéro Instructeur");
        JLabel nom = new JLabel("Nom");
        JLabel prenom = new JLabel("Prenom");
        JLabel tauxInstructeur = new JLabel("Taux instructeur");
        JLabel adresse = new JLabel("Adresse");
        JLabel codePostal = new JLabel("Code Postal");
        JLabel ville = new JLabel("Ville");
        JLabel tel = new JLabel("Téléphone");
        JLabel portable = new JLabel("Portable");
        JLabel fax = new JLabel("Fax");
        JLabel commentaire = new JLabel("Commentaire");
        JLabel numBadge = new JLabel("N° Badge");

        JTextField formNumInstructeur = new JTextField();
        JTextField formNom = new JTextField();
        JTextField formPrenom = new JTextField();
        JTextField formTauxInstructeur = new JTextField();
        JTextField formAdresse = new JTextField();
        JTextField formCodePostal = new JTextField();
        JTextField formVille = new JTextField();
        JTextField formTel = new JTextField();
        JTextField formPortable = new JTextField();
        JTextField formFax = new JTextField();
        JTextField formCommentaire = new JTextField();
        JTextField formNumBadge = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutInstructeur.add(numInstructeur);
        fenetreAjoutInstructeur.add(nom);
        fenetreAjoutInstructeur.add(prenom);
        fenetreAjoutInstructeur.add(tauxInstructeur);
        fenetreAjoutInstructeur.add(adresse);
        fenetreAjoutInstructeur.add(codePostal);
        fenetreAjoutInstructeur.add(ville);
        fenetreAjoutInstructeur.add(tel);
        fenetreAjoutInstructeur.add(portable);
        fenetreAjoutInstructeur.add(fax);
        fenetreAjoutInstructeur.add(commentaire);
        fenetreAjoutInstructeur.add(numBadge);
        fenetreAjoutInstructeur.add(formNumInstructeur);
        fenetreAjoutInstructeur.add(formNom);
        fenetreAjoutInstructeur.add(formPrenom);
        fenetreAjoutInstructeur.add(formTauxInstructeur);
        fenetreAjoutInstructeur.add(formAdresse);
        fenetreAjoutInstructeur.add(formCodePostal);
        fenetreAjoutInstructeur.add(formVille);
        fenetreAjoutInstructeur.add(formTel);
        fenetreAjoutInstructeur.add(formPortable);
        fenetreAjoutInstructeur.add(formFax);
        fenetreAjoutInstructeur.add(formCommentaire);
        fenetreAjoutInstructeur.add(formNumBadge);
        fenetreAjoutInstructeur.add(boutonAjout);
        fenetreAjoutInstructeur.add(boutonEffacer);
        fenetreAjoutInstructeur.add(boutonRetour);

        numInstructeur.setBounds(20, 30, 120, 15);
        nom.setBounds(20, 80, 120, 15);
        prenom.setBounds(20, 130, 120, 15);
        tauxInstructeur.setBounds(20, 180, 120, 15);
        adresse.setBounds(20, 230, 120, 15);
        codePostal.setBounds(20, 280, 120, 15);
        ville.setBounds(20, 330, 120, 15);
        tel.setBounds(20, 380, 120, 15);
        portable.setBounds(20, 430, 120, 15);
        fax.setBounds(20, 480, 120, 15);
        commentaire.setBounds(20, 530, 120, 15);
        numBadge.setBounds(20, 580, 120, 15);

        formNumInstructeur.setBounds(200, 25, 530, 30);
        formNom.setBounds(200, 75, 530, 30);
        formPrenom.setBounds(200, 125, 530, 30);
        formTauxInstructeur.setBounds(200, 175, 530, 30);
        formAdresse.setBounds(200, 225, 530, 30);
        formCodePostal.setBounds(200, 275, 530, 30);
        formVille.setBounds(200, 325, 530, 30);
        formTel.setBounds(200, 375, 530, 30);
        formPortable.setBounds(200, 425, 530, 30);
        formFax.setBounds(200, 475, 530, 30);
        formCommentaire.setBounds(200, 525, 530, 30);
        formNumBadge.setBounds(200, 575, 530, 30);

        boutonAjout.setBounds(120, 620, 100, 30);
        boutonEffacer.setBounds(320, 620, 100, 30);
        boutonRetour.setBounds(520, 620, 100, 30);

        fenetreAjoutInstructeur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutInstructeur.setResizable(false);
        fenetreAjoutInstructeur.setLocationRelativeTo(null);
        fenetreAjoutInstructeur.setSize(750, 700);
        fenetreAjoutInstructeur.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Instructeurs av1 = new Instructeurs();
                    av1.setNum_instructeur(Integer.parseUnsignedInt(formNumInstructeur.getText()));
                    av1.setNom(formNom.getText());
                    av1.setPrenom(formPrenom.getText());
                    av1.setTaux_instructeur(Integer.parseUnsignedInt(formTauxInstructeur.getText()));
                    av1.setAdresse(formAdresse.getText());
                    av1.setCode_postal(formCodePostal.getText());
                    av1.setVille(formVille.getText());
                    av1.setTel(formTel.getText());
                    av1.setPortable(formPortable.getText());
                    av1.setFax(formFax.getText());
                    av1.setCommentaire(formCommentaire.getText());
                    av1.setNum_badge(formNumBadge.getText());
                    DaoInstructeursImpl instance = new DaoInstructeursImpl();
                    instance.ajoute(av1);
                    formNumInstructeur.setText("");
                    formNom.setText("");
                    formPrenom.setText("");
                    formTauxInstructeur.setText("");
                    formAdresse.setText("");
                    formVille.setText("");
                    formCodePostal.setText("");
                    formTel.setText("");
                    formPortable.setText("");
                    formFax.setText("");
                    formCommentaire.setText("");
                    formNumBadge.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutInstructeur.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumInstructeur.setText("");
                    formNom.setText("");
                    formPrenom.setText("");
                    formTauxInstructeur.setText("");
                    formAdresse.setText("");
                    formVille.setText("");
                    formCodePostal.setText("");
                    formTel.setText("");
                    formPortable.setText("");
                    formFax.setText("");
                    formCommentaire.setText("");
                    formNumBadge.setText("");
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutInstructeur.setVisible(false);
                new Choix();
            }
        });
    }
}
