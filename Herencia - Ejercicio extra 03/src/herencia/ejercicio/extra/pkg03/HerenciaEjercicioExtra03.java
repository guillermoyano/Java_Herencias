/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros. 
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. 
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
*/
package herencia.ejercicio.extra.pkg03;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel_4;
import Entidades.Hotel_5;
import Entidades.Hoteles;
import Entidades.Residencia;
import static Utilidades.Comparador.comparadorPrecio;
import java.util.ArrayList;
import java.util.Collections;

public class HerenciaEjercicioExtra03 {

    public static void main(String[] args) {
        Hotel_4 h4 = new Hotel_4(true, "Papa Loca", 15, 30, 10, 0, "Hotelcito de Fernando", "Carapachai", "Chiquito", "SiempreViva123");
        Hotel_5 h5 = new Hotel_5(4, 8, 15, true, "Rincon Norteño", 10, 35, 12, 0, "Hotel del Guille", "Lugano", "Toto", "Esmeralda452");
        Hotel_4 h6 = new Hotel_4(false, "Vosfi Loca", 2, 3, 5, 0, "Hotelcito de Fernando", "Carapachai", "Chiquito", "SiempreViva123");
        Hotel_5 h7 = new Hotel_5(4, 8, 15, false, "Yapeyu Norteño", 22, 20, 15, 0, "Hotel del Gonza", "Maipu", "Marvin", "Potrerillos123");
        Alojamiento c1 = new Camping(20, 2, true, false, 250, "Camping las terlipes", "bariloche", "tu vieja", "MoriaCasan456");
        Alojamiento r1 = new Residencia(20, true, true, false, 450, "UPCN", "Ezeiza", "Otonello", "Dejen de joder 123");
        ArrayList<Alojamiento> alojandoBoludos = new ArrayList();
        ArrayList<Hoteles> hotelcitos = new ArrayList();

        alojandoBoludos.add(r1);
        alojandoBoludos.add(h4);
        alojandoBoludos.add(h5);
        alojandoBoludos.add(h6);
        alojandoBoludos.add(h7);
        alojandoBoludos.add(c1);
        hotelcitos.add(h4);
        hotelcitos.add(h5);
        hotelcitos.add(h6);
        hotelcitos.add(h7);

        for (Alojamiento aux : alojandoBoludos) {
            if (aux instanceof Hotel_4) {
                ((Hotel_4) aux).valorHab();
            }
            if (aux instanceof Hotel_5) {
                ((Hotel_4) aux).valorHab();
            }
            System.out.println(aux);
        }
        Collections.sort(hotelcitos, comparadorPrecio);
        System.out.println("----------------------");
        for (Hoteles aux : hotelcitos) {
            System.out.println("Los hoteles del mas caro al mas barato son: ");
            System.out.println(aux);
        }
        for (Alojamiento aux : alojandoBoludos) {
            if (aux instanceof Camping) {
                System.out.println("Camping con resto:  ");
                if (((Camping) aux).isResto()) {
                    System.out.println(aux);
                }
            }
        }
        for (Alojamiento aux : alojandoBoludos) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescuento()) {
                    System.out.println("Residencia con descuento: ");
                    System.out.println(aux);
                }
            }
        }
    }
}
