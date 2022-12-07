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

public class EdificioDeOficinas extends Edificio{
    private Integer numOficinas;
    private Integer cantidadPersonas;
    private Integer numPisos;

           

    public EdificioDeOficinas(Integer numOficinas, Integer cantidadPersonas, Integer numPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas() {
    }

   
    

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantidadPersonas=" + cantidadPersonas + ", numPisos=" + numPisos + '}';
    }

    @Override
    public int calcularSuperficie() {
        Integer superficie=largo*ancho*numOficinas*numPisos;
       return superficie;
    }

    @Override
    public int calcularVolumen() {
        Integer volumen=largo*ancho*alto*numOficinas*numPisos;
        return volumen;
    }
    
    public void cantPersonas(){
    int totalPorEdificio=cantidadPersonas*numOficinas*numPisos;
    int totalPorPiso=cantidadPersonas*numOficinas;
        System.out.println("Pueden trabajar "+ totalPorPiso+" personas por piso y "+ totalPorEdificio+" personas en total");
        
    
    }
    
    
    

}
