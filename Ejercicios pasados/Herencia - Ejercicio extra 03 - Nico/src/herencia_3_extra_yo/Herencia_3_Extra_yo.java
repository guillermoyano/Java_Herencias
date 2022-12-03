/*

 */
package herencia_3_extra_yo;

import static Comparator.Comparador.comparadorPrecio;
import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Hoteles;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;

public class Herencia_3_Extra_yo {

    public static void main(String[] args) {
        Hotel4 h4 = new Hotel4(true, "Papa Loca", 15, 30, 10, 0, "Hotelcito de Fernando", "Carapachai", "Chiquito", "SiempreViva123");
        Hotel5 h5 = new Hotel5(4, 8, 15, true, "Rincon Norteño", 10, 35, 12, 0, "Hotel del Guille", "Lugano", "Toto", "Esmeralda452");
        Hotel4 h6 = new Hotel4(false, "Vosfi Loca", 2, 3, 5, 0, "Hotelcito de Fernando", "Carapachai", "Chiquito", "SiempreViva123");
        Hotel5 h7 = new Hotel5(4, 8, 15, false, "Yapeyu Norteño", 22, 20, 15, 0, "Hotel del Gonza", "Maipu", "Marvin", "Potrerillos123");
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
            if (aux instanceof Hotel4) {
                ((Hotel4) aux).valorHab();

            }
            if (aux instanceof Hotel5) {
                ((Hotel4) aux).valorHab();

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
