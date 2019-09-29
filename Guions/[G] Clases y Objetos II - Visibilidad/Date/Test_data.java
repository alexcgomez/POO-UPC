import java.util.Scanner;

/**
 * Test_data
 */
public class Test_data {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Data d1,d2;

        System.out.println("Introduce una fecha:");
        d1 = new Data(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println("Introduce otra una fecha:");
        d2 = new Data(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println("Fechas en orden creciente, si son iguales, aparecen en la misma linea:");
        if (d1.AnteriorPosteriorIgual(d2) == 1){
            System.out.println(d1.getDia() + " / " + d1.getMes() + " / " + d1.getAny());
            System.out.println(d2.getDia() + " / " + d2.getMes() + " / " + d2.getAny());
        }
            else if(d1.AnteriorPosteriorIgual(d2) == -1){
                System.out.println(d2.getDia() + " / " + d2.getMes() + " / " + d2.getAny());
                System.out.println(d1.getDia() + " / " + d1.getMes() + " / " + d1.getAny());
            }
                else  System.out.println(d2.getDia() + " / " + d2.getMes() + " / " + d2.getAny() + " | " + d1.getDia() + " / " + d1.getMes() + " / " + d1.getAny());
                
        scan.close();
    }
}