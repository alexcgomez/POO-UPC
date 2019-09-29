import java.util.Scanner;

/**
 * IntCalculoFact
 */
public class IntCalculoFact {

    public static void main(String[] args) {
        
        int n, fact = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        n = scanner.nextInt();
        System.out.println(fact);

        for (int i = n; i > 1; i--) {

            fact = fact*i;
            
            System.out.println(fact);
            
        }
    }
}