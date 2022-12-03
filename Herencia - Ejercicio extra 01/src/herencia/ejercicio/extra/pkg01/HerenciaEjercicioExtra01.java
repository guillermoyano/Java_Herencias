/*
. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler
*/
package herencia.ejercicio.extra.pkg01;

import Entidades.Amarre;
import Entidades.Barco;
import Entidades.Veleros;
import Entidades.Yates;
import Entidades.barcosMotor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjercicioExtra01 {

    
    public static void main(String[] args)throws ParseException {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Barco> barquitos = new ArrayList();
        ArrayList <Amarre> alquiler = new ArrayList();
        Amarre a = new Amarre();
        
        Veleros v1 = new Veleros (5, 1234, 20, 1978);
        barquitos.add(v1);
        Veleros v2 = new Veleros (10, 2345, 30, 1979);
        barquitos.add(v2);
        Veleros v3 = new Veleros (15, 3456, 40, 1980);
        barquitos.add(v3);
        Veleros v4 = new Veleros (20, 4567, 50, 1981);
        barquitos.add(v4);
        barcosMotor b1 = new barcosMotor(200, 1515, 20, 1982);
        barquitos.add(b1);
        barcosMotor b2 = new barcosMotor(250, 1516, 40, 1983);
        barquitos.add(b2);
        barcosMotor b3 = new barcosMotor(300, 1517, 60, 1984);
        barquitos.add(b3);
        barcosMotor b4 = new barcosMotor(350, 1518, 80, 1985);
        barquitos.add(b4);
        Yates y1 = new Yates (10, 200, 1616, 30, 1986);
        barquitos.add(y1);
        Yates y2 = new Yates (15, 230, 1617, 60, 1989);
        barquitos.add(y2);
        Yates y3 = new Yates (20, 260, 1618, 90, 1988);
        barquitos.add(y3);
        Yates y4 = new Yates (25, 290, 1619, 120, 1989);
        barquitos.add(y4);
        
        int pos=0, pochi, dolor;
        
        for (Barco aux : barquitos) {
            System.out.println("En la posición " +(pos +1)+  " " + aux);
            pos++;
        }
        System.out.println("");
      
        System.out.println("Elija la posición del barco que se va a llevar");
        pochi = leer.nextInt();
        pochi = pochi -1;
        
        System.out.println(barquitos.get(pochi));
    
        dolor = a.dias() * barquitos.get(pochi).modulo();
        System.out.println("");
        System.out.println("El costo del alquiler es: " +dolor+ " dólares");
    }
    
    

}
