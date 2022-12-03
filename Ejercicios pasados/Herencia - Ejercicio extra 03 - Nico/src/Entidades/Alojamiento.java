/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
 */
package Entidades;

public abstract class Alojamiento  {

    protected String nombre, localidad, gerente, direccion;

    public Alojamiento(String nombre, String localidad, String gerente, String direccion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.gerente = gerente;
        this.direccion = direccion;
    }

    public Alojamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", localidad=" + localidad + ", gerente=" + gerente + ", direccion=" + direccion + '}';
    }

}
