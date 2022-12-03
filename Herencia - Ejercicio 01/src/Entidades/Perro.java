/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente
*/
package Entidades;

import java.util.Scanner;

public class Perro extends Animal {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String comida;

    public Perro(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Qué carajo como el perro? " +nombre);
        comida = leer.next();
        System.out.println(comida);
        super.alimentarse(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
