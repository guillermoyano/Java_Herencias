/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;


import Entidades.Hoteles;
import java.util.Comparator;

/**
 *
 * @author Pergo
 */
public class Comparador {
    public static Comparator<Hoteles>comparadorPrecio=new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles t, Hoteles t1) {
          return (t1.getPrecioHab().compareTo(t.getPrecioHab()));
        }
    };
            
    }
            
            
            

