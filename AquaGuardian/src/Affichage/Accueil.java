/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affichage;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Contient tous les éléments graphiques pour la page d'accueil.
 * 
 * @see Page
 * 
 * @author p2000397
 */
public class Accueil extends Page {
    private JButton btnConseil, btnMétéo, btnNotif;

    public Accueil() {
        this.btnConseil = new JButton();
        this.btnMétéo = new JButton();
        this.btnNotif = new JButton();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
