package Entidades;

/**
 *
 * @author Guillote
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, char consumoEnergetico, Integer peso, Integer precio) {
        super(color, consumoEnergetico, peso, precio);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() +"Lavadora{" + "carga=" + carga + '}';
    }
    
    

    public void crearLavadora() {
        
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora elegida");
        this.carga = leer.nextInt();
    }

    public Integer precioFinal() {
        this.precio = super.precioFinal();

        if (getCarga() > 30) {
            this.precio = getPrecio() + 500;
        }
        return getPrecio();
    }

}
