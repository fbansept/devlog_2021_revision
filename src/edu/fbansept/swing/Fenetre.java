package edu.fbansept.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {

    public Fenetre()  {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        setContentPane(panneau);

        JButton bouton = new JButton("clic moi !");
        panneau.add(bouton);

        ActionListener actionListener = actionEvent -> System.out.println(actionEvent);

        bouton.addActionListener(actionListener);

        bouton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clic !");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenetre();
    }
}
