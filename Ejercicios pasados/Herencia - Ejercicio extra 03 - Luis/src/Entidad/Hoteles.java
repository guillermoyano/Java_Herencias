/*
 Cantidad de Habitaciones, Número de Camas, Cantidad de
 Pisos, Precio de Habitaciones.
 */

package Entidad;

/**
 *
 * @author pittu
 */


public class Hoteles extends Alojamientos{
    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer numeroPisos;
    protected Integer precioHabitaciones;

    public Hoteles() {
    }

    

    public Hoteles(Integer cantidadHabitaciones, Integer numeroCamas, Integer numeroPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.numeroPisos = numeroPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }
    
    public Integer PrecioHabitacion(){
        precioHabitaciones=+numeroCamas;
        return precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", numeroPisos=" + numeroPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
    
    

}
