/*
. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler
*/
package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Amarre {
    
    private String nombre;
    private Integer documento;
    private Date fechaAlquiler;
    private Date fechaDevolcion;
    private Integer posicionAmarre;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Amarre() {
    }

    public Amarre(String nombre, Integer documento, Date fechaAlquiler, Date fechaDevolcion, Integer posicionAmarre) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolcion = fechaDevolcion;
        this.posicionAmarre = posicionAmarre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolcion() {
        return fechaDevolcion;
    }

    public void setFechaDevolcion(Date fechaDevolcion) {
        this.fechaDevolcion = fechaDevolcion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    @Override
    public String toString() {
        return "Amarre {" + "nombre=" + nombre + ", documento=" + documento + ", fecha de alquiler=" + fechaAlquiler + ", fecha de devolcion=" + fechaDevolcion + ", posicion del barco en amarre=" + posicionAmarre + '}';
    }
    
//    public int dias(){
//        int dia, mes, anio, cantDias;
//        
//        System.out.println("Ingrese la fecha en que quiere retirar el barco (año/mes/dia)");
//        anio= leer.nextInt();
//        mes= leer.nextInt();
//        dia= leer.nextInt();
//        
//        Date fecha = new Date (anio-1900, mes-1, dia);
//        setFechaAlquiler(fecha);
//        
//        System.out.println("Cuando lo vas a devolver (año/mes/dia)");
//        anio= leer.nextInt();
//        mes= leer.nextInt();
//        dia= leer.nextInt();
//        Date fecha1 = new Date (anio-1900, mes-1, dia);
//        setFechaDevolcion(fecha1);
//        
//        cantDias = (int) (((((getFechaDevolcion().getTime() - getFechaAlquiler().getTime()) / 1000)/60)/60)/24);
//        
//        return cantDias;
//    }

     public int dias() throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la fecha de inicio 'MM-dd-yyyy'");
        String d1 = leer.next();
        System.out.println("Ingrese la fecha de entrega 'MM-dd-yyyy'");
        String d2 = leer.next();
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        fechaAlquiler=sdf.parse(d1);
        fechaDevolcion=sdf.parse(d2);
        
        long diferenciaMiliSe=fechaDevolcion.getTime()-fechaAlquiler.getTime();
        int horas=(int) (diferenciaMiliSe/3600000);
        int dias=0;
        if (horas>24) {
            dias=horas/24;
        } else{
         dias=1;   
        }
        System.out.println("Los días de alquiler son ["+dias+"]");
        return dias;
     }
}
