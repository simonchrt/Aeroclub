/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SSII-Dev
 */
public class Graphique {

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Interface de connexion");
        fenetre.setLayout(null);
        JLabel id = new JLabel("Identifiant");
        JLabel mdp = new JLabel("Mot de passe");
        JLabel presentation = new JLabel("Aéro-Club de l'Alloeu");
        JLabel message = new JLabel("Veuillez vous identifier");
        JTextField identifiant = new JTextField("aeroclub");
        JPasswordField motDePasse = new JPasswordField("admin");
        motDePasse.setEchoChar('*');
        JButton boutonConnect = new JButton("Connexion");
        JButton boutonEfface = new JButton("Effacer");

        fenetre.add(id);
        fenetre.add(mdp);
        fenetre.add(presentation);
        fenetre.add(identifiant);
        fenetre.add(motDePasse);
        fenetre.add(boutonConnect);
        fenetre.add(boutonEfface);
        fenetre.add(message);

        presentation.setBounds(260, 0, 300, 40);
        presentation.setFont(new Font("Arial", BOLD, 25));
        id.setBounds(20, 80, 80, 15);
        id.setFont(new Font("Arial", BOLD, 15));
        mdp.setBounds(20, 130, 150, 15);
        mdp.setFont(new Font("Arial", BOLD, 15));
        identifiant.setBounds(200, 75, 530, 30);
        motDePasse.setBounds(200, 125, 530, 30);
        boutonConnect.setBounds(150, 170, 100, 40);
        boutonEfface.setBounds(500, 170, 100, 40);
        message.setBounds(310, 230, 150, 30);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(true);
        fenetre.setSize(750, 300);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

        boutonConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (identifiant.getText().equals("aeroclub") && motDePasse.getText().equals("admin")) {
                    message.setText("");
                    new Choix();
                    fenetre.setVisible(false);
                } else {
                    message.setForeground(Color.red);
                    message.setBounds(275, 230, 250, 30);
                    message.setText("Identifiant / Mot de passe erroné(s)");
                }
            }
        });

        boutonEfface.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                identifiant.setText("");
                motDePasse.setText("");
            }
        });
    }
}
