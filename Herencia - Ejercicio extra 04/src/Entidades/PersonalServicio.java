/*
• Sobre el personal de servicio, hay que conocer a qué sección están asignados 
(biblioteca, decanato, secretaría, ...). 
*/
package Entidades;

public class PersonalServicio extends Empleados{

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Integer anioIncorporacion, Integer numeroDespacho, String nombre, String apellido, String estadoCivil, Integer identificación) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, estadoCivil, identificación);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return   "Personal de servicio: " +super.toString() + "Seccion: " + seccion + '}';
    }
    
    

     public PersonalServicio crearPersona() {
        super.crearPersona();
        sector();

        return new PersonalServicio();
    }
    public void sector(){
        
        int opcion = 0;
        do {
            System.out.println("A que sector pertenece el empleado de servicio?");            
            System.out.println("Ingrese la opción-------------------");
            System.out.println("1) Biblioteca)------------------------");
            System.out.println("2) Decanato-------------------------");
            System.out.println("3) Secretaria------------------------");
          
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    setSeccion("Biblioteca");
                    break;
                case 2:
                    setSeccion("Decanato");
                    break;
                case 3:
                    setSeccion("Secretaria");
                    break;
            
                default:
                    System.out.println("Daaaale, sos boludo o sos de Racing??? 1,  2 ó 3. Nada más");
            }
        } while (opcion < 1 || opcion > 6); //que lo siga haciendo mientras le pifie
    }
}
