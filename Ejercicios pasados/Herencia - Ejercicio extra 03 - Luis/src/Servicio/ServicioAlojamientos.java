/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Comparadores.Comparadores;
import Entidad.Alojamientos;
import Entidad.Camping;
import Entidad.ExtraHoteleros;
import Entidad.HotelCinco;
import Entidad.HotelCuatro;
import Entidad.Hoteles;
import Entidad.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioAlojamientos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CalcularPrecioHabitacion(ArrayList<Hoteles> h1) {
        for (Hoteles aux : h1) {
            if (aux instanceof Hoteles) {
                if (aux instanceof HotelCuatro) {
                    ((HotelCuatro) aux).setPrecioHabitaciones(((HotelCuatro) aux).PrecioHabitacion());
                } else {
                    ((HotelCinco) aux).setPrecioHabitaciones(((HotelCinco) aux).PrecioHabitacion());
                }
            }

        }
    }

    public void menu(ArrayList<Hoteles> h1, ArrayList<ExtraHoteleros> e1) {

        int opcion;
        do {
            System.out.println("-------------------------");
            System.out.println("\tMenu ");
            System.out.println("-------------------------");
            System.out.println("1 - Consultar todos los Alojamientos");
            System.out.println("2 - Mostrar Hoteles por precio Mayor/Menor");
            System.out.println("3 - Motrar Campings con restaurantes");
            System.out.println("4 - Mostrar Residencias con descuentos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Alojamiento tipo Hoteles");
                    System.out.println("-------------------------");
                    for (Alojamientos aux : h1) {
                        System.out.println(aux);

                    }
                    System.out.println("-------------------------");
                    System.out.println("Alojamiento Extra Hoteleros");
                    System.out.println("-------------------------");
                    for (ExtraHoteleros aux : e1) {
                        System.out.println(aux);
                    }

                    break;
                case 2:

                    Collections.sort(h1, Comparadores.compararPrecio);
                    System.out.println("-------------------------");
                    System.out.println("Precios de hoteles Mayor/Menor");
                    System.out.println("-------------------------");
                    for (Hoteles aux : h1) {
                        System.out.println(aux);

                    }

                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Campings con restaurantes");
                    System.out.println("-------------------------");
                    for (ExtraHoteleros aux : e1) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).getRestaurante()) {
                                System.out.println(aux);
                            }
                            
                        }
                        
                    }

                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Residencia con descuentos");
                    System.out.println("-------------------------");
                    for (ExtraHoteleros aux : e1) {
                        if (aux instanceof Residencias) {
                            if (((Residencias) aux).getDescuento()) {
                                System.out.println(aux);   
                            }
                            
                        }
                        
                    }
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }

}
