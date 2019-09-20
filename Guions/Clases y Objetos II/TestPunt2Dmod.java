import java.util.Scanner;

/**
 * TestPunt2D
 */
public class TestPunt2Dmod {

    public static void main(String[] args) {
        
        double [] coorX = {0,0,0};
        double [] coorY = {0,0,0};
        Punt2D punt1 , punt2 , punt3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PUNTO 1");
        System.out.println("Introduce coordenada X: ");
        coorX[0] = scanner.nextDouble();
        System.out.println("Introduce coordenada Y: ");
        coorY[0] = scanner.nextDouble();

        punt1 = new Punt2D(coorX[0],coorY[0]);

        System.out.println("PUNTO 2");
        System.out.println("Introduce coordenada X: ");
        coorX[1] = scanner.nextDouble();
        System.out.println("Introduce coordenada Y: ");
        coorY[1] = scanner.nextDouble();

        punt2 = new Punt2D(coorX[1],coorY[1]);

        
        System.out.println("PUNTO 3");
        System.out.println("Introduce coordenada X: ");
        coorX[2] = scanner.nextDouble();
        System.out.println("Introduce coordenada Y: ");
        coorY[2] = scanner.nextDouble();

        punt3 = new Punt2D(coorX[2],coorY[2]);

        System.out.println("DISTANCIAS ENTRE PUNTOS");
        System.out.println("Distancia entre punto 1 y 2: "+punt1.Distanciapunt(punt1, punt2));
        System.out.println("Distancia entre punto 1 y 3: "+punt1.Distanciapunt(punt1, punt3));
        System.out.println("Distancia entre punto 2 y 3: "+punt2.Distanciapunt(punt2, punt3));

        if (punt1.Distanciapunt(punt1,punt2)<punt1.Distanciapunt(punt1, punt3) && punt1.Distanciapunt(punt1,punt2)<punt2.Distanciapunt(punt2,punt3)) {

            System.out.println("El punto 1 y 2 son los más próximos. Distancia: "+punt1.Distanciapunt(punt1, punt2));
                
            }
        else if (punt1.Distanciapunt(punt1,punt3)<punt1.Distanciapunt(punt1, punt2) && punt1.Distanciapunt(punt1,punt3)<punt2.Distanciapunt(punt2,punt3)) {

            System.out.println("El punto 1 y 3 son los más próximos. Distancia: "+punt1.Distanciapunt(punt1, punt3));

            } 
        else if (punt2.Distanciapunt(punt2,punt3)<punt1.Distanciapunt(punt1, punt2) && punt2.Distanciapunt(punt2,punt3)<punt1.Distanciapunt(punt1,punt3)) {
                    
            System.out.println("El punto 2 y 3 son los más próximos. Distancia: "+punt2.Distanciapunt(punt2, punt3));
        }



        

        scanner.close();
        

    }
}