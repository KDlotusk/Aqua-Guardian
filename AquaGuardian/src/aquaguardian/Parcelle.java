/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquaguardian;

import Data.*;

/**
 *
 * @author p2005779
 */
public class Parcelle {
    
    private EnumTypeSol typeDeSol;
    private EnumExposition expostion;
    private int dernierArrosage;
    private int humidite;
    
    /**
     * Création d'une parcelle
     * @param typeDeSol Type de sol de la parcelle 
     * @param expostion Exposition au soleil de la parcelle 
     * @param dernierArrosage Date du dernière arrosage (TimeStamp)
     * @param humidite Humidité de la parcelle
     */
    public Parcelle(EnumTypeSol typeDeSol, EnumExposition expostion, int dernierArrosage, int humidite){
        
    }
    
    /**
     * Vérifie si la plante passé en paramètre peut être ajouté à la parcelle
     * @param plante Plante souhaitée
     * @return 
     */
    public boolean rejouterPlante(Plante plante){
        return true;
    }
    
}
