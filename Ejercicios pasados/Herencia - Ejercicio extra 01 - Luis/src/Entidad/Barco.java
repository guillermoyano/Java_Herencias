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

public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

   
    
    
    
    
    public Integer moduloBarco(){
    Integer modulo=eslora*10;
        return modulo;
    }

    

}
