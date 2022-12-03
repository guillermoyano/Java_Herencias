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
public class Circulo implements calculosFormas {

    int radio ;
    int diametro;

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    

    @Override
    public double calcularArea() {
        double area = PI1 * Math.pow(radio, 2);

//        throw new UnsupportedOperationException("Not supported yet.");
        return area;
    }

    @Override
    public double calcularPerimetro() {
//        throw new UnsupportedOperationException("Not supported yet.");
        double perimetro = PI1 * diametro;
        return perimetro;
    }

}
