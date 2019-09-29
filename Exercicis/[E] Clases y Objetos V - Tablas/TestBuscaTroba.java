import java.util.Scanner;

/**
 * TestBuscaTroba
 */
public class TestBuscaTroba {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numT;
        Punt2D tpunt[];
        int talt[];
        BuscaTroba tesoros;

        // Introducció de dades dels tresors
        System.out.println("¿Quants tresors hi ha a Terrassa?");
        numT = scan.nextInt();
        talt = new int[numT];
        tpunt = new Punt2D[numT];
        for (int i = 0; i < numT; i++) {
            tpunt[i] = new Punt2D();
        }

        System.out.println("¿On es troben aquests tresors?");
        // System.out.println("        -- Dades del primer tresor -- ");
        for (int i = 0; i < numT; i++) {
            System.out.println("        -- Dades del següent tresor -- ");
            System.out.println("Introdueix l'altura: ");
            talt[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("Introdueix la coordenada X: ");
            tpunt[i].setX_Cor(scan.nextDouble());
            scan.nextLine();
            System.out.println("Introdueix la coordenada Y: ");
            tpunt[i].setY_Cor(scan.nextDouble());
            scan.nextLine();
        }

        // Creació de taula de tresors
        tesoros = new BuscaTroba(tpunt, talt);

        // Mostro dades de tresors per pantalla
        for (int i = 0; i < numT; i++) {
            tesoros.getTresor(i).showTesoro();
        }

        scan.close();

    }
}