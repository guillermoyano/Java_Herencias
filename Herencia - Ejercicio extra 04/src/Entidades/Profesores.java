/*
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
pertenecen (lenguajes, matemáticas, arquitectura, ...). 
 */
package Entidades;

public class Profesores extends Empleados {

    private String departamento;
    Profesores prof;

    public Profesores() {
    }

    public Profesores(String departamento, Integer anioIncorporacion, Integer numeroDespacho, String nombre, String apellido, String estadoCivil, Integer identificación) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, estadoCivil, identificación);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return   "Profesor: " +super.toString() + "Departamento: " + departamento;
    }
    
    

    public Profesores crearPersona() {
        super.crearPersona();
        cambioDepartamento();

        return new Profesores();
    }

    public void cambioDepartamento() {

        System.out.println("Hola Profe " + getApellido());
        System.out.println("");

        int opcion = 0;
        do {
            System.out.println("A que departamento pertenece el profesor?");
            System.out.println("Materias----------------------------");
            System.out.println("Ingrese la opción------------------");
            System.out.println("1) Matemática)--------------------");
            System.out.println("2) Química-------------------------");
            System.out.println("3) Física----------------------------");
            System.out.println("4) Biología-------------------------");
            System.out.println("5) Pensamiento Científico--------");
            System.out.println("6) Sociedad y Estado--------------");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    setDepartamento("Matemática");
                    break;
                case 2:
                    setDepartamento("Química");
                    break;
                case 3:
                    setDepartamento("Física");
                    break;
                case 4:
                    setDepartamento("Biología");
                    break;
                case 5:
                    setDepartamento("Pensamiento Científico");
                    break;
                case 6:
                    setDepartamento("Sociedad y Estado");
                    break;
                default:
                    System.out.println("Daaaale, sos boludo o sos de Racing??? 1, 2, 3, 4, 5 ó 6. Nada más");
            }
        } while (opcion < 1 || opcion > 6); //que lo siga haciendo mientras le pifie
    }
}
