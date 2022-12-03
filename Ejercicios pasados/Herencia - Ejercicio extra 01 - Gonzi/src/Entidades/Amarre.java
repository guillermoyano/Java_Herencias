package Entidades;

import java.util.Scanner;

/**
 * su matrícula, su eslora en metros y año de fabricación.
 *
 * @author Usuario
 */
public abstract class Amarre {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer matricula, anioFabricacion;
    protected Integer eslora;
    public Alquiler al = new Alquiler();

    public Amarre() {

    }

    public Amarre(Integer matricula, Integer anioFabricacion, Integer eslora) {
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Amarre{" + ", matricula: " + matricula + ", año de Fabricacion: " + anioFabricacion + ", eslora: " + eslora + ", " + al.toString() + '}';
    }

    public void generarBarco() {

        generarCliente();

        System.out.println("Ingrese Matricula del Barco");
        matricula = leer.nextInt();

        System.out.println("Ingrese el año de Fabricacion");
        anioFabricacion = leer.nextInt();

        System.out.println("Ingrese la Eslora del Barco");
        eslora = leer.nextInt();
    }

    public int calcularAlquiler() {
        return (al.getDiasAlquiler() * (eslora * 10));
    }

    public void generarCliente() {
        System.out.println("Ingrese el nombre del Dueño: ");
        al.setNombre(leer.next());

        System.out.println("Ingrese Dni");
        al.setDni(leer.next());

        System.out.println("Ingrese La posicion del Amarre");
        al.setPosicionAmarre(leer.next());

        System.out.println("Ingrese los dias que va a alquilar");
        al.setDiasAlquiler(leer.nextInt());

    }
}
