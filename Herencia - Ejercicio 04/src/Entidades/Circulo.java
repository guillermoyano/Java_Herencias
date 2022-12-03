package Entidades;

public class Circulo implements calculosFormas {

    double radio, diametro;

    public Circulo(double radio, double diametro) {
        this.radio = 5;
        this.diametro = 10;
    }
    
    @Override
    public double calcularArea() {
        double area = pichin * Math.pow(radio, 2);
        
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = pichin * diametro;
        
        return perimetro;
    }

}
