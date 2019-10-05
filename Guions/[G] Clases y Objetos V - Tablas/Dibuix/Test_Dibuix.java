package Dibuix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Test_Dibuix
 */
public class Test_Dibuix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Punt2D punt1,punt2;
        ArrayList<Rectangle2D> rectangles;
        Dibuix dibujo;

        System.out.println("Cuantos rectangulos tiene tu dibujo?");
        int max_rec = scan.nextInt();
        if (max_rec > 100) System.out.println("Se guardaran maximo 100 rectangulos.");
        rectangles = new ArrayList<Rectangle2D>(max_rec);
        for (int i = 0; i < max_rec; i++) {
            System.out.println("Introduce coordenada X del punto 1 del rectangulo "+i);
            rectangl
            rectangles.get(i).getPunt1().setX_Cor(scan.nextDouble());
            System.out.println("Introduce coordenada Y del punto 1 del rectangulo "+i);
            rectangles.get(i).getPunt1().setY_Cor(scan.nextDouble());
            System.out.println("Introduce coordenada X del punto 2 del rectangulo "+i);
            rectangles.get(i).getPunt2().setX_Cor(scan.nextDouble());
            System.out.println("Introduce coordenada Y del punto 2 del rectangulo "+i);
            rectangles.get(i).getPunt2().setY_Cor(scan.nextDouble());
        }
        System.out.println("CREACION DEL DIBUJO");
        dibujo = new Dibuix(rectangles);






    }
}