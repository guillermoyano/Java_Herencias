package Utilidades;

import Entidades.Hoteles;
import java.util.Comparator;

public class Comparador {

    public static Comparator<Hoteles>comparadorPrecio=new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles t, Hoteles t1) {
          return (t1.getPrecioHab().compareTo(t.getPrecioHab()));
        }
    };
}
