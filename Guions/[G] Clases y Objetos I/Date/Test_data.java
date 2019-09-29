import java.util.Scanner;


/**
 * Test_data
 */
public class Test_data {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int dia,mes,any,antpostigu; 
        Data d1,data_avui;
        
        data_avui = new Data(26,9,2019);

        
        System.out.println("Introduce una fecha: ");
        dia = scan.nextInt();
        mes = scan.nextInt();
        any = scan.nextInt();
        d1 = new Data(dia,mes,any);
        System.out.println("Dia: " + d1.getDia() + " Mes: " + d1.getMes() + " Any: " + d1.getAny());

        antpostigu = data_avui.AnteriorPosteriorIgual(d1);
        System.out.println(antpostigu);


    
    }
      
    
}
  
    


