/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente
*/
package herencia.ejercicio.pkg01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

public class HerenciaEjercicio01 {

    public static void main(String[] args) {
        
        ArrayList <Animal> animalito = new ArrayList();
        
        Animal perro1 = new Perro("Toto", "Carnívoro", "Bearded Collie", 3);
        Animal perro2 = new Perro("Ramón", "Comedetodovoro", "Caniche", 5);
        Animal gato1 = new Gato("Boti", "Carnívoro", "Siamés", 15);
        Animal caballo1 = new Caballo("Spark", "Pasto", "Fino", 25);
        
        animalito.add(perro1);
        animalito.add(perro2);
        animalito.add(gato1);
        animalito.add(caballo1);
        
        for (Animal aux : animalito) {
            aux.alimentarse();
        }
        
    }

}
