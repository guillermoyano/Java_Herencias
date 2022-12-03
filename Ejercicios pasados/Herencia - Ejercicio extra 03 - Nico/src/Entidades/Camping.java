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
public final  class Camping extends ExtraHoteleros {
    private Integer capMaxCarpas,cantBanios;
    private boolean resto;

    public Camping(Integer capMaxCarpas, Integer cantBanios, boolean resto, boolean privado, Integer mtos4, String nombre, String localidad, String gerente, String direccion) {
        super(privado, mtos4, nombre, localidad, gerente, direccion);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.resto = resto;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return super.toString()+"Camping{" + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", resto=" + resto + '}';
    }
    
}
