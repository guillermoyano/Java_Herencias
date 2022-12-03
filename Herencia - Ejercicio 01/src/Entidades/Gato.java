/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente
*/
package Entidades;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato es: ");
        super.alimentarse(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
