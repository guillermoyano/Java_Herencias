/*
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
package Entidades;

import java.util.Scanner;

public class edificioDeOficinas extends Edificio {

    private Integer numOficinas, numPisos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public edificioDeOficinas() {
    }

    public edificioDeOficinas( Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
     */
    public void cantidadPersonas() {
        int personas = 0;
        do {
            System.out.println("Cuántas personas pueden trabajar en cada oficina?");
            personas = leer.nextInt();
            System.out.println("No te zarpes boludo. Te pensas que es un quilombo?");
        } while (personas >= 10 && personas >= 1);

        do {
            System.out.println("Cuántas oficinas hay en el edificio?");
            setNumOficinas(leer.nextInt());
            System.out.println("No te zarpes boludo. Te pensas que es un quilombo?");
        } while (getNumOficinas() >= 10 && getNumOficinas() >= 1);

        do {
            System.out.println("Cuántos pisos tiene el edificio?");
            setNumPisos(leer.nextInt());
            System.out.println("No te zarpes boludo. Te pensas que es un quilombo?");
        } while (getNumPisos() >= 10 && getNumPisos() >= 1);

    }

    @Override
    public int calcularSuperficie(Integer ancho, Integer largo) {

        return getAncho()*getLargo();
    }

    @Override
    public int calcularVolumen(Integer ancho, Integer alto, Integer largo) {
        return ((getAncho()*getLargo())*getAlto());
    }

    @Override
    public String toString() {
        return super.toString() +"edificioDeOficinas{" + "numOficinas=" + numOficinas + ", numPisos=" + numPisos +'}';
    }
    
    

}
