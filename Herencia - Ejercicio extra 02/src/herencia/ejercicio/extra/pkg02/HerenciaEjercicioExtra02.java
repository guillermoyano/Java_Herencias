/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/
package herencia.ejercicio.extra.pkg02;

import Entidades.Edificio;
import Entidades.Polideportivo;
import Entidades.edificioDeOficinas;
import java.util.ArrayList;

public class HerenciaEjercicioExtra02 {

    public static void main(String[] args) {
        
        Polideportivo poli1 = new Polideportivo(true, 100, 3, 200);
        Polideportivo poli2 = new Polideportivo(false, 150, 10, 400);
        edificioDeOficinas edif1 = new edificioDeOficinas(40, 3, 25);
        edificioDeOficinas edif2 = new edificioDeOficinas(50, 6, 30);
        
        edif1.cantidadPersonas();
        edif2.cantidadPersonas();
        
        ArrayList<Edificio> edificitos = new ArrayList();
        edificitos.add(poli1);
        edificitos.add(poli2);
        edificitos.add(edif1);
        edificitos.add(edif2);
        
        for (Edificio edificito : edificitos) {
            
            if (edificito instanceof Polideportivo) {
                
                System.out.println("El edificio tiene las siguientes medidas: " +edificito.toString());
                System.out.println("La superficie es: " +edificito.calcularSuperficie(Integer.SIZE, Integer.SIZE));
                System.out.println("El volumen es: " +edificito.calcularVolumen(Integer.SIZE, Integer.SIZE, Integer.SIZE));
                
            }
            
            if (edificito instanceof edificioDeOficinas) {
                
                System.out.println("El edificio tiene las siguientes medidas: " +edificito.toString());
                System.out.println("La superficie es: " +edificito.calcularSuperficie(Integer.SIZE, Integer.SIZE));
                System.out.println("El volumen es: " +edificito.calcularVolumen(Integer.SIZE, Integer.SIZE, Integer.SIZE));
                
            }
        }
        
    }

}
