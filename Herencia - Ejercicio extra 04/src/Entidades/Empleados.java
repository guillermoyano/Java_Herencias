/*
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado. 
*/
package Entidades;

public class Empleados extends Facultad{
    
    protected Integer anioIncorporacion, numeroDespacho;
    Empleados em;
    Facultad f3;

    public Empleados() {
    }

    public Empleados(Integer anioIncorporacion, Integer numeroDespacho, String nombre, String apellido, String estadoCivil, Integer identificación) {
        super(nombre, apellido, estadoCivil, identificación);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return  super.toString()  + "Año de incorporacion: " + anioIncorporacion + ", Numero de despacho=" + numeroDespacho;
    }
    
    
    
    public Empleados crearPersona(){
        super.crearPersona();
        System.out.println("Ingrese su año de incorporación a la Facultad");
        setAnioIncorporacion(leer.nextInt());
         System.out.println("Ahora ingrese su número de despacho");
         setNumeroDespacho(leer.nextInt());
         
         return new Empleados();
    }

}
