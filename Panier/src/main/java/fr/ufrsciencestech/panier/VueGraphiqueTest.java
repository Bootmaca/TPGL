/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.controler.Controleur;
import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.view.VueGraphSwing;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author ch098407
 */
public class VueGraphiqueTest {       //classe JUnit 4  
    /*
        private static VueGraphSwing vueg;
        private Controleur c;               //contrôleur associé à la vue  
        private Panier p;  
        
        @Before  
        public void setUp() {     
            vueg = new VueGraphSwing();
            p  = new Panier(2);
            c  = new Controleur();

            c.setModele(p);

            p.addObserver (vueg);        //la vue observe le modèle (panier)    
            vueg.addControleur(c);    //on associe le contrôleur à la vue  
        }
        
        @Test  
        public void testStoryAjouteRetire() {               //test d’acceptation      
            assertNotNull(vueg);  // Instantiated?     
            JLabel res = (JLabel)TestUtils.getChildNamed(vueg, "Affichage");     
            assertNotNull(res); // Component found?     
            final JButton plus = (JButton)TestUtils.getChildNamed(vueg, "Plus");     
            assertNotNull(plus);     
            final JButton moins = (JButton)TestUtils.getChildNamed(vueg, "Moins");     
            assertNotNull(moins);     
            plus.doClick();     
            assertEquals(res.getText(), "1");     
            moins.doClick();     
            assertEquals(res.getText(), "0");  
        }*/
}
