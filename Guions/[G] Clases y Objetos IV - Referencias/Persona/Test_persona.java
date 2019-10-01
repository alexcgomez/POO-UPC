import java.util.Scanner;

/**
 * Test_persona
 */
public class Test_persona {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Persona persona1;
        int dni = 47596227, edad = 19;
        String nombre = "Perico";
        Data Fecha_nac = new Data(20, 10, 2000);
        

        persona1 = new Persona(dni,nombre,edad,Fecha_nac);
 

    
        System.out.println("DATOS DE LA PERSONA");
        System.out.println("--------------------");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("DNI: " + persona1.getDni());
        //System.out.println("Fecha de nacimiento: " + persona1.getData_neix());
        System.out.println("Edad: " + persona1.getEdad());


        scan.close();
    }
}