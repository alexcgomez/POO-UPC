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

        System.out.println("Introduce las coordenadas del punto:");
        System.out.println("----------------------------------");
        System.out.println("Coordenada X: ");
        p.setX_Cor(scan.nextDouble());
        System.out.println("Coordenada Y: ");
        p.setY_Cor(scan.nextDouble());

        t1.setPunt(p);
        t2.setPunt(p);

        System.out.println("Introduce los datos del tesoro 1:");
        System.out.println("----------------------------------");
        System.out.println("Descripcion: ");
        t1.setDescripcion(scan.next());
        System.out.println("Altura: ");
        t1.setAltura(scan.nextInt());
        System.out.println("Valor: ");
        t1.setValor(scan.nextDouble());

        System.out.println("Introduce los datos del tesoro 2:");
        System.out.println("----------------------------------");
        System.out.println("Descripcion: ");
        t2.setDescripcion(scan.next());
        System.out.println("Altura: ");
        t2.setAltura(scan.nextInt());
        System.out.println("Valor: ");
        t2.setValor(scan.nextDouble());

        System.out.println("INFO DE LOS TESOROS");
        System.out.println("--------------------");
        t1.showTesoro();
        t2.showTesoro();

        scan.close();
    }
}
