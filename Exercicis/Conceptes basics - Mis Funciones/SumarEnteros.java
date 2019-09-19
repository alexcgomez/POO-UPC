import java.util.Scanner;

public class SumarEnteros{
public static void main(String[] args) {
    
    int x,y;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe primer entero");
    x= scanner.nextInt();
    System.out.println("Escribe segundo entero");
    y= scanner.nextInt();
  
    
    System.out.println("La suma es : " + x + " + " + y +  " = " + (x+y));

    

    }
}