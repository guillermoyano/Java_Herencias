/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final. 
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public class Rectangulo implements calculosFormas{
    int altura;
    int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
      double area=base*altura;
      return area;
    }

    @Override
    public double calcularPerimetro() {
     double perimetro=(base+altura)*2;
     return perimetro;
    }
    
   
}
