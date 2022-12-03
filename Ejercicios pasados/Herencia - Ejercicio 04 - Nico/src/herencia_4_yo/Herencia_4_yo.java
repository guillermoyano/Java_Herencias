/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
 */
package herencia_4_yo;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Entidades.calculosFormas;


public class Herencia_4_yo {

  
    public static void main(String[] args) {
        Circulo c1=new Circulo(5, 10);
        Rectangulo r1=new Rectangulo(6, 4);
        System.out.println("El area del Circulo es de: "+c1.calcularArea());
        System.out.println("El perimetro del Circulo es de: "+c1.calcularPerimetro());
        System.out.println("El area del Rectangulo es de: "+r1.calcularArea());
        System.out.println("El perimetro del Rectangulo es de: "+r1.calcularPerimetro());
        
    }
    
}
