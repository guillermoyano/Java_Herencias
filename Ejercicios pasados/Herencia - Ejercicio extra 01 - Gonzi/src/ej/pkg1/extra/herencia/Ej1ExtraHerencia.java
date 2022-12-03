package ej.pkg1.extra.herencia;

import Entidades.Amarre;
import Entidades.Barco;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;

public class Ej1ExtraHerencia {

    public static void main(String[] args) {

        ArrayList<Amarre> alquilerBotes = new ArrayList();
        Amarre barco1 = new Yate();
        Amarre barco2 = new Velero();
        Amarre barco3 = new Barco();

        barco1.generarBarco();
        barco1.al.setPrecioAlquiler(barco1.calcularAlquiler());
        alquilerBotes.add(barco1);

        barco2.generarBarco();
        barco2.al.setPrecioAlquiler(barco2.calcularAlquiler());
        alquilerBotes.add(barco2);

        barco3.generarBarco();
        barco3.al.setPrecioAlquiler(barco3.calcularAlquiler());
        alquilerBotes.add(barco3);

        alquilerBotes.forEach((aux) -> {
            if (aux instanceof Yate) {
                System.out.println("El Yate de " + ((Yate) aux).al.getNombre()
                        + " Que tiene una potencia de Motor de "
                        + ((Yate) aux).getPotenciaMotor() + " Y "
                        + ((Yate) aux).getNumCamarotes() + " Camarotes, "
                        + " Y se va a amarrar en el puerto durante "
                        + ((Yate) aux).al.getDiasAlquiler() + " Dias, "
                        + " Tiene un precio de Alquiler de: "
                        + ((Yate) aux).al.getPrecioAlquiler());
            } else if (aux instanceof Velero) {
                System.out.println("El Velero de " + ((Velero) aux).al.getNombre()
                        + " Que tiene " + ((Velero) aux).getNumMastiles()
                        + " Mastiles, Y se va a amarrar en el puerto durante "
                        + ((Velero) aux).al.getDiasAlquiler() + " Dias, "
                        + " Tiene un precio de Alquiler de: "
                        + ((Velero) aux).al.getPrecioAlquiler());
            } else if (aux instanceof Barco) {
                System.out.println("El Barco de " + ((Barco) aux).al.getNombre()
                        + " Que tiene una potencia de Motor de "
                        + ((Barco) aux).getPotenciaMotor()
                        + " Y se va a amarrar en el puerto durante "
                        + ((Barco) aux).al.getDiasAlquiler() + " Dias, "
                        + " Tiene un precio de Alquiler de: "
                        + ((Barco) aux).al.getPrecioAlquiler());
            }
        });
    }

}
