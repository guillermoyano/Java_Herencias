

package ejercicioextra3_guia10;

//@author pittu


import Entidad.Camping;
import Entidad.Hoteles;
import Entidad.HotelCinco;
import Entidad.HotelCuatro;
import Entidad.Residencias;
import java.util.ArrayList;

import Entidad.ExtraHoteleros;
import Servicio.ServicioAlojamientos;


import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioAlojamientos accion=new ServicioAlojamientos();
        
        ArrayList<Hoteles> h1=new ArrayList();
        ArrayList<ExtraHoteleros> e1=new ArrayList();
        
        
        //gimnasio, nombreRest, capacidadRest, cantidadHabitaciones, numeroCamas, numeroPisos, precioHabitaciones, nombre, direccion,  localidad, gerente
        HotelCuatro h4=new HotelCuatro("A"," Villa Madrid", 120, 150, 180, 5, 50, "La cumbres", "Maipu 5000", "Vicente lopez", "Pedro perez");
        h1.add(h4);
        HotelCuatro h42=new HotelCuatro("B","Gran via", 230, 250, 290, 7, 50, "La chimeneas", "segunda avenida", "Martinez", "Ernesto");
        h1.add(h42);
        //CantSalonesConf, cantSuites, cantLimosinas, Gimnasio, nombreRest, CapacidadRest, cantidadHabitaciones, numeroCamas, numeroPisos, precioHabitaciones, nombre, direccion, localidad,  gerente)
        HotelCinco h5=new HotelCinco(3, 20,15, "B", "Sigue la vaca", 200, 220, 280, 10, 50, "Taltal", "Santa Fe, 1250", "Palermo", "Juan");
        h1.add(h5);
        HotelCinco h52=new HotelCinco(5, 30,20, "A", "lo de cacho", 300, 350, 350, 15, 50, "El grande", "9 de julio, 500", "Microcentro", "Katalina");
        h1.add(h52);
        
        Camping c1=new Camping(50, 5, true, true, 250, "Agua viva", "asdas dfdsf", "Pilar", "Jose");
        e1.add(c1);
        Camping c12=new Camping(60, 7, false, true, 300, "Aguas negras", "carrera segunda", "La plata", "Walter");
        e1.add(c12);
        
        Residencias r1=new Residencias(80, false,true, false, 230, "Las toninas", "Av principal", "Mar del plata", "Carlos");
        e1.add(r1);
        Residencias r12=new Residencias(90, true,false, true, 300, "Las toninas2", "Av principal", "Mar del plata", "Hermano Carlos");
        e1.add(r12);
        
        
        accion.CalcularPrecioHabitacion(h1);
        
        accion.menu(h1, e1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
