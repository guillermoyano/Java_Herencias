/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Scanner;

/**
 *
 * @author pittu
 */

public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
    }

    

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    public abstract int calcularSuperficie();
    public abstract int calcularVolumen();

}
