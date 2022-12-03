package Entidades;

/**
 * el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
 * la posición del amarre y el barco que lo ocupará.
 *
 * @author Usuario
 */
public class Alquiler {

    protected String nombre, dni, posicionAmarre;
    protected Integer diasAlquiler, precioAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, String posicionAmarre, Integer diasAlquiler, Integer precioAlquiler) {
        this.nombre = nombre;
        this.dni = dni;
        this.posicionAmarre = posicionAmarre;
        this.diasAlquiler = diasAlquiler;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Integer getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(Integer diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public Integer getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Integer precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "{" + ", Dueño: " + nombre + ", DNI:" + dni + ", posicion del Amarre: " + posicionAmarre + ", dias de Alquiler: " + diasAlquiler + ", precio del Alquiler: " + precioAlquiler + '}';
    }

}
