/*
 Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class HotelCinco extends HotelCuatro {
    private Integer CantSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public HotelCinco(Integer CantSalonesConf, Integer cantSuites, Integer cantLimosinas, String Gimnasio, String nombreRest, Integer CapacidadRest, Integer cantidadHabitaciones, Integer numeroCamas, Integer numeroPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(Gimnasio, nombreRest, CapacidadRest, cantidadHabitaciones, numeroCamas, numeroPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.CantSalonesConf = CantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConf() {
        return CantSalonesConf;
    }

    public void setCantSalonesConf(Integer CantSalonesConf) {
        this.CantSalonesConf = CantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String Gimnasio) {
        this.gimnasio = Gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public Integer getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(Integer CapacidadRest) {
        this.capacidadRest = CapacidadRest;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
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
    public Integer PrecioHabitacion() {
        super.PrecioHabitacion(); 
        precioHabitaciones+=(cantLimosinas*15);
        
        
        return precioHabitaciones;
    }

    @Override
    public String toString() {
       return "Nombre: "+ nombre+", "+"Precio de la habitacion: " + precioHabitaciones;
    }

    
    
    
    
    

}
