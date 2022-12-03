/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_2_yo;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Herencia_2_yo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico Ele = new Electrodomestico();
        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();
        List<Electrodomestico> el1 = new ArrayList();
        String opc = "", opc1 = "";

        System.out.println("Vamos a cargar electrodomesticos");
        do {
            do {
                System.out.println("Desea crear una Lavadora o un televisor?(L/T)");
                opc1 = leer.next();
                if (opc1.equalsIgnoreCase("l")) {
                    el1.add(l1.crearLavadora());
                }
                if (opc1.equalsIgnoreCase("t")) {
                    el1.add(t1.crearTelevisor());
                } else if (!opc1.equalsIgnoreCase("l")||!(opc1.equalsIgnoreCase("t"))) {
                    System.out.println("Le erraste de tecla vamos devuelta ");
                   
                }
                System.out.println("Volvemos a arrancar?(si/no)");
                opc1=leer.next();
            } while (opc1.equalsIgnoreCase("si"));

            System.out.println("Desea cargar otros Electrodomesticos(Si/No)");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("si"));
        double precio1 = 0, precio2 = 0;
        for (Electrodomestico aux : el1) {
            System.out.println(aux.toString());
            if (aux instanceof Lavadora) {
                precio1 = aux.getPrecio() + precio1;
            }
            if (aux instanceof Televisor) {
                precio2 = aux.getPrecio() + precio2;
            }
        }
        System.out.println("Los totales de las Lavadoras son de: " + precio1);
        System.out.println("Los totales de los Televisores son de: " + precio2);
        System.out.println("El total en electrodomesticos es de: " + (precio1 + precio2));
    }

}
