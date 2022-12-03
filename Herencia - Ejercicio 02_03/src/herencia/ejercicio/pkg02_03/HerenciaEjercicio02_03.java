package herencia.ejercicio.pkg02_03;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class HerenciaEjercicio02_03 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> aparato = new ArrayList();

        Electrodomestico ele = new Electrodomestico();
        Lavadora lava = new Lavadora();
        Televisor tele = new Televisor();
        Lavadora lava1 = new Lavadora();
        Televisor tele1 = new Televisor();

        System.out.println("Creamos la primera lavadora");
        lava.crearLavadora();
        lava.precioFinal();
        System.out.println("Creamos la segunda lavadora");
        lava1.crearLavadora();
        lava1.precioFinal();
        System.out.println("Creamos la primera televisión");
        tele.crearTelevisor();
        tele.precioFinal();
        System.out.println("Creamos la segunda televisión");
        tele1.crearTelevisor();
        tele1.precioFinal();
        aparato.add(lava);
        aparato.add(tele);
        aparato.add(lava1);
        aparato.add(tele1);
        int precioLava=0, precioTele=0;

        for (Electrodomestico aux : aparato) {
            System.out.println(aux);
            System.out.println("");
            if (aux instanceof Lavadora) {
                precioLava = aux.getPrecio()+precioLava;
            }
            
            if (aux instanceof Televisor) {
                precioTele = aux.getPrecio()+precioTele;
            }
        }
        System.out.println("La suma de las 2 lavadoras es: " +precioLava);
        System.out.println("La suma de las 2 Televisiones es: " +precioTele);
        System.out.println("Te patinaste un total de: " +(precioLava+precioTele));

    }

}
