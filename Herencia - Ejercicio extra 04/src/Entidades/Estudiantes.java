/*
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están 
matriculados. 
 */
package Entidades;

public class Estudiantes extends Facultad {

    private String curso;
    Estudiantes e;
    Facultad f2;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellido, String estadoCivil, Integer identificación) {
        super(nombre, apellido, estadoCivil, identificación);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "Estudiantes " + super.toString() + "curso=" + curso ;
    }
    
    

    public Estudiantes crearPersona() {
        super.crearPersona();
        matriculacion();

        return new Estudiantes();

    }

    public void matriculacion() {

        System.out.println("Hola! " + getNombre());
        System.out.println("En qué materia te vas a anotar?");

        int opcion = 0;
        do {
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
                    setCurso("Matemática");
                    break;
                case 2:
                    setCurso("Química");
                    break;
                case 3:
                    setCurso("Física");
                    break;
                case 4:
                    setCurso("Biología");
                    break;
                case 5:
                    setCurso("Pensamiento Científico");
                    break;
                case 6:
                    setCurso("Sociedad y Estado");
                    break;
                default:
                    System.out.println("Daaaale, sos boludo o sos de Racing??? 1, 2, 3, 4, 5 ó 6. Nada más");
            }
        } while (opcion < 1 || opcion > 6); //que lo siga haciendo mientras le pifie

    }

}
