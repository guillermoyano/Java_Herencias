/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public final class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, Integer precio, Integer peso, String color) {
        super(precio, peso, color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public Televisor crearTelevisor() {
        Televisor t1 = new Televisor();
        Electrodomestico e1 = new Electrodomestico();
        System.out.println("Vamos a cargar un televisor");

        System.out.println("Cuales son las pulgadas del televisor");
        t1.setResolucion(leer.nextInt());
        setResolucion(t1.getResolucion());
        System.out.println("Tiene sintonizador?(si/no)");
        String opc = leer.next();

        if (opc.equalsIgnoreCase("si")) {
            t1.setSintonizador(true);
            setSintonizador(true);
        } else {
            t1.setSintonizador(false);
            setSintonizador(false);
        }

        e1 = crearElectrodomestico();
        t1.setColor(e1.getColor());
        t1.setConsumoEnergetico(e1.getConsumoEnergetico());
        t1.setPeso(e1.getPeso());
        t1.setPrecio(e1.getPrecio());
        return t1;
    }

    @Override
    public Integer precioFinal(Electrodomestico e1) {
        Integer precio1=super.precioFinal(e1);
//        switch (e1.getConsumoEnergetico()) {
//            case 'A':
//            case 'a':
//                precio1 = (e1.getPrecio() + 1000);
//                break;
//            case 'B':
//            case 'b':
//                precio1 = (e1.getPrecio() + 800);
//                break;
//            case 'C':
//            case 'c':
//                precio1 = (e1.getPrecio() + 600);
//                break;
//            case 'D':
//            case 'd':
//                precio1 = (e1.getPrecio() + 500);
//                break;
//            case 'E':
//            case 'e':
//                precio1 = (e1.getPrecio() + 300);
//                break;
//            case 'F':
//            case 'f':
//                precio1 = (e1.getPrecio() + 100);
//                break;
//            default:
//                precio1 = 1000;
//                break;
//        }
//        if (e1.getPeso() > 1 && e1.getPeso() < 19) {
//            precio1 = precio1 + 100;
//        } else if (e1.getPeso()
//                > 20 && e1.getPeso() < 49) {
//            precio1 = precio1 + 500;
//        } else if (e1.getPeso() > 50 && e1.getPeso() < 79) {
//            precio1 = precio1 + 800;
//        } else if (e1.getPeso() > 80) {
//            precio1 = precio1 + 1000;
//        }
        
        if (sintonizador) {
            precio1 = precio1 + 500;
        }
        if (getResolucion() > 40) {
            precio1 = (int) (precio1 * 0.3) + precio1;
        }
        return precio1;

    }

    @Override
    public String toString() {
//        return "Televisor{" + " Precio: " + precio + ", Peso: " + peso + ", Color: " + color + ", ConsumoEnergetico: " + consumoEnergetico + " Sintonizador: " + sintonizador +" Pulgadas: "+getResolucion()+ '}';
        return "Televisor"+super.toString() + " Sintonizador: " + sintonizador + " Pulgadas: " + getResolucion();
    }
}
