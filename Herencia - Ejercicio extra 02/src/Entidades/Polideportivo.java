/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
*/
package Entidades;

public  class Polideportivo extends Edificio  {

    private boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(boolean techo, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.techo = techo;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }
    
    @Override
    public int calcularSuperficie(Integer ancho, Integer largo) {
        return getAncho()*getLargo();
    }

    @Override
    public int calcularVolumen(Integer ancho, Integer alto, Integer largo) {
        return ((getAncho()*getLargo())*getAlto());
    }

    @Override
    public String toString() {
        return super.toString() + "Polideportivo{" + "techo=" + techo + '}';
    }

    
}
