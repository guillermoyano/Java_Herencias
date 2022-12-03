package Entidades;

public class Rectangulo implements calculosFormas {

    double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = 10;
        this.altura = 40;
    }
        
    @Override
    public double calcularArea() {
        double area = base * altura;
        
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        
        return perimetro;
    }

}
