

package ejercicioextra1_guia10;

//@author pittu

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Cliente;
import Entidad.Velero;
import Entidad.Yate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Barco>barcos=new ArrayList();
        
        
        //creacion de los barcos
        Velero v1=new Velero(4, "FG40P1", 20, 1960);
        barcos.add(v1);
        BarcoMotor b1=new BarcoMotor(65, "TG432S", 10, 1970);
        barcos.add(b1);
        Yate y1=new Yate(2, 45, "652GYT",30, 2010);
        barcos.add(y1);
        Velero v2=new Velero(3, "OPI678", 33, 1999);
        barcos.add(v2);
        BarcoMotor b2=new BarcoMotor(55, "589UTY", 22, 1995);
        barcos.add(b2);
        Yate y2=new Yate(4, 22, "L8Y6T5",45, 2015);
        barcos.add(y2);
        
        //inicio proceso de alquiler
        System.out.println("Desea alquilar un barco S/N");
        String opcion=leer.next();
        if (opcion.equalsIgnoreCase("s")) {
            Cliente c1=new Cliente();
            c1.crearCliente();
            Alquiler a1=new Alquiler();
            a1.setCliente(c1);
            int dias=a1.calcularDias();
            System.out.println("--------------------------------");
            System.out.println("Barcos disponibles para alquilar");
            System.out.println("--------------------------------");
            
            //mostramos los barcos
            int i=0;
            for (Barco aux : barcos) {
                i++;
            if (aux instanceof Velero) {
                
                System.out.print("Velero/ [Amarre N° "+i +"] ");
                System.out.println(aux);
            } else if (aux instanceof BarcoMotor) {
                   System.out.print("Barco Motor/ [Amarre N° "+i +"] ");
                System.out.println(aux);
                    
                }else if (aux instanceof Yate) {
                   System.out.print("Yate/ [Amarre N° "+i +"] ");
                System.out.println(aux);
                    
                }
            
        }
            System.out.println("--------------------------------");
            System.out.println("Indique el N° de amarre de la embarcación que va a alquilar");
            System.out.println("--------------------------------");
            int opcion2=leer.nextInt();
            
            int precio= barcos.get(opcion2-1).moduloBarco()*dias;
            System.out.print("El precio del alquiler es: "+precio);
            
            //guardamos la posicio del barco y el barco en alquiler
            a1.setPosicionAmarre(opcion2);
            a1.setBarco(barcos.get(opcion2-1));
            
            
        }else{
        
            System.out.println("Hasta luego");
        }
       
        
        
        
        
        
    }

}
