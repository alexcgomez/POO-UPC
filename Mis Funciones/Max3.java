import java.util.Scanner;

public class Max3{
public static void main(String[] args) {
    
    int[] x = {0, 0, 0};
    int Max3 = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe primer entero");
    x[1]= scanner.nextInt();
    System.out.println("Escribe segundo entero");
    x[2]= scanner.nextInt();
    System.out.println("Escribe tercer entero");
    x[0]= scanner.nextInt();

    for(int i=0;i < 3; i++) {
        if (Max3<x[i]) Max3=x[i];
    }


    System.out.println("El numero mas grande de los tres es " + Max3);
    
 

    

    }
}