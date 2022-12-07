/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioEdificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas crearEdificio() {

        EdificioDeOficinas e1 = new EdificioDeOficinas();
        System.out.println("-------------------------------------");
        System.out.println("VAMOS A CREAR UN EDIFICIO DE OFICINAS");
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el numero de oficinas por piso");
        e1.setNumOficinas(leer.nextInt());
        System.out.println("Ingrese el ANCHO de la oficina");
        e1.setAncho(leer.nextInt());
        System.out.println("Ingrese el LARGO de la oficina");
        e1.setLargo(leer.nextInt());
        System.out.println("Ingrese el ALTO de la oficina");
        e1.setAlto(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas por oficina");
        e1.setCantidadPersonas(leer.nextInt());
        System.out.println("Ingrese el numero de pisos del edificio");
        e1.setNumPisos(leer.nextInt());

        return e1;

    }

    public Polideportivo crearPolideportivo() {
        Polideportivo p1 = new Polideportivo();
        System.out.println("-------------------------------");
        System.out.println("VAMOS A CREAR UN POLIDEPORTIVO");
        System.out.println("-----------------------------");
        System.out.println("Ingrese el nombre del polideportivo");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el ANCHO del polideportivo");
        p1.setAncho(leer.nextInt());
        System.out.println("Ingrese el LARGO del polideportivo");
        p1.setLargo(leer.nextInt());
        System.out.println("Ingrese el ALTO del polideportivo");
        p1.setAlto(leer.nextInt());
        String opcion = "";
        do {

            System.out.println("El polideportivo tiene techo? S/N");
            opcion = leer.next();

            if (opcion.equalsIgnoreCase("s")) {
                p1.setTecho(true);

            } else if (opcion.equalsIgnoreCase("n")) {
                 p1.setTecho(false);

            } else{
            System.out.println("¡OPCIÓN NO VALIDA! Igrese una opción valida");
            
            }

        } while (!opcion.equalsIgnoreCase("n")&&!opcion.equalsIgnoreCase("s"));

        return p1;
    }

}
