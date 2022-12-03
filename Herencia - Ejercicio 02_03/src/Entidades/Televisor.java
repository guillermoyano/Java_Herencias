package Entidades;

public class Televisor  extends Electrodomestico {

    private int pulgadas;
    boolean sintonizador = false;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, String color, char consumoEnergetico, Integer peso, Integer precio) {
        super(color, consumoEnergetico, peso, precio);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
    public void crearTelevisor(){
        String tiene;
        crearElectrodomestico();
        System.out.println("Cuántas pulgadas tiene?");
        this.pulgadas = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? [Si  -  NO]");
        tiene = leer.next();
        
        if (tiene.equalsIgnoreCase("Si")){
            this.sintonizador=true;
        }
    }
    
    public Integer precioFinal() {
        this.precio = super.precioFinal();

        if (getPulgadas() > 40) {
            this.precio =(int) (getPrecio() * 1.3);
        }
        
        if (sintonizador){
            this.precio = getPrecio() + 500;
        }
        return getPrecio();
    }
    
}
