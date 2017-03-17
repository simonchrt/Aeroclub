/*
 * To change fenetreModifierAvion license header, choose License Headers in Project Properties.
 * To change fenetreModifierAvion template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.modification;

import dao.impl.DaoAvionsImpl;
import dao.impl.DaoTypesImpl;
import domaine.Avions;
import domaine.Types;
import graphique.Choix;
import graphique.affichage.AfficherTypes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SSII-Dev
 */
public class ModificationAvion {

    public ModificationAvion() {
        JFrame fenetreModifierAvion = new JFrame("Modifier avion(s)");
        JPanel jpanelForm = new JPanel();
        jpanelForm.setBackground(Color.BLUE);
        fenetreModifierAvion.add(jpanelForm);
        jpanelForm.setBounds(50,50,50,50);
       
        
        fenetreModifierAvion.setLocationRelativeTo(null);
        fenetreModifierAvion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreModifierAvion.setSize(1500, 500);
        fenetreModifierAvion.setResizable(false);
        fenetreModifierAvion.setVisible(true);
/*
// =========================   Boutons ==============================================

        JButton boutonModifier = new JButton("Modifier");
        JButton boutonSupprimer = new JButton("Supprimer");
        JButton boutonRetour = new JButton("Retour");
        
// ========================== Tableau =============================
        JPanel jpanelTabl = new JPanel();
        
        jpanelTabl.setBounds(500,500,500,500);

        fenetreModifierAvion.add(jpanelForm);
       
        
        fenetreModifierAvion.add(jpanelTabl);
                
        JTextField formQuelAvion = new JTextField(25);
        JLabel quelAvion = new JLabel("Quel avion afficher ?");
        
        
        fenetreModifierAvion.setLocationRelativeTo(null);
        fenetreModifierAvion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreModifierAvion.setSize(1500, 500);
        fenetreModifierAvion.setResizable(false);
        fenetreModifierAvion.setVisible(true);
        
        Object[][] contenu = {};
        String entete[] = {"N° Avion", "Type", "Immatriculation"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);

        JScrollPane test = new JScrollPane(tableau);
        jpanelTabl.add(test);
        
 // =================== Label ========================
 
         DaoTypesImpl instance = new DaoTypesImpl();
        List<Types> tousLesTypes = new ArrayList<Types>();
        
        try {
        tousLesTypes = instance.tousLesTypes();

        } catch (SQLException ex) {
                    Logger.getLogger(AfficherTypes.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        JLabel labelNumAvion = new JLabel("Numéro avion");
        JLabel labelImmatriculation = new JLabel("Immatriculation");
        JComboBox listeTypes = new JComboBox();
        
        for(int i = 0; i < tousLesTypes.size(); i++){
           
           listeTypes.addItem(tousLesTypes.get(i).getTypes_libelle());

        }
        
        JTextField textNumAvion = new JTextField();
        JTextField textImmatriculation = new JTextField();

        labelNumAvion.setBounds(20, 30, 120, 15);
        labelImmatriculation.setBounds(20, 85, 120, 15);
        listeTypes.setBounds(200, 125, 120, 30);
        textNumAvion.setBounds(200, 25, 530, 30);
        textImmatriculation.setBounds(200, 75, 530, 30);
        
        fenetreModifierAvion.add(textNumAvion);
        fenetreModifierAvion.add(textImmatriculation);
        fenetreModifierAvion.add(listeTypes);
        fenetreModifierAvion.add(labelNumAvion);
        fenetreModifierAvion.add(labelImmatriculation);
                
        jpanelTabl.setLayout(new FlowLayout());
  
         boutonModifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoAvionsImpl instance = new DaoAvionsImpl();
                    Avions av1 = new Avions();
                    av1 = instance.cherche(Integer.parseInt(formQuelAvion.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_avion()), av1.getImmatriculation()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificationAvion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoAvionsImpl instance = new DaoAvionsImpl();
                    List<Avions> tousLesAvions = new ArrayList<Avions>();
                    tousLesAvions = instance.tousLesAvions();

                    for (int i = 0; i < tousLesAvions.size(); i++) {
                        Avions av1 = new Avions(tousLesAvions.get(i).getNum_avion(),tousLesAvions.get(i).getImmatriculation(),tousLesAvions.get(i).getType());
                        String[] contenu = {Integer.toString(av1.getNum_avion()), av1.getType(), av1.getImmatriculation()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ModificationAvion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
  

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreModifierAvion.setVisible(false);
                new Choix();
            }
        });

    }
*/
}
}
