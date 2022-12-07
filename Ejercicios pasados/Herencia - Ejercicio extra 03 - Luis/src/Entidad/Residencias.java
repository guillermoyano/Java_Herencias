/*
 Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class Residencias extends ExtraHoteleros{
    private Integer cantHabitaciones;
    private Boolean descuento;
    private Boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantHabitaciones, Boolean descuento, Boolean campoDeportivo, Boolean privado, Integer metrosOcupa, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosOcupa, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        if (descuento) {
            palabra="SI";
        } else{
        palabra="NO";
        }
        return "Nombre: "+ nombre+", "+"Tiene descuento para gremios: " +palabra;
    }
    
    

}
