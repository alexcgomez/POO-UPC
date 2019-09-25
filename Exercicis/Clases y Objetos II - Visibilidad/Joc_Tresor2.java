import java.util.Scanner;

/**
 * Joc_Tresor: Implementació de modificacions getter y setter
 *
 */
public class Joc_Tresor2 {

    public static void main(String[] args) {
        
        String Descrip;
        int Alt;
        Double Val;
        Scanner scanner = new Scanner(System.in);
        Tesoro2 tesoro;

        System.out.println("Crea un tesoro");
        System.out.println("------------------------------");
        System.out.println("Introduce la descripción del tesoro: ");
        Descrip = scanner.next();
        System.out.println("Introduce la altura del tesoro: ");
        Alt = scanner.nextInt();
        System.out.println("Introduce el valor del tesoro: ");
        Val = scanner.nextDouble();

        tesoro = new Tesoro2(Descrip,Alt,Val);

        System.out.println("______________________________");
        System.out.println("Este es el Tesoro que has creado");
        System.out.println("------------------------------");
        System.out.println("Descripción: "+ tesoro.getDescripcion());
        System.out.println("Altura: "+ tesoro.getAltura());
        System.out.println("Valor: "+ tesoro.getValor());
        System.out.println("El tesoro es valioso: "+ tesoro.esValioso());



        System.out.println("______________________________");
        System.out.println("Modificar el contenido del tesoro");
        System.out.println("------------------------------");
        System.out.println("Introduce la nueva descripción: ");
        Descrip = scanner.next();
        System.out.println("Introduce el nuevo valor del tesoro: ");
        Val = scanner.nextDouble();

        tesoro.ActuTesoro(Descrip, Val);

        System.out.println("______________________________");
        System.out.println("Este es el tesoro actualizado");
        System.out.println("------------------------------");
        System.out.println("Descripción: "+ tesoro.getDescripcion());
        System.out.println("Altura: "+ tesoro.getAltura());
        System.out.println("Valor: "+ tesoro.getValor());
        System.out.println("El tesoro es valioso: "+ tesoro.esValioso());

        scanner.close();
        
            
    }
}