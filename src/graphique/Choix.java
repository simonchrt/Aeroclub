/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import graphique.affichage.AfficherAvion;
import graphique.affichage.AfficherCompte;
import graphique.affichage.AfficherInstructeur;
import graphique.affichage.AfficherMaintenance;
import graphique.affichage.AfficherMembre;
import graphique.affichage.AfficherOperation;
import graphique.affichage.AfficherQualification;
import graphique.affichage.AfficherVol;
import graphique.affichage.AfficherTypes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import graphique.ajout.*;
import graphique.modification.ModificationAvion;
import graphique.modification.ModificationCompte;
import graphique.modification.ModificationInstructeur;
import graphique.modification.ModificationMaintenance;
import graphique.modification.ModificationMembre;
import graphique.modification.ModificationOperation;
import graphique.modification.ModificationQualification;
import graphique.modification.ModificationVol;
import graphique.suppression.SupprimerAvion;
import graphique.suppression.SupprimerCompte;
import graphique.suppression.SupprimerInstructeur;
import graphique.suppression.SupprimerMaintenance;
import graphique.suppression.SupprimerMembre;
import graphique.suppression.SupprimerOperation;
import graphique.suppression.SupprimerQualification;
import graphique.suppression.SupprimerVol;

/**
 *
 * @author SSII-Dev
 */
public class Choix {

