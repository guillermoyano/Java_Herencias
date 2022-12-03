package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Animal {

    protected String nombre;
    protected int edad;
    protected String raza;
    protected String alimento;

    public Animal() {
    }

    public Animal(String nombre, int edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", alimento=" + alimento + '}';
    }
    
public void Alimentarse(){
    System.out.println("Este animal se alimenta de: "+alimento);
}
}
