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
    
    public Parcelle(){
        
    }
    
    public boolean rejouterPlante(Plante plante){
        return true;
    }
    
}
