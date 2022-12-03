/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Potencia en CV para barcos a motor.
 *
 * @author Usuario
 */
public class Barco extends Amarre {

    protected Integer potenciaMotor;

    public Barco() {

    }

    public Barco(Integer potenciaMotor, Integer matricula, Integer anioFabricacion, Integer eslora) {
        super(matricula, anioFabricacion, eslora);
        this.potenciaMotor = potenciaMotor;
    }

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return super.toString() + " Barco " + "potencia del Motor: " + potenciaMotor;
    }

    @Override
    public void generarBarco() {
        super.generarBarco();
        System.out.println("Ingrese la potencia del Motor");
        potenciaMotor = leer.nextInt();
    }

    @Override
    public int calcularAlquiler() {
        return (super.calcularAlquiler() + potenciaMotor);
    }

}
