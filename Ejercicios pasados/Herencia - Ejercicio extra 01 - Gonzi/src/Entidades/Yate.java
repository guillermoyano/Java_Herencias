/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Potencia en CV y número de camarotes para yates de lujo.
 *
 * @author Usuario
 */
public final class Yate extends Barco {

    protected Integer numCamarotes;

    public Yate() {

    }

    public Yate(Integer numCamarotes, Integer potenciaMotor, Integer matricula, Integer anioFabricacion, Integer eslora) {
        super(potenciaMotor, matricula, anioFabricacion, eslora);
        this.numCamarotes = numCamarotes;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + " Yate " + "Numero de Camarotes: " + numCamarotes;
    }

    @Override
    public void generarBarco() {
        super.generarBarco();
        System.out.println("Ingrese la cantidad de Camarotes");
        numCamarotes = leer.nextInt();
    }

    @Override
    public int calcularAlquiler() {
        return (super.calcularAlquiler() + numCamarotes);
    }

}
