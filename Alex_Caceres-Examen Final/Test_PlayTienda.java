import java.util.ArrayList;

/**
 * Test_PlayTienda
 */
public class Test_PlayTienda {

    
    
    public static void println(Object e){
        System.out.println(e);
    }
    public static void pruebaAppGrat(){
        App_Gratuita app1 = new App_Gratuita("Jumbo", "Juego de aviones", "Game dev", "1.0.1", "Game Strudio");
        System.out.println(app1);
    }
    public static void pruebaAppPrueba(){
        String nombre = "SpaceInvaders";
        String descripcion = "Juego de naves espaciales";
        String developer = "DevCon";
        String version = "2.0.3";
        Boolean movil  = true;
        double precio = 5.95;
        App_Prueba app1 = new App_Prueba(nombre, descripcion, developer, version, movil, precio);

        System.out.println(app1);
        System.out.println(app1.calcularPrecio());
        App_Prueba.setPeriodo_prueba(0);
        System.out.println(app1.calcularPrecio());
    }
    public static void pruebaAppPago(){

        String nombre = "SpaceInvaders 2";
        String descripcion = "Juego de naves espaciales segunda parte";
        String developer = "DevCon";
        String version = "4.2.3";
        double precio = 15.95;

        App_Pago app1 = new App_Pago(nombre, descripcion, developer, version, precio);

        System.out.println(app1);
        System.out.println(app1.calcularPrecio());
    
    }
    public static void pruebaCancion(){
        Cancion c = new Cancion("Buleria", "David Bisbal", 1.99);

        println(c);
    }
    public static void pruebaPuntuacion(){
        println("\n\n");
       
        println("//////////// SISTEMA DE PUNTUACIONES //////////////\n\n");


        
        println("CREO UNA CANCION:\n");
        
        Cancion can = new Cancion("Malamente","Rosalia",1.5);
      
        println(can);

        println("REALIZO UNA SERIE DE PUNTUACIONES:\n");       
        can.puntuar(4);
        can.puntuar(1);
        can.puntuar(3);
        can.puntuar(4);
        can.puntuar(4);
        can.puntuar(2);
        can.puntuar(3);
        can.puntuar(3);
        can.puntuar(4);
        can.puntuar(4);
        println("MUESTRO LAS PUNTUACIONES");
        println(can.mostrarPuntuaciones());
        println("PUNTUACION MEDIA");
        println(can.puntuacionMedia());
        println("PUNTUACION MEDIA NORMALIZADA 1-10");
        println(can.puntuacionMedia1to10());
        println("");
        println("");
    }
    public static void pruebaTop(){

        println("//////////// TOP TEN //////////////\n\n");
        println("CREO UNA ARRAY:\n");
        ArrayList<Sistema_Puntuacion> Lista = new ArrayList<Sistema_Puntuacion>(10);
        Lista.add(new Cancion("Malamente","Rosalia",1.99));
        Lista.add(new Cancion("Cancion2", "Cantante2", 2.99));
        Lista.add(new Cancion("Cancion3", "Cantante3", 3.99));
        Lista.add(new App_Gratuita("Appgratis1", "App gratuita 1", "Desarrollador 1", "1.0.0", "Patreocinador 1"));
        Lista.add(new App_Pago("App2", "App de pago 2", "Desarrollador 2", "2.0.0", 3.99));
        Lista.add(new App_Pago("App3", "App de pago 2", "Desarrollador 2", "3.0.0", 2.99));
        Lista.add(new App_Pago("App2", "App de pago 2", "Desarrollador 2", "3.0.0", 4.99));
        Lista.add(new App_Prueba("AppPrueba1", "App de prueba 1", "Desarrollador prueba 1", "5.0.0", false, 3.99));
        Lista.add(new Cancion("Cancion4", "Cantante4", 3.99));
        Lista.add(new Cancion("Cancion5", "Cantante5", 6.99));

        println("CREO UNA LISTA TOP TEN:\n");
        TopTen t1 = new TopTen(Lista);
        println("Actualizo:\n");
        //t1.actualizarTop(new Cancion("Cancion5", "Cantante5", 6.99));
        println(t1.listaTop());
    

    }
    
    // Funciones inacabadas, errores que habria que solventar en TopTen
    
    
    public static void main(String[] args) {
    
        println("//////////// APP Gratuita //////////////\n\n");
        pruebaAppGrat();
        println("");
        println("//////////// APP de Pago //////////////\n\n");
        pruebaAppPago();
        println("");
        println("//////////// APP de Prueba //////////////\n\n");
        pruebaAppPrueba();
        println("");
        println("//////////// Cancion //////////////\n\n");
        pruebaCancion();
        println("");
        pruebaPuntuacion();
        println("");
        pruebaTop();
        println("");
        
    }

}