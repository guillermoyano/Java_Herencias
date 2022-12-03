/*
 En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package Entidades;


public class ExtraHoteleros extends Alojamiento {
    protected boolean privado;
    protected Integer mtos4;

    public ExtraHoteleros(boolean privado, Integer mtos4, String nombre, String localidad, String gerente, String direccion) {
        super(nombre, localidad, gerente, direccion);
        this.privado = privado;
        this.mtos4 = mtos4;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMtos4() {
        return mtos4;
    }

    public void setMtos4(Integer mtos4) {
        this.mtos4 = mtos4;
    }

    @Override
    public String toString() {
        return super.toString()+"ExtraHoteleros{" + "privado=" + privado + ", mtos4=" + mtos4 + '}';
    }
    
   
}
