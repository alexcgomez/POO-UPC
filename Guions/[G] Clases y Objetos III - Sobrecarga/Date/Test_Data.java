import java.util.Scanner;

/**
 * Test_Data
 */
public class Test_Data {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i;
        Data d1,d2;

        System.out.println("Introduce una fecha: ");

        d1 = new Data(scan.nextInt(),scan.nextInt(),scan.nextInt());
        d2 = new Data(d1);

        System.out.println("Introduce otra fecha: ");

        i = d2.AnteriorPosteriorIgual(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println("La ultima fecha introducida es: ");
        if (i == 1) System.out.println("Posterior");
            else if (i == -1) System.out.println("Anterior");    else if (i == 0) System.out.println("Igual");
        


        scan.close();


    }
}