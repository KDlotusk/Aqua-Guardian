/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affichage;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author p2005779
 */
public abstract class Page extends JPanel implements ActionListener {
    public abstract void affiche();
}
