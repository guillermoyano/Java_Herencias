package Entidades;

public class Hotel_5 extends Hotel_4{

    private Integer cantSalones, cantSuite, cantLimo;

    public Hotel_5(Integer cantSalones, Integer cantSuite, Integer cantLimo, boolean gimnasio, String nomResto, int capResto, Integer cantCama, Integer cantPisos, Integer precioHab, String nombre, String localidad, String gerente, String direccion) {
        super(gimnasio, nomResto, capResto, cantCama, cantPisos, precioHab, nombre, localidad, gerente, direccion);
        this.cantSalones = cantSalones;
        this.cantSuite = cantSuite;
        this.cantLimo = cantLimo;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuite() {
        return cantSuite;
    }

    public void setCantSuite(Integer cantSuite) {
        this.cantSuite = cantSuite;
    }

    public Integer getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(Integer cantLimo) {
        this.cantLimo = cantLimo;
    }

    public Integer valorHab(){
        Integer precio1 = super.valorHab();
        precio1+=getCantLimo()*15;
        return precio1;
    }
    
    @Override
    public String toString() {
        return "Hotel_5{" + "cantSalones=" + cantSalones + ", cantSuite=" + cantSuite + ", cantLimo=" + cantLimo + '}';
    }
    
    
    
    
    
}
