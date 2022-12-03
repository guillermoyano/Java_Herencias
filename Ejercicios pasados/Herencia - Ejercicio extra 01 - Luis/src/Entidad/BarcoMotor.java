/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class BarcoMotor extends Barco{
    
    protected Integer potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    
    
    

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public Integer moduloBarco() {
        return super.moduloBarco()+potenciaCV; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Potencia CV: " + potenciaCV + ", Matricula: " + matricula + ", Eslora: " + eslora + ", Año de Fabricación: " + anioFabricacion;
    }
    
    
    

}
