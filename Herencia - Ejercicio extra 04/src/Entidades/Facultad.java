/*
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
identificación y su estado civil. 
 */
package Entidades;

import java.util.Scanner;

public class Facultad {

    protected String nombre, apellido, estadoCivil;
    protected Integer identificación;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Facultad f;

    public Facultad() {
    }

    public Facultad(String nombre, String apellido, String estadoCivil, Integer identificación) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.identificación = identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getIdentificación() {
        return identificación;
    }

    public void setIdentificación(Integer identificación) {
        this.identificación = identificación;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Estado Civil: " + estadoCivil + ", Identificación: " + identificación;
    }
    
    

    public void estadoCivil() {
        int opcion = 0;
        do {
            System.out.println("Estado civil?----------------------");
            System.out.println("Ingrese la opción----------------");
            System.out.println("1) Soltero (Muy Feliz)-----------");
            System.out.println("2) Casado (Boludo)--------------");
            System.out.println("3) Divorciado (Feliz)-------------");
            System.out.println("4) Viudo (De fiesta)--------------");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    setEstadoCivil("Soltero");
                    break;
                case 2:
                    setEstadoCivil("Casado");
                    break;
                case 3:
                    setEstadoCivil("Divorciado");
                    break;
                case 4:
                    setEstadoCivil("Viudo");
                    break;
                default:
                    System.out.println("Daaaale, sos boludo o sos de Racing??? 1, 2, 3 ó 4. Nada más");
            }
        } while (opcion < 1 || opcion > 4); //que lo siga haciendo mientras le pifie
    }

    public Facultad crearPersona() {

        System.out.println("Ingrese su nombre");
        setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        setApellido(leer.next());
        System.out.println("Ingrese su DNI");
        setIdentificación(leer.nextInt());
        estadoCivil();
        
        return new Facultad();

    }

    public void cambioEstadoCivil() {

        int opcion = 0;
        String respuesta;
        System.out.println("Su estado civil actual es " + getEstadoCivil());
        System.out.println("Desea cambiar su estado? [Si  /  No]");
        respuesta = leer.next();

        if (respuesta.equalsIgnoreCase("Si")) {
            estadoCivil();
        } else {
            System.out.println("Seguís " + getEstadoCivil());
        }

    }

}
