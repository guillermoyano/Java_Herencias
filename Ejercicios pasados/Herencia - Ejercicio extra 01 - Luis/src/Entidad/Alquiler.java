/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Alquiler {

    private Cliente cliente;
    private Date fechaAlquiler;
    private Date fechaEntrega;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Date fechaAlquiler, Date fechaEntrega, Integer posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaEntrega = fechaEntrega;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Integer calcularDias() throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la fecha de inicio 'MM-dd-yyyy'");
        String d1 = leer.next();
        System.out.println("Ingrese la fecha de entrega 'MM-dd-yyyy'");
        String d2 = leer.next();
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        fechaAlquiler=sdf.parse(d1);
        fechaEntrega=sdf.parse(d2);
        
        long diferenciaMiliSe=fechaEntrega.getTime()-fechaAlquiler.getTime();
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
