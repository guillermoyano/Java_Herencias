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
public final class Hotel5 extends Hotel4 {
    private Integer cantSalones,cantSuits,cantLimo;

    public Hotel5(Integer cantSalones, Integer cantSuits, Integer cantLimo, boolean gimnasio, String nomResto, int capResto, Integer cantCamas, Integer CantPisos, Integer precioHab, String nombre, String localidad, String gerente, String direccion) {
        super(gimnasio, nomResto, capResto, cantCamas, CantPisos, precioHab, nombre, localidad, gerente, direccion);
        this.cantSalones = cantSalones;
        this.cantSuits = cantSuits;
        this.cantLimo = cantLimo;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuits() {
        return cantSuits;
    }

    public void setCantSuits(Integer cantSuits) {
        this.cantSuits = cantSuits;
    }

    public Integer getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(Integer cantLimo) {
        this.cantLimo = cantLimo;
    }
    public Integer valorHab() {
        Integer precio1=super.valorHab();
        return precio1+=getCantLimo()*15;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel5{" + "cantSalones=" + cantSalones + ", cantSuits=" + cantSuits + ", cantLimo=" + cantLimo + '}';
    }
    
}
