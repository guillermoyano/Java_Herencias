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

public class Yate extends BarcoMotor{
    private Integer numCamarotes;

    public Yate() {
    }

    public Yate(Integer numCamarotes, Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
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
        return "N° Camarotes: " + numCamarotes + ", Potencia CV: " + potenciaCV +", Matricula: " + matricula + ", Eslora: " + eslora + ", Año de Fabricación: " + anioFabricacion;
    }

    
    
    
    
    @Override
    public Integer moduloBarco() {
        return super.moduloBarco()+numCamarotes; //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
