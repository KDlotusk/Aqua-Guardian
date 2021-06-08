/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alerte;

import Data.TypeNotif;

/**
 * Gère les notifications à envoyer sur le téléphone de l'ordinateur.
 * 
 * @see Message
 * 
 * @author p2005779
 */
public class Notification extends Message {
    private TypeNotif type;
    
    public boolean sentTo() {
        return true;
    }
}
