/*
 Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class Camping extends ExtraHoteleros {
    
    private Integer capacidadMaxCarp;
    private Integer cantBanios;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarp, Integer cantBanios, Boolean restaurante, Boolean privado, Integer metrosOcupa, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosOcupa, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarp = capacidadMaxCarp;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public Integer getCapacidadMaxCarp() {
        return capacidadMaxCarp;
    }

    public void setCapacidadMaxCarp(Integer capacidadMaxCarp) {
        this.capacidadMaxCarp = capacidadMaxCarp;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMetrosOcupa() {
        return metrosOcupa;
    }

    public void setMetrosOcupa(Integer metrosOcupa) {
        this.metrosOcupa = metrosOcupa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        String palabra;
        if (restaurante) {
            palabra="SI";
        } else{
        palabra="NO";
        }
        
        
        
        return "Nombre: "+ nombre+", "+"Tiene Restaurante: " +palabra;
    }
    
    

}
