import java.util.Scanner;

/**
 * TestTesoroNuevo
 */
public class TestTesoroNuevo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TesoroIV t1 = new TesoroIV();
        TesoroIV t2 = new TesoroIV();
        Punt2D p = new Punt2D();

        // 4) a. Crear un objecte Punt2Damb els valors de coordenades que entri
        // l’usuari.

        System.out.println("Introduce las coordenadas del punto:");
        System.out.println("----------------------------------");
        System.out.println("Coordenada X: ");
        p.setX_Cor(scan.nextDouble());
        System.out.println("Coordenada Y: ");
        p.setY_Cor(scan.nextDouble());

        // 4) b. Crear 2 objectes Tresor diferents però situats al mateix punt, és a dir
        // al Punt2D.

        t1.setPunt(p);
        t2.setPunt(p);

        System.out.println();
        System.out.println("Introduce los datos del tesoro 1:");
        System.out.println("----------------------------------");
        System.out.println("Descripcion: ");
        t1.setDescripcion(scan.next());
        System.out.println("Altura: ");
        t1.setAltura(scan.nextInt());
        System.out.println("Valor: ");
        t1.setValor(scan.nextDouble());

        System.out.println();
        System.out.println("Introduce los datos del tesoro 2:");
        System.out.println("----------------------------------");
        System.out.println("Descripcion: ");
        t2.setDescripcion(scan.next());
        System.out.println("Altura: ");
        t2.setAltura(scan.nextInt());
        System.out.println("Valor: ");
        t2.setValor(scan.nextDouble());

        // 4 c. Mostreu per pantalla la informació dels 2 tresors
        System.out.println();
        System.out.println("INFO DE LOS TESOROS");
        System.out.println("--------------------");
        t1.showTesoro();
        t2.showTesoro();

        // 4 d. Modifiqueu la coordenada x del punt en el que està situat el primer
        // tresor.
        // - Les dades no son correctes, l'objecte Punt2D p, esta referenciat a ambdos
        // tresors.

        p.setX_Cor(+15);
        t1.setPunt(p);
        t1.showTesoro();
        t2.showTesoro();

        scan.close();
    }
}
