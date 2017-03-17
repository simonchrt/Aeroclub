/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.*;
import domaine.*;
import graphique.Choix;
import graphique.affichage.AfficherTypes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

/**
 *
 * @author SSII-Dev
 */
public class AjoutAvion {

    public AjoutAvion() {
        
        DaoTypesImpl instance = new DaoTypesImpl();
        List<Types> tousLesTypes = new ArrayList<Types>();
        
        try {
        tousLesTypes = instance.tousLesTypes();

        } catch (SQLException ex) {
                    Logger.getLogger(AfficherTypes.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        JFrame fenetreAjoutAvion = new JFrame("Ajouter un avion");
        fenetreAjoutAvion.setLayout(null);
        JLabel numAvion = new JLabel("Numéro Avion");
        JLabel type = new JLabel("Type d'Avion");
        
        // Types[] typeComboBox = {};
        JComboBox listeTypes = new JComboBox();
        

        for(int i = 0; i < tousLesTypes.size(); i++){
           
           listeTypes.addItem(tousLesTypes.get(i).getTypes_libelle());

        }
     //   System.out.println(listeTypes.getSelectedItem());
        /*
        JLabel taux = new JLabel("Taux");
        JLabel forfait1 = new JLabel("Forfait 1");
        JLabel forfait2 = new JLabel("Forfait 2");
        JLabel forfait3 = new JLabel("Forfait 3");
        JLabel heuresForfait1 = new JLabel("Heures Forfait 1");
        JLabel heuresForfait2 = new JLabel("Heures Forfait 2");
        JLabel heuresForfait3 = new JLabel("Heures Forfait 3");
        JLabel reductionSemaine = new JLabel("Réduction semaine"); */
        JLabel immatriculation = new JLabel("Immatriculation");

        JTextField formNumAvion = new JTextField();
     /*   JTextField formType = new JTextField();
        JTextField formTaux = new JTextField();
        JTextField formForfait1 = new JTextField();
        JTextField formForfait2 = new JTextField();
        JTextField formForfait3 = new JTextField();
        JTextField formHeuresForfait1 = new JTextField();
        JTextField formHeuresForfait2 = new JTextField();
        JTextField formHeuresForfait3 = new JTextField();
        JTextField formReductionSemaine = new JTextField(); */
        JTextField formImmatriculation = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutAvion.add(numAvion);
        fenetreAjoutAvion.add(type);
       /* fenetreAjoutAvion.add(taux);
        fenetreAjoutAvion.add(forfait1);
        fenetreAjoutAvion.add(forfait2);
        fenetreAjoutAvion.add(forfait3);
        fenetreAjoutAvion.add(heuresForfait1);
        fenetreAjoutAvion.add(heuresForfait2);
        fenetreAjoutAvion.add(heuresForfait3);
        fenetreAjoutAvion.add(reductionSemaine);
       */ fenetreAjoutAvion.add(immatriculation);
        fenetreAjoutAvion.add(formNumAvion);
       /* fenetreAjoutAvion.add(formType);
        fenetreAjoutAvion.add(formTaux);
        fenetreAjoutAvion.add(formForfait1);
        fenetreAjoutAvion.add(formForfait2);
        fenetreAjoutAvion.add(formForfait3);
        fenetreAjoutAvion.add(formHeuresForfait1);
        fenetreAjoutAvion.add(formHeuresForfait2);
        fenetreAjoutAvion.add(formHeuresForfait3);
        fenetreAjoutAvion.add(formReductionSemaine); */
        fenetreAjoutAvion.add(formImmatriculation);
        fenetreAjoutAvion.add(boutonAjout);
        fenetreAjoutAvion.add(boutonEffacer);
        fenetreAjoutAvion.add(boutonRetour);
        fenetreAjoutAvion.add(listeTypes);

        numAvion.setBounds(20, 30, 120, 15);
        type.setBounds(20, 130, 120, 15);
       /* taux.setBounds(20, 130, 120, 15);
        forfait1.setBounds(20, 180, 120, 15);
        forfait2.setBounds(20, 230, 120, 15);
        forfait3.setBounds(20, 280, 120, 15);
        heuresForfait1.setBounds(20, 330, 120, 15);
        heuresForfait2.setBounds(20, 380, 120, 15);
        heuresForfait3.setBounds(20, 430, 120, 15);
        reductionSemaine.setBounds(20, 480, 120, 15);*/
        immatriculation.setBounds(20, 80, 120, 15);
        listeTypes.setBounds(200, 125, 120, 30);
        formNumAvion.setBounds(200, 25, 530, 30);
      /*  formType.setBounds(200, 75, 530, 30);
        formTaux.setBounds(200, 125, 530, 30);
        formForfait1.setBounds(200, 175, 530, 30);
        formForfait2.setBounds(200, 225, 530, 30);
        formForfait3.setBounds(200, 275, 530, 30);
        formHeuresForfait1.setBounds(200, 325, 530, 30);
        formHeuresForfait2.setBounds(200, 375, 530, 30);
        formHeuresForfait3.setBounds(200, 425, 530, 30);
        formReductionSemaine.setBounds(200, 475, 530, 30);*/
        formImmatriculation.setBounds(200, 75, 530, 30);

        boutonAjout.setBounds(120, 180, 100, 30);
        boutonEffacer.setBounds(320, 180, 100, 30);
        boutonRetour.setBounds(520, 180, 100, 30);

        fenetreAjoutAvion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutAvion.setResizable(false);
        fenetreAjoutAvion.setLocationRelativeTo(null);
        fenetreAjoutAvion.setSize(750, 250);
        fenetreAjoutAvion.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Avions av1 = new Avions();
                    av1.setNum_avion(Integer.parseUnsignedInt(formNumAvion.getText()));
                 /*   av1.setType(formType.getText());
                    av1.setTaux(Integer.parseUnsignedInt(formTaux.getText()));
                    av1.setForfait1(Integer.parseUnsignedInt(formForfait1.getText()));
                    av1.setForfait2(Integer.parseUnsignedInt(formForfait2.getText()));
                    av1.setForfait3(Integer.parseUnsignedInt(formForfait3.getText()));
                    av1.setHeures_forfait1(Integer.parseUnsignedInt(formHeuresForfait1.getText()));
                    av1.setHeures_forfait2(Integer.parseUnsignedInt(formHeuresForfait2.getText()));
                    av1.setHeures_forfait3(Integer.parseUnsignedInt(formHeuresForfait3.getText()));
                    av1.setReduction_semaine(Integer.parseUnsignedInt(formReductionSemaine.getText())); */
                    av1.setImmatriculation(formImmatriculation.getText());
                    DaoTypesImpl instanceType = new DaoTypesImpl();
                    av1.setType(instanceType.sonId((String) listeTypes.getSelectedItem()));
                    System.out.println(instanceType.sonId("Type 1"));
                    DaoAvionsImpl instance = new DaoAvionsImpl();
                    instance.ajoute(av1);
                    formNumAvion.setText("");
                 /*   formType.setText("");
                    formTaux.setText("");
                    formForfait1.setText("");
                    formForfait2.setText("");
                    formForfait3.setText("");
                    formHeuresForfait1.setText("");
                    formHeuresForfait2.setText("");
                    formHeuresForfait3.setText("");
                    formReductionSemaine.setText("");*/
                    formImmatriculation.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutAvion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumAvion.setText("");
                   /* formType.setText("");
                    formTaux.setText("");
                    formForfait1.setText("");
                    formForfait2.setText("");
                    formForfait3.setText("");
                    formHeuresForfait1.setText("");
                    formHeuresForfait2.setText("");
                    formHeuresForfait3.setText("");
                    formReductionSemaine.setText("");*/
                    formImmatriculation.setText("");
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutAvion.setVisible(false);
                new Choix();
            }
        });
    }
}
