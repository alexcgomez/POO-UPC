/**
 * TestRectangle
 */
import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Rectangle2D R1,R2;
        Punt2D p1,p2;
        
        p1 = new Punt2D();
        p2 = new Punt2D();

        // Creo un punto
        p1.insertCor();
        // Construyo rectangulo con ese punto y enseño area y perimetro
        R1 = new Rectangle2D(p1);
        R1.showDatos();
        
        // Construyo nuevo rectangulo a partir del primero
        R2 = new Rectangle2D(R1);

        // Modifico primer rectangulo 
        p2.insertCor();
        R1.setPunt(p2);
        
        // Enseño datos de ambos rectangulos (Deberian ser diferentes debido al constructor de copia utilizado)
        System.out.println("Datos primer rectangulo");
        R1.showDatos(); // Deberia ser diferente al de antes
        System.out.println("Datos segundo rectangulo");
        R2.showDatos(); // Deberia ser igual al de antes




        scan.close();
    }
}