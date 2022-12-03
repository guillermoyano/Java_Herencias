/*

 */
package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer precio, peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso, String color) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
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

    @Override
    public String toString() {
        return "Electrodomestico{" + " Precio: " + precio + ", Peso: " + peso + ", Color: " + color + ", ConsumoEnergetico: " + consumoEnergetico + '}';
    }

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public char comprobarConsumoEnergetico(char letra) {
        char letra1;
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F' || letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f') {
            letra1 = letra;
            System.out.println("La letra va a ser " + letra);
        } else {
            letra1 = 'F';
            System.out.println("La letra estaba mal te clavamos una F");
        }
        return letra1;
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String colorParametro) {
        String color1 = "";
        if (colorParametro.equalsIgnoreCase("Blanco") || colorParametro.equalsIgnoreCase("negro") || colorParametro.equalsIgnoreCase("rojo") || colorParametro.equalsIgnoreCase("azul") || colorParametro.equalsIgnoreCase("gris")) {
            color1 = colorParametro;
            System.out.println("El color coincidio y es " + colorParametro);
        } else {
            color1="Blanco";
            System.out.println("Mandaste fruta, te queda Blanco");
        }

        return color1;
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e1 = new Electrodomestico();
        System.out.println("Ingrese el color del electrodomestico que desea: ");
//        e1.setColor(leer.next());
        e1.setColor(comprobarColor(leer.next()));
        e1.setPrecio(1000);
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        e1.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        System.out.println("Ingrese el peso del electrodomestico ");
        e1.setPeso(leer.nextInt());
        e1.setPrecio(precioFinal(e1));
        return e1;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public Integer precioFinal(Electrodomestico e1) {
        Integer precio1;
        switch (e1.getConsumoEnergetico()) {
            case 'A':
            case 'a':
                precio1 = (e1.getPrecio() + 1000);
                break;
            case 'B':
            case 'b':
                precio1 = (e1.getPrecio() + 800);
                break;
            case 'C':
            case 'c':
                precio1 = (e1.getPrecio() + 600);
                break;
            case 'D':
            case 'd':
                precio1 = (e1.getPrecio() + 500);
                break;
            case 'E':
            case 'e':
                precio1 = (e1.getPrecio() + 300);
                break;
            case 'F':
            case 'f':
                precio1 = (e1.getPrecio() + 100);
                break;
            default:
                precio1 = 1000;
                break;
        }
        if (e1.getPeso() > 1 && e1.getPeso() < 19) {
            precio1 = precio1 + 100;
        } else if (e1.getPeso()
                > 20 && e1.getPeso() < 49) {
            precio1 = precio1 + 500;
        } else if (e1.getPeso() > 50 && e1.getPeso() < 79) {
            precio1 = precio1 + 800;
        } else if (e1.getPeso() > 80) {
            precio1 = precio1 + 1000;
        }
        return precio1;
    }
  

}
