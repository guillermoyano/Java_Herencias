package Entidades;

public class Hoteles extends Alojamiento {
    
    private Integer cantCama, cantPisos, precioHab;

    public Hoteles(Integer cantCama, Integer cantPisos, Integer precioHab, String nombre, String localidad, String gerente, String direccion) {
        super(nombre, localidad, gerente, direccion);
        this.cantCama = cantCama;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public Integer getCantCama() {
        return cantCama;
    }

    public void setCantCama(Integer cantCama) {
        this.cantCama = cantCama;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Integer getPrecioHab() {
        return precioHab;
    }

    public Integer setPrecioHab(Integer precioHab) {
        return this.precioHab = precioHab;
    }
    
    public Integer valorHab(){
        return this.precioHab = 50 + (getCantPisos() * getPrecioHab() * getCantCama());
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantCama=" + cantCama + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + '}';
    }

    
    

}
