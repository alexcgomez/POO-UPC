import java.util.Scanner;

/**
 * Division
 */
public class Division {

    public static void main(String[] args) {
        
        float x,y,resultado=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir dividendo");
        x= scanner.nextFloat();
        System.out.println("Introducir divisor");
        y= scanner.nextFloat();

        if (x == 0 || y == 0){ 
            resultado=0;
            System.out.println("¡Division por 0!");
        }

        else {
            resultado=x/y;
            System.out.println("El resultado es: "+resultado);
        }

     
    }
}