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

public class Polideportivo extends Edificio{
    
    private String nombre;
    private Boolean techo;

    public Polideportivo() {
    }

       

    public Polideportivo(String nombre, Boolean techo, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTecho() {
        return techo;
    }

    public void setTecho(Boolean techo) {
        this.techo = techo;
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
        return "Polideportivo{" + "nombre=" + nombre + ", techo=" + techo + '}';
    }

    @Override
    public int calcularSuperficie() {
        Integer superficie=largo*ancho;
       return superficie;
    }

    @Override
    public int calcularVolumen() {
        Integer volumen=largo*ancho*alto;
        return volumen;
    }
    
   

    
    
    

}
