package Entidades;

public class Residencia extends ExtraHoteleros {

    private Integer cantHab;
    private boolean descuento, campoDeportivo;

    public Residencia(Integer cantHab, boolean descuento, boolean campoDeportivo, boolean privado, Integer metros2, String nombre, String localidad, String gerente, String direccion) {
        super(privado, metros2, nombre, localidad, gerente, direccion);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
