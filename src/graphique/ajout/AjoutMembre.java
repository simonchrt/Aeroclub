/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

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
public class AjoutMembre {

    public AjoutMembre() {
        JFrame fenetreAjoutMembre = new JFrame("Ajouter un membre");
        fenetreAjoutMembre.setLayout(null);
        JLabel numMembre = new JLabel("N° Membre");
        JLabel court = new JLabel("Genre");
        JLabel numQualif = new JLabel("N° Qualification");
        JLabel numCompte = new JLabel("N° Compte");
        JLabel nom = new JLabel("Nom");
        JLabel prenom = new JLabel("Prenom");
        JLabel adresse = new JLabel("Adresse");
        JLabel codePostal = new JLabel("Code Postal");
        JLabel ville = new JLabel("Ville");
        JLabel tel = new JLabel("Tel");
        JLabel email = new JLabel("E-mail");
        JLabel numBadge = new JLabel("N° Badge");
        JLabel profession = new JLabel("Profession");
        JLabel dateNaissance = new JLabel("Date de naissance");
        JLabel lieuNaissance = new JLabel("Lieu de naissance");
        JLabel dateEntree = new JLabel("Date d'entrée");

        JTextField formNumMembre = new JTextField();
        JTextField formCourt = new JTextField();
        JTextField formNumQualif = new JTextField();
        JTextField formNumCompte = new JTextField();
        JTextField formNom = new JTextField();
        JTextField formPrenom = new JTextField();
        JTextField formAdresse = new JTextField();
        JTextField formCodePostal = new JTextField();
        JTextField formVille = new JTextField();
        JTextField formTel = new JTextField();
        JTextField formEmail = new JTextField();
        JTextField formNumBadge = new JTextField();
        JTextField formProfession = new JTextField();
        JTextField formDateNaissance = new JTextField();
        JTextField formLieuNaissance = new JTextField();
        JTextField formDateEntree = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutMembre.add(numMembre);
        fenetreAjoutMembre.add(court);
        fenetreAjoutMembre.add(numQualif);
        fenetreAjoutMembre.add(numCompte);
        fenetreAjoutMembre.add(nom);
        fenetreAjoutMembre.add(prenom);
        fenetreAjoutMembre.add(adresse);
        fenetreAjoutMembre.add(codePostal);
        fenetreAjoutMembre.add(ville);
        fenetreAjoutMembre.add(tel);
        fenetreAjoutMembre.add(email);
        fenetreAjoutMembre.add(numBadge);
        fenetreAjoutMembre.add(profession);
        fenetreAjoutMembre.add(dateNaissance);
        fenetreAjoutMembre.add(lieuNaissance);
        fenetreAjoutMembre.add(dateEntree);

        fenetreAjoutMembre.add(formNumMembre);
        fenetreAjoutMembre.add(formCourt);
        fenetreAjoutMembre.add(formNumQualif);
        fenetreAjoutMembre.add(formNumCompte);
        fenetreAjoutMembre.add(formNom);
        fenetreAjoutMembre.add(formPrenom);
        fenetreAjoutMembre.add(formAdresse);
        fenetreAjoutMembre.add(formCodePostal);
        fenetreAjoutMembre.add(formVille);
        fenetreAjoutMembre.add(formTel);
        fenetreAjoutMembre.add(formEmail);
        fenetreAjoutMembre.add(formNumBadge);
        fenetreAjoutMembre.add(formProfession);
        fenetreAjoutMembre.add(formDateNaissance);
        fenetreAjoutMembre.add(formLieuNaissance);
        fenetreAjoutMembre.add(formDateEntree);
        fenetreAjoutMembre.add(boutonAjout);
        fenetreAjoutMembre.add(boutonEffacer);
        fenetreAjoutMembre.add(boutonRetour);

        numMembre.setBounds(20, 30, 120, 15);
        court.setBounds(20, 70, 120, 15);
        numQualif.setBounds(20, 110, 120, 15);
        numCompte.setBounds(20, 150, 120, 15);
        nom.setBounds(20, 190, 190, 15);
        prenom.setBounds(20, 230, 120, 15);
        adresse.setBounds(20, 270, 120, 15);
        codePostal.setBounds(20, 310, 120, 15);
        ville.setBounds(20, 350, 350, 15);
        tel.setBounds(20, 390, 390, 15);
        email.setBounds(20, 430, 120, 15);
        numBadge.setBounds(20, 470, 120, 15);
        profession.setBounds(20, 510, 120, 15);
        dateNaissance.setBounds(20, 550, 120, 15);
        lieuNaissance.setBounds(20, 590, 120, 15);
        dateEntree.setBounds(20, 630, 120, 15);

        formNumMembre.setBounds(200, 25, 530, 30);
        formCourt.setBounds(200, 65, 530, 30);
        formNumQualif.setBounds(200, 105, 530, 30);
        formNumCompte.setBounds(200, 145, 530, 30);
        formNom.setBounds(200, 185, 530, 30);
        formPrenom.setBounds(200, 225, 530, 30);
        formAdresse.setBounds(200, 265, 530, 30);
        formCodePostal.setBounds(200, 305, 530, 30);
        formVille.setBounds(200, 345, 530, 30);
        formTel.setBounds(200, 385, 530, 30);
        formEmail.setBounds(200, 425, 530, 30);
        formNumBadge.setBounds(200, 465, 530, 30);
        formProfession.setBounds(200, 505, 530, 30);
        formDateNaissance.setBounds(200, 545, 530, 30);
        formLieuNaissance.setBounds(200, 585, 530, 30);
        formDateEntree.setBounds(200, 625, 530, 30);

        boutonAjout.setBounds(120, 685, 100, 30);
        boutonEffacer.setBounds(320, 685, 100, 30);
        boutonRetour.setBounds(520, 685, 100, 30);

        fenetreAjoutMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutMembre.setResizable(false);
        fenetreAjoutMembre.setSize(750, 750);
        fenetreAjoutMembre.setLocationRelativeTo(null);
        fenetreAjoutMembre.setVisible(true);


        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Membres av1 = new Membres();
                    av1.setNum_membre(Integer.parseUnsignedInt(formNumMembre.getText()));
                    av1.setCourt(formCourt.getText());
                    av1.setNum_qualif(Integer.parseUnsignedInt(formNumQualif.getText()));
                    av1.setNum_compte(Integer.parseUnsignedInt(formNumCompte.getText()));
                    av1.setNom(formNom.getText());
                    av1.setPrenom(formPrenom.getText());
                    av1.setAdresse(formAdresse.getText());
                    av1.setCode_postal(formCodePostal.getText());
                    av1.setVille(formVille.getText());
                    av1.setTel(formTel.getText());
                    av1.setEmail(formEmail.getText());
                    av1.setNum_badge(Integer.parseUnsignedInt(formNumBadge.getText()));
                    av1.setProfession(formProfession.getText());
                    av1.setDate_naissance(formDateNaissance.getText());
                    av1.setDate_entree(formDateEntree.getText());
                    av1.setLieu_naissance(formLieuNaissance.getText());
                    DaoMembresImpl instance = new DaoMembresImpl();
                    instance.ajoute(av1);
                    formNumMembre.setText("");
                    formCourt.setText("");
                    formNumQualif.setText("");
                    formNumCompte.setText("");
                    formNom.setText("");
                    formPrenom.setText("");
                    formAdresse.setText("");
                    formCodePostal.setText("");
                    formVille.setText("");
                    formTel.setText("");
                    formEmail.setText("");
                    formNumBadge.setText("");
                    formProfession.setText("");
                    formDateNaissance.setText("");
                    formLieuNaissance.setText("");
                    formDateEntree.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutMembre.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumMembre.setText("");
                formCourt.setText("");
                formNumQualif.setText("");
                formNumCompte.setText("");
                formNom.setText("");
                formPrenom.setText("");
                formAdresse.setText("");
                formCodePostal.setText("");
                formVille.setText("");
                formTel.setText("");
                formEmail.setText("");
                formNumBadge.setText("");
                formProfession.setText("");
                formDateNaissance.setText("");
                formLieuNaissance.setText("");
                formDateEntree.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutMembre.setVisible(false);
                new Choix();
            }
        });
    }
}