    public Choix() {
        JLabel test = new JLabel("test");
        JFrame fenetreChoix = new JFrame("Action");
        JTabbedPane lesOnglets = new JTabbedPane();
        JPanel ongletAjout = new JPanel();
        ongletAjout.setLayout(null);
        JPanel ongletModification = new JPanel();
        ongletModification.setLayout(null);
        JPanel ongletSupprimer = new JPanel();
        ongletSupprimer.setLayout(null);
        JPanel ongletAfficher = new JPanel();
        ongletAfficher.setLayout(null);
   

        JButton boutonAjoutAvion = new JButton("Ajouter un avion");
        JButton boutonAjoutType = new JButton("Ajouter un type");
        JButton boutonAjoutCompte = new JButton("Ajouter un compte");
        JButton boutonAjoutInstructeur = new JButton("Ajouter un instructeur");
        JButton boutonAjoutMaintenance = new JButton("Ajouter une maintenance");
        JButton boutonAjoutMembre = new JButton("Ajouter un membre");
        JButton boutonAjoutOperation = new JButton("Ajouter une operation");
        JButton boutonAjoutQualification = new JButton("Ajouter une qualification");
        JButton boutonAjoutVol = new JButton("Ajouter un vol");

        JButton boutonModificationAvion = new JButton("Modifier un avion");
        JButton boutonModificationType = new JButton("Modifier un Type");
        JButton boutonModificationCompte = new JButton("Modifier un compte");
        JButton boutonModificationInstructeur = new JButton("Modifier un instructeur");
        JButton boutonModificationMaintenance = new JButton("Modifier une maintenance");
        JButton boutonModificationMembre = new JButton("Modifier un membre");
        JButton boutonModificationOperation = new JButton("Modifier une operation");
        JButton boutonModificationQualification = new JButton("Modifier une qualification");
        JButton boutonModificationVol = new JButton("Modifier un vol");

        JButton boutonSupprimerAvion = new JButton("Supprimer un avion");
        JButton boutonSupprimerType = new JButton("Supprimer un type");
        JButton boutonSupprimerCompte = new JButton("Supprimer un compte");
        JButton boutonSupprimerInstructeur = new JButton("Supprimer un instructeur");
        JButton boutonSupprimerMaintenance = new JButton("Supprimer une maintenance");
        JButton boutonSupprimerMembre = new JButton("Supprimer un membre");
        JButton boutonSupprimerOperation = new JButton("Supprimer une operation");
        JButton boutonSupprimerQualification = new JButton("Supprimer une qualification");
        JButton boutonSupprimerVol = new JButton("Supprimer un vol");

        JButton boutonAfficherAvion = new JButton("Afficher un avion");
        JButton boutonAfficherType = new JButton("Afficher un type");
        JButton boutonAfficherCompte = new JButton("Afficher un compte");
        JButton boutonAfficherInstructeur = new JButton("Afficher un instructeur");
        JButton boutonAfficherMaintenance = new JButton("Afficher une maintenance");
        JButton boutonAfficherMembre = new JButton("Afficher un membre");
        JButton boutonAfficherOperation = new JButton("Afficher une operation");
        JButton boutonAfficherQualification = new JButton("Afficher une qualification");
        JButton boutonAfficherVol = new JButton("Afficher un vol");

        ongletAjout.add(boutonAjoutAvion);
        ongletAjout.add(boutonAjoutType);
        ongletAjout.add(boutonAjoutCompte);
        ongletAjout.add(boutonAjoutInstructeur);
        ongletAjout.add(boutonAjoutMaintenance);
        ongletAjout.add(boutonAjoutMembre);
        ongletAjout.add(boutonAjoutOperation);
        ongletAjout.add(boutonAjoutQualification);
        ongletAjout.add(boutonAjoutVol);

        boutonAjoutAvion.setBounds(100, 30, 200, 30);
        boutonAjoutType.setBounds(100, 230, 200, 30);
        boutonAjoutCompte.setBounds(450, 30, 200, 30);
        boutonAjoutInstructeur.setBounds(100, 80, 200, 30);
        boutonAjoutMaintenance.setBounds(450, 80, 200, 30);
        boutonAjoutMembre.setBounds(100, 130, 200, 30);
        boutonAjoutOperation.setBounds(450, 130, 200, 30);
        boutonAjoutQualification.setBounds(100, 180, 200, 30);
        boutonAjoutVol.setBounds(450, 180, 200, 30);

        ongletModification.add(boutonModificationAvion);
        ongletModification.add(boutonModificationType);
        ongletModification.add(boutonModificationCompte);
        ongletModification.add(boutonModificationInstructeur);
        ongletModification.add(boutonModificationMaintenance);
        ongletModification.add(boutonModificationMembre);
        ongletModification.add(boutonModificationOperation);
        ongletModification.add(boutonModificationQualification);
        ongletModification.add(boutonModificationVol);

        boutonModificationAvion.setBounds(100, 30, 200, 30);
        boutonModificationType.setBounds(100,230,200,30);
        boutonModificationCompte.setBounds(450, 30, 200, 30);
        boutonModificationInstructeur.setBounds(100, 80, 200, 30);
        boutonModificationMaintenance.setBounds(450, 80, 200, 30);
        boutonModificationMembre.setBounds(100, 130, 200, 30);
        boutonModificationOperation.setBounds(450, 130, 200, 30);
        boutonModificationQualification.setBounds(100, 180, 200, 30);
        boutonModificationVol.setBounds(450, 180, 200, 30);

        ongletSupprimer.add(boutonSupprimerAvion);
        ongletSupprimer.add(boutonSupprimerType);
        ongletSupprimer.add(boutonSupprimerCompte);
        ongletSupprimer.add(boutonSupprimerInstructeur);
        ongletSupprimer.add(boutonSupprimerMaintenance);
        ongletSupprimer.add(boutonSupprimerMembre);
        ongletSupprimer.add(boutonSupprimerOperation);
        ongletSupprimer.add(boutonSupprimerQualification);
        ongletSupprimer.add(boutonSupprimerVol);

        boutonSupprimerAvion.setBounds(100, 30, 200, 30);
        boutonSupprimerType.setBounds(100,230,200,30);
        boutonSupprimerCompte.setBounds(450, 30, 200, 30);
        boutonSupprimerInstructeur.setBounds(100, 80, 200, 30);
        boutonSupprimerMaintenance.setBounds(450, 80, 200, 30);
        boutonSupprimerMembre.setBounds(100, 130, 200, 30);
        boutonSupprimerOperation.setBounds(450, 130, 200, 30);
        boutonSupprimerQualification.setBounds(100, 180, 200, 30);
        boutonSupprimerVol.setBounds(450, 180, 200, 30);

        ongletAfficher.add(boutonAfficherAvion);
        ongletAfficher.add(boutonAfficherType);
        ongletAfficher.add(boutonAfficherCompte);
        ongletAfficher.add(boutonAfficherInstructeur);
        ongletAfficher.add(boutonAfficherMaintenance);
        ongletAfficher.add(boutonAfficherMembre);
        ongletAfficher.add(boutonAfficherOperation);
        ongletAfficher.add(boutonAfficherQualification);
        ongletAfficher.add(boutonAfficherVol);

        boutonAfficherAvion.setBounds(100, 30, 200, 30);
        boutonAfficherType.setBounds(100,230,200,30);
        boutonAfficherCompte.setBounds(450, 30, 200, 30);
        boutonAfficherInstructeur.setBounds(100, 80, 200, 30);
        boutonAfficherMaintenance.setBounds(450, 80, 200, 30);
        boutonAfficherMembre.setBounds(100, 130, 200, 30);
        boutonAfficherOperation.setBounds(450, 130, 200, 30);
        boutonAfficherQualification.setBounds(100, 180, 200, 30);
        boutonAfficherVol.setBounds(450, 180, 200, 30);

        lesOnglets.add(ongletAjout, "Ajout");
        lesOnglets.add(ongletModification, "Modification");
        lesOnglets.add(ongletSupprimer, "Supprimer");
        lesOnglets.add(ongletAfficher, "Afficher");

        fenetreChoix.add(test);
        fenetreChoix.add(lesOnglets);
        fenetreChoix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreChoix.setResizable(true);
        fenetreChoix.setSize(750, 350);
        fenetreChoix.setLocationRelativeTo(null);
        fenetreChoix.setVisible(true);

        boutonAjoutAvion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutAvion();
            }
        });
        
        boutonAjoutType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutTypes();
            }
        });
 

        boutonAjoutCompte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutCompte();
            }
        });

        boutonAjoutInstructeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutInstructeur();
            }
        });

        boutonAjoutMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutMaintenance();
            }
        });

        boutonAjoutMembre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutMembre();
            }
        });

        boutonAjoutOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutOperation();
            }
        });

        boutonAjoutQualification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutQualification();
            }
        });

        boutonAjoutVol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AjoutVol();
            }
        });

        boutonModificationAvion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationAvion();
            }
        });

        boutonModificationCompte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationCompte();
            }
        });

        boutonModificationInstructeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationInstructeur();
            }
        });

        boutonModificationMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationMaintenance();
            }
        });

        boutonModificationMembre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationMembre();
            }
        });

        boutonModificationOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationOperation();
            }
        });

        boutonModificationQualification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationQualification();
            }
        });

        boutonModificationVol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new ModificationVol();
            }
        });

        boutonSupprimerAvion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerAvion();
            }
        });

        boutonSupprimerCompte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerCompte();
            }
        });

        boutonSupprimerInstructeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerInstructeur();
            }
        });

        boutonSupprimerMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerMaintenance();
            }
        });

        boutonSupprimerMembre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerMembre();
            }
        });

        boutonSupprimerOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerOperation();
            }
        });

        boutonSupprimerQualification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerQualification();
            }
        });

        boutonSupprimerVol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new SupprimerVol();
            }
        });

        boutonAfficherAvion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherAvion();
            }
        });
        
        
        boutonAfficherType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherTypes();
            }
        });
        

        boutonAfficherCompte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherCompte();
            }
        });

        boutonAfficherInstructeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherInstructeur();
            }
        });

        boutonAfficherMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherMaintenance();
            }
        });

        boutonAfficherMembre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherMembre();
            }
        });

        boutonAfficherOperation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherOperation();
            }
        });

        boutonAfficherQualification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherQualification();
            }
        });

        boutonAfficherVol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetreChoix.setVisible(false);
                new AfficherVol();
            }
        });

    }

}
