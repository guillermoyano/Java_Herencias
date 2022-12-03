/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */


public final class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
     public void mostrar(){
//        System.out.println(this.getAlimento());
        System.out.println(this.getEdad()+this.getNombre()+this.getRaza()+this.getAlimento());
    }
    
}