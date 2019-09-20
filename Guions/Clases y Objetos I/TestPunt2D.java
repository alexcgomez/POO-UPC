import java.util.Scanner;

/**
 * TestPunt2D
 */
public class TestPunt2D {

    public static void main(String[] args) {
        
        double x1,y1,x2,y2,distx,disty,distp;
        Punt2D punt1 , punt2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PUNTO 1");
        System.out.println("Introduce coordenada X: ");
        x1 = scanner.nextDouble();
        System.out.println("Introduce coordenada Y: ");
        y1 = scanner.nextDouble();

        punt1 = new Punt2D(x1,y1);

        System.out.println("PUNTO 2");
        System.out.println("Introduce coordenada X: ");
        x2 = scanner.nextDouble();
        System.out.println("Introduce coordenada Y: ");
        y2 = scanner.nextDouble();

        punt2 = new Punt2D(x2,y2);

        System.out.println("La distancia X entre los puntos es: "+punt1.DistanciaX(punt2));
        System.out.println("La distancia Y entre los puntos es: "+punt1.DistanciaY(punt2));
        System.out.println("El modulo de la distancia entre los puntos es: "+punt1.Distanciapunt(punt1, punt2));

    }
}