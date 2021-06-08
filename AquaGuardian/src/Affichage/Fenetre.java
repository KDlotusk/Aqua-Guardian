/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affichage;

import javax.swing.JFrame;

/**
 *
 * @author p2005779
 */
public class Fenetre extends JFrame {

    public Fenetre() {
        this.setTitle("");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.affichePage(new Accueil());
    }
    
    
    public void affichePage(Page p) {
        
    }
}
