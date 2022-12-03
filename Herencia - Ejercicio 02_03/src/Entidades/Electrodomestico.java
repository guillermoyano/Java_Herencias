package Entidades;

import java.util.Scanner;

public class Electrodomestico {
    
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso, precio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, Integer peso, Integer precio) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", precio=" + precio + '}';
    }
    
    

    
    
    public void comprobarConsumoEnergetico(char letra){
        
        System.out.println("Ingrese de su electrodoméstico, la letra que indica el consumo energético");
        letra = leer.next().toUpperCase().charAt(0);
        
        if (letra =='A' || letra =='B' || letra =='C' || letra =='D' || letra =='E' || letra =='F' ){
            this.consumoEnergetico = letra;
        }else{
            this.consumoEnergetico = 'F';
        }
    }
    
    public void comprobarColor(String color){
        System.out.println("De qué color es tu electrodoméstico?");
        System.out.println("Blanco? Negro? Rojo? Azul? Gris?");
        color = leer.next();
        
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")){
            this.color = color;
        }else{
            this.color = "Blanco";
        }
    }
    
    public void crearElectrodomestico(){
        
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        System.out.println("Ingrese también cuánto pesa el electrodoméstico");
        this.peso=leer.nextInt();
        this.precio=1000;
        
    }
    
    public Integer precioFinal(){
        
        if (getConsumoEnergetico()=='A'){
            this.precio = getPrecio() + 1000;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
        
         if (getConsumoEnergetico()=='B'){
            this.precio = getPrecio() + 800;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
         
          if (getConsumoEnergetico()=='C'){
            this.precio = getPrecio() + 600;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
          
           if (getConsumoEnergetico()=='D'){
            this.precio = getPrecio() + 500;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
           
            if (getConsumoEnergetico()=='E'){
            this.precio = getPrecio() + 300;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
            
             if (getConsumoEnergetico()=='F'){
            this.precio = getPrecio() + 100;
            if (getPeso()>=1 && getPeso()<=19){
                this.precio = getPrecio() + 100;
            }
             if (getPeso()>=20 && getPeso()<=49){
                this.precio = getPrecio() + 500;
            }
              if (getPeso()>=50 && getPeso()<=79){
                this.precio = getPrecio() + 800;
            }
              if (getPeso()>=80){
                this.precio = getPrecio() + 1000;
            }
        }
             return getPrecio();
             
    }
    

}
