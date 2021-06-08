/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affichage;

import javax.swing.JWindow;

/**
 * Permet de gérer l’affichage dans la fenêtre.
 * 
 * @author p2005779, p2000397
 */
public class Fenetre extends JWindow {

    public Fenetre() {
        this.affichePage(new Accueil());
        this.pack();
    }
    
    /**
    * Affiche la page passé en paramètre
    * 
    * @param p la <code>Page</code> qu'on veut afficher
    * 
    * @see Page
    */
    public void affichePage(Page p) {
        
    }
}
