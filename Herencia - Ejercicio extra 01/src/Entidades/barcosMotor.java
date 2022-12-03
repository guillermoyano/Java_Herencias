/*
. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler
*/
package Entidades;

public class barcosMotor extends Barco {

    protected Integer cv;

    public barcosMotor() {
    }

    public barcosMotor(Integer cv, Integer matricula, Integer eslora, Integer anñoFabricacion) {
        super(matricula, eslora, anñoFabricacion);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return super.toString() + " Barco con Motor {" + "Su potencia: " + cv + '}';
    }

    @Override
    public int modulo() {
        
        if(cv >= 200){
            return super.modulo() + 5000;
        }
        
        if(cv >= 250){
            return super.modulo() + 10000;
        }
        
        if(cv >= 300){
            return super.modulo() + 15000;
        }
        
        if(cv >= 350){
            return super.modulo() + 20000;
        }
        
        return super.modulo() + 1000;
    }

   
    
    
    
}
