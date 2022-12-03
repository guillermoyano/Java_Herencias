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

public class Velero extends Barco {
    private Integer numMastiles;

    public Velero() {
    }

    public Velero(Integer numMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    
    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "N° mastiles: " + numMastiles + ", Matricula: " + matricula + ", Eslora: " + eslora + ", Año de Fabricación: " + anioFabricacion;
    }

   

    @Override
    public Integer moduloBarco() {
        return super.moduloBarco()+numMastiles; //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
   

   

    
    
    
    

}
