package Entidades;

public class ExtraHoteleros  extends Alojamiento{

    private boolean privado;
    private Integer metros2;

    public ExtraHoteleros(boolean privado, Integer metros2, String nombre, String localidad, String gerente, String direccion) {
        super(nombre, localidad, gerente, direccion);
        this.privado = privado;
        this.metros2 = metros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros2() {
        return metros2;
    }

    public void setMetros2(Integer metros2) {
        this.metros2 = metros2;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros{" + "privado=" + privado + ", metros2=" + metros2 + '}';
    }
    
  

    

    

}
