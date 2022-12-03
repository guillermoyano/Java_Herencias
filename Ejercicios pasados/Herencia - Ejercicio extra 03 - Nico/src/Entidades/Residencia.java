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
public final class Residencia extends ExtraHoteleros {
    private Integer cantHab;
    private boolean descuento,campoDepo;

    public Residencia(Integer cantHab, boolean descuento, boolean campoDepo, boolean privado, Integer mtos4, String nombre, String localidad, String gerente, String direccion) {
        super(privado, mtos4, nombre, localidad, gerente, direccion);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDepo = campoDepo;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDepo() {
        return campoDepo;
    }

    public void setCampoDepo(boolean campoDepo) {
        this.campoDepo = campoDepo;
    }

    @Override
    public String toString() {
        return super.toString()+"Residencia{" + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDepo=" + campoDepo + '}';
    }
    
}
