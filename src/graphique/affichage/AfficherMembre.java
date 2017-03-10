/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique.affichage;

/**
 *
 * @author SSII-Dev
 */
import dao.impl.DaoMembresImpl;
import domaine.Membres;
import graphique.Choix;
import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SSII-Dev
 */
public class AfficherMembre {

    public AfficherMembre() {
        JFrame fenetreAfficherMembre = new JFrame("Affichage membre(s)");
        JButton boutonTousLesMembres = new JButton("Tout afficher");
        JButton boutonRechercher = new JButton("Rechercher");
        JButton boutonEffacer = new JButton("Effacer");
        JButton boutonRetour = new JButton("Retour");
        JTextField formQuelMembre = new JTextField(25);
        JLabel quelMembre = new JLabel("Quel membre afficher ?");
        fenetreAfficherMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAfficherMembre.setSize(900, 375);
        fenetreAfficherMembre.setLocationRelativeTo(null);
        fenetreAfficherMembre.setResizable(true);
        fenetreAfficherMembre.setVisible(true);
        JPanel pan = new JPanel();
        pan.add(quelMembre);
        pan.add(formQuelMembre);
        pan.add(boutonRechercher);
        pan.add(boutonTousLesMembres);
        pan.add(boutonEffacer);
        pan.add(boutonRetour);
        Object[][] contenu = {};
        String entete[] = {"N° Membre", "Genre", "N° Qualif", "N° Compte", "Nom", "Prenom", "Adresse", "Code Postal", "Ville", "Tel", "Email", "N° Badge", "Profession", "Date Naissance", "Lieu Naissance", "Date entrée"};
        DefaultTableModel model = new DefaultTableModel(contenu, entete);
        JTable tableau = new JTable(model);
        fenetreAfficherMembre.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        fenetreAfficherMembre.getContentPane().add(pan, BorderLayout.NORTH);

        boutonRechercher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoMembresImpl instance = new DaoMembresImpl();
                    Membres av1 = new Membres();
                    av1 = instance.cherche(Integer.parseInt(formQuelMembre.getText()));
                    String[] contenu = {Integer.toString(av1.getNum_membre()), av1.getCourt(), Integer.toString(av1.getNum_qualif()), Integer.toString(av1.getNum_compte()), av1.getNom(), av1.getPrenom(), av1.getAdresse(), av1.getCode_postal(), av1.getVille(), av1.getTel(), av1.getEmail(), Integer.toString(av1.getNum_badge()), av1.getProfession(), av1.getDate_naissance(), av1.getLieu_naissance(), av1.getDate_entree()};
                    model.addRow(contenu);
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherMembre.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        boutonTousLesMembres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.getDataVector().removeAllElements();
                    DaoMembresImpl instance = new DaoMembresImpl();
                    List<Membres> tousLesMembres = new ArrayList<Membres>();
                    tousLesMembres = instance.tousLesMembres();

                    for (int i = 0; i < tousLesMembres.size(); i++) {
                        Membres av1 = new Membres(tousLesMembres.get(i).getNum_membre(), tousLesMembres.get(i).getCourt(), tousLesMembres.get(i).getNum_qualif(), tousLesMembres.get(i).getNum_compte(), tousLesMembres.get(i).getNom(), tousLesMembres.get(i).getPrenom(), tousLesMembres.get(i).getAdresse(), tousLesMembres.get(i).getCode_postal(), tousLesMembres.get(i).getVille(), tousLesMembres.get(i).getTel(), tousLesMembres.get(i).getEmail(), tousLesMembres.get(i).getNum_badge(), tousLesMembres.get(i).getProfession(), tousLesMembres.get(i).getDate_naissance(), tousLesMembres.get(i).getLieu_naissance(), tousLesMembres.get(i).getDate_entree());
                        String[] contenu = {Integer.toString(av1.getNum_membre()), av1.getCourt(), Integer.toString(av1.getNum_qualif()), Integer.toString(av1.getNum_compte()), av1.getNom(), av1.getPrenom(), av1.getAdresse(), av1.getCode_postal(), av1.getVille(), av1.getTel(), av1.getEmail(), Integer.toString(av1.getNum_badge()), av1.getProfession(), av1.getDate_naissance(), av1.getLieu_naissance(), av1.getDate_entree()};
                        model.addRow(contenu);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AfficherMembre.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        boutonEffacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formQuelMembre.setText("");
            }
        });

        boutonRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreAfficherMembre.setVisible(false);
                new Choix();
            }
        });

    }
}
