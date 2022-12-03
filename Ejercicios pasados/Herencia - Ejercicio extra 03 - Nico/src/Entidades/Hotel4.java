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
public class Hotel4 extends Hoteles {

    protected boolean gimnasio;
    protected String nomResto;
    protected int capResto;

    public Hotel4(boolean gimnasio, String nomResto, int capResto, Integer cantCamas, Integer CantPisos, Integer precioHab, String nombre, String localidad, String gerente, String direccion) {
        super(cantCamas, CantPisos, precioHab, nombre, localidad, gerente, direccion);
        this.gimnasio = gimnasio;
        this.nomResto = nomResto;
        this.capResto = capResto;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNomResto() {
        return nomResto;
    }

    public void setNomResto(String nomResto) {
        this.nomResto = nomResto;
    }

    public int getCapResto() {
        return capResto;
    }

    public void setCapResto(int capResto) {
        this.capResto = capResto;
    }

    public Integer valorHab() {
        Integer precio1 = super.valorHab();
        if (this.capResto < 30) {
            precio1 += 10;
        }
        if (this.capResto > 30 && this.capResto < 50) {
            precio1 += 30;
        }
        if (this.capResto > 50) {
            precio1 += 50;
        }
        if (gimnasio) {
            precio1 += 50;
        }
        if (gimnasio = false) {
            precio1 += 30;
        }
        return precio1;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4****{" + "gimnasio=" + gimnasio + ", nomResto=" + nomResto + ", capResto=" + capResto + '}';
    }

}
