/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.util.Scanner;

/**
 *
 * @author pittu
 */

public class Cliente {
    private String nombre;
    private Integer dni;

    public Cliente() {
    }

    public Cliente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    
    public void crearCliente(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su DNI");
        dni=leer.nextInt();
        
    
    
    
    }

}
