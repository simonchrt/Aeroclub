/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.DaoVolImpl;
import domaine.Vol;
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
public class AjoutVol {

    JTextField formDateHoraire = new JTextField();
    
    public String x() {
        String texte = formDateHoraire.getText();
        return texte;
    }

    

    public AjoutVol() {
        JFrame fenetreAjoutVol = new JFrame("Ajouter un vol");
        fenetreAjoutVol.setLayout(null);
        JLabel numVol = new JLabel("N° Vol");
        JLabel numMembre = new JLabel("N° Membre");
        JLabel numAvion = new JLabel("N° Avion");
        JLabel numInstructeur = new JLabel("N° Instructeur");
        JLabel dateHoraire = new JLabel("Date & Heure");
        JLabel temps = new JLabel("Durée");

        JTextField formNumVol = new JTextField();
        JTextField formNumMembre = new JTextField();
        JTextField formNumAvion = new JTextField();
        JTextField formNumInstructeur = new JTextField();
        JTextField formTemps = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutVol.add(numVol);
        fenetreAjoutVol.add(numMembre);
        fenetreAjoutVol.add(numAvion);
        fenetreAjoutVol.add(numInstructeur);
        fenetreAjoutVol.add(dateHoraire);
        fenetreAjoutVol.add(temps);

        fenetreAjoutVol.add(formNumVol);
        fenetreAjoutVol.add(formNumMembre);
        fenetreAjoutVol.add(formNumAvion);
        fenetreAjoutVol.add(formNumInstructeur);
        fenetreAjoutVol.add(formDateHoraire);
        fenetreAjoutVol.add(formTemps);

        fenetreAjoutVol.add(boutonAjout);
        fenetreAjoutVol.add(boutonEffacer);
        fenetreAjoutVol.add(boutonRetour);

        numVol.setBounds(20, 30, 120, 15);
        numMembre.setBounds(20, 80, 120, 15);
        numAvion.setBounds(20, 130, 120, 15);
        numInstructeur.setBounds(20, 180, 120, 15);
        dateHoraire.setBounds(20, 230, 230, 15);
        temps.setBounds(20, 280, 230, 15);

        formNumVol.setBounds(200, 25, 530, 30);
        formNumMembre.setBounds(200, 75, 530, 30);
        formNumAvion.setBounds(200, 125, 530, 30);
        formNumInstructeur.setBounds(200, 175, 530, 30);
        formDateHoraire.setBounds(200, 225, 530, 30);
        formTemps.setBounds(200, 275, 530, 30);

        boutonAjout.setBounds(120, 345, 100, 30);
        boutonEffacer.setBounds(320, 345, 100, 30);
        boutonRetour.setBounds(520, 345, 100, 30);

        fenetreAjoutVol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutVol.setResizable(false);
        fenetreAjoutVol.setLocationRelativeTo(null);
        fenetreAjoutVol.setSize(750, 425);
        fenetreAjoutVol.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Vol av1 = new Vol();
                    av1.setNum_vol(Integer.parseInt(formNumVol.getText()));
                    av1.setNum_membre(Integer.parseUnsignedInt(formNumMembre.getText()));
                    av1.setNum_avion(Integer.parseUnsignedInt(formNumAvion.getText()));
                    av1.setNum_instructeur(Integer.parseUnsignedInt(formNumInstructeur.getText()));
                    av1.setDateHoraire(x());
                    av1.setTemps(Integer.parseUnsignedInt(formTemps.getText()));
                    DaoVolImpl instance = new DaoVolImpl();
                    instance.ajoute(av1);
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutVol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formNumVol.setText("");
                formNumAvion.setText("");
                formNumInstructeur.setText("");
                formNumMembre.setText("");
                formDateHoraire.setText("");
                formTemps.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutVol.setVisible(false);
                new Choix();
            }
        });
    }
}
