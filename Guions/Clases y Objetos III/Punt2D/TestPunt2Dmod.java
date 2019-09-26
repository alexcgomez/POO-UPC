import java.util.Scanner;

/**
 * TestPunt2D
 */
public class TestPunt2Dmod {

    public static void main(String[] args) {
        
        double [] coorX = {0,0,0};
        double [] coorY = {0,0,0};
        Punt2D punt1 , punt2 , punt3;
        double dist12,dist13,dist23;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PUNTO 1");
        System.out.println("Se encuentra en el (0,0)");

        punt1 = new Punt2D();

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

        dist12 = punt1.distanciapunt(punt2.getX_Cor(), punt2.getY_Cor());
        dist13 = punt1.distanciapunt(punt3.getX_Cor(), punt3.getY_Cor());
        dist23 = punt2.distanciapunt(punt3.getX_Cor(), punt3.getY_Cor());

        System.out.println("DISTANCIAS ENTRE PUNTOS");
        System.out.println("Distancia entre punto 1 y 2: " + dist12);
        System.out.println("Distancia entre punto 1 y 3: " + dist13);
        System.out.println("Distancia entre punto 2 y 3: " + dist23);

        if (dist12 < dist13 && dist12 < dist23) {

            System.out.println("El punto 1 y 2 son los más próximos. Distancia: " + dist12);}             
           
            else if (dist13 < dist12 && dist13 < dist23) {

                System.out.println("El punto 1 y 3 son los más próximos. Distancia: " + dist13);}
            
                else if (dist23 < dist13 && dist23 < dist12) {
                    
                    System.out.println("El punto 2 y 3 son los más próximos. Distancia: " + dist23);}
      



        

        scanner.close();
        

    }
}