package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.controler.Controleur;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celine
 */
public class VueGraphAWT extends Frame implements VueG{
    private Button btAjouter;
    private Button btRetirer;
    private Label affiche;

    /**
     * @return the btAjouter
     */
    public Button getBtAjouter() {
        return btAjouter;
    }

    /**
     * @return the btRetirer
     */
    public Button getBtRetirer() {
        return btRetirer;
    }
    
    /**
     * @param btAjouter the btAjouter to set
     */
    public void setBtAjouter(Button btAjouter) {
        this.btAjouter = btAjouter;
    }

    /**
     * @param btRetirer the btRetirer to set
     */
    public void setBtRetirer(Button btRetirer) {
        this.btRetirer = btRetirer;
    }

    /**
     * @return the affiche
     */
    public Label getAffiche() {
        return affiche;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(Label affiche) {
        this.affiche = affiche;
    }
   
    public VueGraphAWT(){
        super("Panier AWT");
        btAjouter = new Button("+");
        btRetirer = new Button("-");
        affiche = new Label("0", Label.CENTER);
        add(btAjouter, BorderLayout.NORTH);
        add(btRetirer, BorderLayout.SOUTH);
        add(affiche, BorderLayout.CENTER);
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        this.pack();
        this.setVisible(true);
        
        /* Use setName() so AssertJ Swing can find these components easily */
        btAjouter.setName("Plus");
        btRetirer.setName("Moins");
        affiche.setName("Affichage");
    }
    
    public void addControleur(Controleur c){
        getBtAjouter().addActionListener(c);
        getBtRetirer().addActionListener(c);
    }
    
    @Override
    public void update(Observable m, Object compte){     //This method is called whenever the observed object is changed
        getAffiche().setText(((Integer) compte).toString());
    }
}
