/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione 
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres 
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de 
información debe gestionar esta aplicación: 
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
identificación y su estado civil. 
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado. 
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están 
matriculados. 
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
pertenecen (lenguajes, matemáticas, arquitectura, ...). 
• Sobre el personal de servicio, hay que conocer a qué sección están asignados 
(biblioteca, decanato, secretaría, ...). 
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A 
continuación, debe programar las clases definidas en las que, además de los constructores, 
hay que desarrollar los métodos correspondientes a las siguientes operaciones: 
• Cambio del estado civil de una persona. 
• Reasignación de despacho a un empleado. 
• Matriculación de un estudiante en un nuevo curso. 
• Cambio de departamento de un profesor. 
• Traslado de sección de un empleado del personal de servicio. 
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba 
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/
package herencia.ejercicio.extra.pkg04;

import Entidades.Empleados;
import Entidades.Estudiantes;
import Entidades.Facultad;
import Entidades.PersonalServicio;
import Entidades.Profesores;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjercicioExtra04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Facultad> facultitos=new ArrayList();
        
        int opcion;
        do {
            Estudiantes e1= new Estudiantes();
            Profesores p1=new Profesores();
            PersonalServicio ps=new PersonalServicio();
            System.out.println("\tMenu ");
            System.out.println("1 - Opcion Crear Estudiante");
            System.out.println("2 - Opcion Crear Profesor");
            System.out.println("3 - Opcion Crear Personal de Servicio");
            System.out.println("4 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    e1.crearPersona();
                    facultitos.add(e1);
                    break;
                case 2:
                    p1.crearPersona();
                    facultitos.add(p1);
                    break;
                case 3:
                    ps.crearPersona();
                    facultitos.add(ps);
                    break;
                case 4:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 4));
        
        for (Facultad aux : facultitos) {
            System.out.println(aux);
        }
        
    }

}
