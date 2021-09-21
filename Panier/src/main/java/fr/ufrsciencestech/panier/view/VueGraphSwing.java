/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.controler.Controleur;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author celine
 */
public class VueGraphSwing extends JFrame implements VueG{
    private JButton btAjouter;
    private JButton btRetirer;
    private JLabel affiche;
    
    public VueGraphSwing(){
        super ("Panier Swing");
        btAjouter = new JButton("+");
        btRetirer = new JButton("-");
        affiche = new JLabel("0", JLabel.CENTER);
        add(btAjouter, BorderLayout.NORTH);
        add(btRetirer, BorderLayout.SOUTH);
        add(affiche, BorderLayout.CENTER);
        
        btAjouter.setName("Plus");
        btRetirer.setName("Moins");
        affiche.setName("Affichage");
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addControleur(Controleur c){
        getBtAjouter().addActionListener(c);
        getBtRetirer().addActionListener(c);
    }
    
    @Override
    public void update(Observable m, Object compte){     //This method is called whenever the observed object is changed
        getAffiche().setText(((Integer) compte).toString());
    }

    /**
     * @return the inc
     */
    public JButton getBtAjouter() {
        return btAjouter;
    }

    /**
     * @param inc the inc to set
     */
    public void setBtAjouter(JButton btAjouter) {
        this.btAjouter = btAjouter;
    }

    /**
     * @return the dec
     */
    public JButton getBtRetirer() {
        return btRetirer;
    }

    /**
     * @param dec the dec to set
     */
    public void setBtRetirer(JButton btRetirer) {
        this.btRetirer = btRetirer;
    }

    /**
     * @return the affiche
     */
    public JLabel getAffiche() {
        return affiche;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(JLabel affiche) {
        this.affiche = affiche;
    }
}
