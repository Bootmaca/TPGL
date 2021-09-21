/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.controler;

import fr.ufrsciencestech.panier.model.Orange;
import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.model.PanierPleinException;
import fr.ufrsciencestech.panier.model.PanierVideException;
import fr.ufrsciencestech.panier.view.VueGSwing;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ch098407
 */
public class Controleur implements ActionListener {

    private Panier panier;
    private VueGSwing vue;

    @Override
    public void actionPerformed(ActionEvent e) {   //Appeler lorsque qu'un clic sur un bouton de la vue à été observé
        Orange uneOrange = new Orange(10, "France");//Création d'une orange qui va être ajouté à chaque fois
        if (((Component) e.getSource()).getName().equals("Plus")) {
            try {
                panier.ajout(uneOrange);
            } catch (PanierPleinException exPlein) {
                System.out.println("Erreur d'ajout");
            }
        } else {
            try {
                panier.retrait();
            } catch (PanierVideException exVide) {
                System.out.println("Erreur de retrait");
            }
        }
    }

    public void setModele(Panier p) {
        this.panier = p;
    }

    public void setVue(VueGSwing v) {
        this.vue = v;
    }
}
