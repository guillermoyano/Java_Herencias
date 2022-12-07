/*
 Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class ExtraHoteleros extends Alojamientos{
    protected Boolean privado;
    protected Integer metrosOcupa;

    public ExtraHoteleros() {
    }
    
    public ExtraHoteleros(Boolean privado, Integer metrosOcupa, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosOcupa = metrosOcupa;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public Integer getMetrosOcupa() {
        return metrosOcupa;
    }
    
    

}
