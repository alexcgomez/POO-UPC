import java.util.Scanner;

public class Max2{
public static void main(String[] args) {
    
    int x,y,Max2=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe primer entero");
    x= scanner.nextInt();
    System.out.println("Escribe segundo entero");
    y= scanner.nextInt();
    
    if (x>y) Max2=x;
    else if(y>x)Max2=y;

    System.out.println("El numero mas grande de los dos es " + Max2);
    
    

    

    }
}