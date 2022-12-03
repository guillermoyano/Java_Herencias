package Entidades;

public class Alojamiento {

    protected String nombre, localidad, gerente, direccion;

    public Alojamiento(String nombre, String localidad, String gerente, String direccion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.gerente = gerente;
        this.direccion = direccion;
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
