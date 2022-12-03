/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Número de mástiles para veleros.
 *
 * @author Usuario
 */
public final class Velero extends Amarre {

    protected Integer numMastiles;

    public Velero() {

    }

    public Velero(Integer numMastiles, Integer matricula, Integer anioFabricacion, Integer eslora) {
        super(matricula, anioFabricacion, eslora);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public void generarBarco() {
        super.generarBarco();
        System.out.println("Ingrese la cantidad de Mastiles");
        numMastiles = leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " Velero " + "Numero de Mastiles: " + numMastiles;
    }

    @Override
    public int calcularAlquiler() {
        return (super.calcularAlquiler() + numMastiles);
    }

}
