/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Comparadores;

import Entidad.Hoteles;
import java.util.Comparator;

/**
 *
 * @author pittu
 */

public class Comparadores {
    
    public static Comparator<Hoteles> compararPrecio=new Comparator<Hoteles>(){  
        @Override
        public int compare(Hoteles t,Hoteles t1){
        return t1.getPrecioHabitaciones().compareTo(t.getPrecioHabitaciones());
        
        }
        
    
    
    
    
    };

}
