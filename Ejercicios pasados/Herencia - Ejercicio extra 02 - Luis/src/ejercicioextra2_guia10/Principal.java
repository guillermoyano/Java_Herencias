package ejercicioextra2_guia10;

//@author pittu
import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Servicio.ServicioEdificio;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioEdificio accion = new ServicioEdificio();
        ArrayList<Edificio> edificios = new ArrayList();

        int opcion;
        do {
            System.out.println("----------------------");
            System.out.println("\tMenu ");
            System.out.println("----------------------");
            System.out.println("1 - Crear edificio");
            System.out.println("2 - Mostrar Info de Polideportivos");
            System.out.println("3 - Mostrar Info de Edificios de Oficina");
            System.out.println("4 - Mostrar superficie y volumen de cada edificio");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int opcion2;
                    do {
                        System.out.println("---------------------------------");
                        System.out.println("¿Qué tipo de edificio va a crear?");
                        System.out.println("---------------------------------");
                        System.out.println("1 - Edificio de Oficinas");
                        System.out.println("2 - Polideportivo");
                        System.out.println("3 - No crear más edificios (SALIR)");
                        System.out.println("Elija su opcion:");
                        opcion2 = leer.nextInt();

                        switch (opcion2) {
                            case 1:
                                edificios.add(accion.crearEdificio());
                                break;
                            case 2:
                                edificios.add(accion.crearPolideportivo());
                                break;
                            case 3:

                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                                break;
                        }
                    } while (!(opcion2 == 3));

                    break;
                case 2:
                    int contTechado = 0,
                     contNoTechado = 0;
                    for (Edificio aux : edificios) {
                        if (aux instanceof Polideportivo) {
                            if (((Polideportivo) aux).getTecho()) {
                                contTechado++;
                            } else {
                                contNoTechado++;
                            }

                        }

                    }
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Hay " + contTechado + " polideportivo(s) techado(s) y " + contNoTechado + " sin techo");

                    break;
                case 3:
                    int i = 0;
                    for (Edificio aux : edificios) {

                        if (aux instanceof EdificioDeOficinas) {
                            System.out.println("---------------------------------------------");
                            System.out.print("EDIFICIO [" + (i + 1) + "]: ");
                            ((EdificioDeOficinas) aux).cantPersonas();

                        }
                        i++;
                    }

                    break;
                case 4:
                    int j = 0;
                    Integer superficie=0, volumen=0; 
                    for (Edificio aux : edificios) {
                        if (aux instanceof EdificioDeOficinas) {
                            superficie=aux.calcularSuperficie();
                            volumen=aux.calcularVolumen();
                         System.out.println("---------------------------------------------");
                            System.out.print("EDIFICIO [" + (j + 1) + "]: ");
                            System.out.println("Superficie: "+superficie +"m2 / Volumen: "+volumen+"m3");

                        } else if (aux instanceof Polideportivo) {
                            superficie=aux.calcularSuperficie();
                            volumen=aux.calcularVolumen();
                         System.out.println("---------------------------------------------");
                            System.out.print("POLIDEPORTIVO [" + ((Polideportivo) aux).getNombre() + "]: ");
                            System.out.println("Superficie: "+superficie +"m2 / Volumen: "+volumen+"m3");

                        }
                        j++;

                    }

                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }

}
