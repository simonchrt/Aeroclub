/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.DaoTypesImpl;
import domaine.Types;
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
public class AjoutTypes {

    public AjoutTypes() {
        JFrame fenetreAjoutTypes = new JFrame("Ajouter un type");
        fenetreAjoutTypes.setLayout(null);
        JLabel numType = new JLabel("Numéro Type");
        JLabel libelle = new JLabel("Libellé");
        JLabel tauxHoraire = new JLabel ("Prix Horaire");
       

        JTextField formNumType = new JTextField();
        JTextField formLibelle = new JTextField();
        JTextField formTauxHoraire = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutTypes.add(numType);
        fenetreAjoutTypes.add(libelle);
        fenetreAjoutTypes.add(tauxHoraire);
     
        fenetreAjoutTypes.add(formNumType);
        fenetreAjoutTypes.add(formLibelle);
        fenetreAjoutTypes.add(formTauxHoraire);

        fenetreAjoutTypes.add(boutonAjout);
        fenetreAjoutTypes.add(boutonEffacer);
        fenetreAjoutTypes.add(boutonRetour);

        numType.setBounds(20, 30, 120, 15);
        formNumType.setBounds(200, 25, 530, 30);

        libelle.setBounds(20, 80, 120, 15);
        formLibelle.setBounds(200, 75, 530, 30);
        
        tauxHoraire.setBounds(20,125,120,15);
        formTauxHoraire.setBounds(200, 120, 530, 30);

        boutonAjout.setBounds(120, 180, 100, 30);
        boutonEffacer.setBounds(320, 180, 100, 30);
        boutonRetour.setBounds(520, 180, 100, 30);

        fenetreAjoutTypes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutTypes.setResizable(false);
        fenetreAjoutTypes.setLocationRelativeTo(null);
        fenetreAjoutTypes.setSize(750, 250);
        fenetreAjoutTypes.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Types type1 = new Types();
                    type1.setNum_types(Integer.parseUnsignedInt(formNumType.getText()));
                    type1.setTypes_libelle(formLibelle.getText());
                    type1.setTypes_prixhoraire(formTauxHoraire.getText());
                    DaoTypesImpl instance = new DaoTypesImpl();
                    instance.ajoute(type1);
                    formNumType.setText("");
                    formLibelle.setText("");
                    formTauxHoraire.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutTypes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumType.setText("");
                   /* formType.setText("");
                    formTaux.setText("");
                    formForfait1.setText("");
                    formForfait2.setText("");
                    formForfait3.setText("");
                    formHeuresForfait1.setText("");
                    formHeuresForfait2.setText("");
                    formHeuresForfait3.setText("");
                    formReductionSemaine.setText("");*/
                    formLibelle.setText("");
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutTypes.setVisible(false);
                new Choix();
            }
        });
    }
}
