/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.ajout;

import dao.impl.DaoMaintenanceImpl;
import domaine.Maintenance;
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
public class AjoutMaintenance {
    public AjoutMaintenance(){
    JFrame fenetreAjoutMaintenance = new JFrame("Ajouter un maintenance");
        fenetreAjoutMaintenance.setLayout(null);
        JLabel numMaintenance = new JLabel("Numéro Maintenance");
        JLabel numAvion = new JLabel("Numéro Avion");
        JLabel libelle = new JLabel("Descriptif");
        JLabel date = new JLabel("Date");

        JTextField formNumMaintenance = new JTextField();
        JTextField formNumAvion = new JTextField();
        JTextField formLibelle= new JTextField();
        JTextField formDate = new JTextField();

        JButton boutonAjout = new JButton("Ajouter");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");

        fenetreAjoutMaintenance.add(numMaintenance);
        fenetreAjoutMaintenance.add(numAvion);
        fenetreAjoutMaintenance.add(libelle);
        fenetreAjoutMaintenance.add(date);
        fenetreAjoutMaintenance.add(formNumMaintenance);
        fenetreAjoutMaintenance.add(formNumAvion);
        fenetreAjoutMaintenance.add(formLibelle);
        fenetreAjoutMaintenance.add(formDate);
        fenetreAjoutMaintenance.add(boutonAjout);
        fenetreAjoutMaintenance.add(boutonEffacer);
        fenetreAjoutMaintenance.add(boutonRetour);

        numMaintenance.setBounds(20, 30, 130, 15);
        numAvion.setBounds(20, 80, 120, 15);
        libelle.setBounds(20, 130, 120, 15);
        date.setBounds(20, 180, 120, 15);
        

        formNumMaintenance.setBounds(200, 25, 530, 30);
        formNumAvion.setBounds(200, 75, 530, 30);
        formLibelle.setBounds(200, 125, 530, 30);
        formDate.setBounds(200, 175, 530, 30);
        

        boutonAjout.setBounds(120, 240, 100, 30);
        boutonEffacer.setBounds(320, 240, 100, 30);
        boutonRetour.setBounds(520, 240, 100, 30);

        fenetreAjoutMaintenance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAjoutMaintenance.setResizable(false);
        fenetreAjoutMaintenance.setLocationRelativeTo(null);
        fenetreAjoutMaintenance.setSize(750, 310);
        fenetreAjoutMaintenance.setVisible(true);

        boutonAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Maintenance av1 = new Maintenance();
                    av1.setNum_maintenance(Integer.parseUnsignedInt(formNumMaintenance.getText()));
                    av1.setNum_avion(Integer.parseUnsignedInt(formNumAvion.getText()));
                    av1.setLibelle(formLibelle.getText());
                    av1.setDate(formDate.getText());
                    
                    DaoMaintenanceImpl instance = new DaoMaintenanceImpl();
                    instance.ajoute(av1);
                    formNumMaintenance.setText("");
                    formNumAvion.setText("");
                    formLibelle.setText("");
                    formDate.setText("");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(AjoutMaintenance.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    formNumMaintenance.setText("");
                    formNumAvion.setText("");
                    formLibelle.setText("");
                    formDate.setText("");
                    
            }
        });
        
        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAjoutMaintenance.setVisible(false);
                new Choix();
            }
        });
    }
}
