/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquaguardian;

import Data.EnumMeteo;

/**
 *
 * @author p2005779
 */
public class Meteo {
    
    private int date;
    private EnumMeteo tmpsMatin;
    private EnumMeteo tmpsAprem;
    private EnumMeteo tmpsSoir;
    private int temperature;
    
    /**
     * Crée un objet contenant la meteo pour la date renseignée
     * @param date Date du jour 
     * @param tmpsMatin Temps attendu pour le matin
     * @param tmpsAprem Temps attendu pour l'après midi
     * @param tmpsSoir Temps attendu pour le soir
     * @param temperature Température moyenne de la journée 
     */
    public Meteo(int date, EnumMeteo tmpsMatin, EnumMeteo tmpsAprem,EnumMeteo tmpsSoir, int temperature){
        
    }
    
}
