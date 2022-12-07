/*
 Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class HotelCuatro extends Hoteles{
    protected String gimnasio;
    protected String nombreRest;
    protected Integer capacidadRest;

    public HotelCuatro() {
    }

    public HotelCuatro(String gimnasio, String nombreRest, Integer capacidadRest, Integer cantidadHabitaciones, Integer numeroCamas, Integer numeroPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, numeroPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
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

    public void setCapacidadRest(Integer capacidadRest) {
        this.capacidadRest = capacidadRest;
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
        /*
        Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.*/
        if (capacidadRest<30) {
            precioHabitaciones+=10;
            
        } else if (capacidadRest>=30&&capacidadRest<=50) {
            precioHabitaciones+=30;
        } else{
        
        precioHabitaciones+=50;
        
        }
        /*• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.*/
        if (gimnasio.equalsIgnoreCase("A")) {
            precioHabitaciones+=50;
            
        } else if (gimnasio.equalsIgnoreCase("B")) {
            precioHabitaciones+=30;
        }
        return precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre+", "+"Precio de la habitacion: " + precioHabitaciones;
    }

   
    
    
    
    

    
    
    
    
      
    
    

}
