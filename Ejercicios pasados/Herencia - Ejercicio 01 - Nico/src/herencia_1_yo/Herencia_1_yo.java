/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_1_yo;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;

public class Herencia_1_yo {

    public static void main(String[] args) {
        List<Animal> animalitos = new ArrayList();
        Animal p1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
//      p1.mostrar();
        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihiahia");
//      p2.mostrar();
        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siames");
//      g1.mostrar();
        Animal c1 = new Caballo("Spark", "Pasto", 25, "fino");
//      c1.mostrar();

        animalitos.add(c1);
        animalitos.add(p1);
        animalitos.add(p2);
        animalitos.add(g1);
        for (Animal aux : animalitos) {
            aux.mostrar();
        }
    }

}
