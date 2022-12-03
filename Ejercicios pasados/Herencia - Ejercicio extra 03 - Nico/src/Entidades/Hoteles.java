/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public class Hoteles extends Alojamiento  {

    protected Integer cantCamas, CantPisos, precioHab;

    public Hoteles(Integer cantCamas, Integer CantPisos, Integer precioHab, String nombre, String localidad, String gerente, String direccion) {
        super(nombre, localidad, gerente, direccion);
        this.cantCamas = cantCamas;
        this.CantPisos = CantPisos;
        this.precioHab = precioHab;
    }

    public Integer getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(Integer cantCamas) {
        this.cantCamas = cantCamas;
    }

    public Integer getCantPisos() {
        return CantPisos;
    }

    public void setCantPisos(Integer CantPisos) {
        this.CantPisos = CantPisos;
    }

    public Integer getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Integer precioHab) {
        this.precioHab = precioHab;
    }

    public Integer valorHab() {
        return this.precioHab = 50 + (getCantPisos() * getPrecioHab() * getCantCamas());
    }

   
    
    @Override
    public String toString() {
        return super.toString() + "Hoteles{" + "cantCamas=" + cantCamas + ", CantPisos=" + CantPisos + ", precioHab=" + precioHab + '}';
    }

}
