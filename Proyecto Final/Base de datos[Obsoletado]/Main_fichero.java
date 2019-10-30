import java.io.*;
import java.util.ArrayList;
import java.util.Date;
/**
 * main
 */
public class Main_fichero {
// C:/Users/Alex/OneDrive/UPC - INGENIERIA/Alex/4º/Introduccion a la POO/POO-UPC/Proyecto Final
    public static String ruta = "/";
    public static String nombre_DB = "Inventario.txt";
    static void print(Object a){
        System.out.println(a);
    }
    static void conexionFichero(){
    }
    static Carrito ejemploCarrito(){
        
       Fabricante F = new Fabricante(0, "Samgung", 935628130);
       Cliente C = new Cliente(0,"Alex","Caceres","4785 4455 6684 4566");
       ArrayList<Componente> Productos = new ArrayList<Componente>();

       Productos.add();
       Productos.add(new Componente(F,1,"Teclado Motospeed",80));
       Productos.add(new Componente(F,2,"NVIDIA GeForce GTX 2060",750));
       Productos.add(new Componente(F,3,"Memoria RAM Corsair 8GB",40));
       Productos.add(new Componente(F,4,"Raton inalambrico Razer",50));
       Productos.add(new Componente(F,5,"Cooler Razer CPU",60));
       Productos.add(new Componente(F,6,"Intel i7 9124 3.2GHz",350));
       Productos.add(new Componente(F,7,"Placa Base Asus G2345",120));
       Productos.add(new Componente(F,8,"Fuente de alimentación Corsair 750W",70));
       Productos.add(new Componente(F,9,"Tarjeta Wi-Fi StA",20)); 

       Carrito Carro = new Carrito(, new Date(), C);
       return Carro;
    }
    static void etapa1(){
        print("\n\n\n\n");
        Carrito Carro = new Carrito();
        Carro = ejemploCarrito();
        print("Carrito:    " + new Date());
        print(Carro);
        print("Carrito: Eliminados productos 2,3,4,5    " + new Date());
        print(Carro.eliminarProducto(2));
        print(Carro.eliminarProducto(3));
        print(Carro.eliminarProducto(4));
        print(Carro.eliminarProducto(5));
        print(Carro);
        print("Carrito: Intentando eliminar producto 5 (que no se encuentra en el carrito)");
        print(Carro.eliminarProducto(5));
        print(Carro);
        print("Realizada Venta");
        Venta venta = new Venta();
        venta = Carro.comprar(new Date(),"Tarjeta de credito");
        print(venta);
    }
    static void pruebafichero(){
        
        File test = new File( ruta + nombre_DB );
        Archivo archivo = new Archivo(test);
        String texto[];
        boolean deleted = false;





        Fabricante obj_fabricante = new Fabricante(2,"VictorFab",151235);
        boolean temp = archivo.add_DB(obj_fabricante);
        System.out.println(temp);
        // Componente obj_Componente = new Componente(21, obj_fabricante, 100, "Auriculares Sony", 79.0 );
        // temp = archivo.add_DB(obj_Componente);

        // Cliente obj_Cliente = new Cliente(2,"Noelia", "Gamez", "1325 1234 1234 1234");
        // temp = archivo.add_DB(obj_Cliente);





       
        // texto = archivo.read_DB(archivo.FABRICANTE, 0);
        // System.out.println("El fabricante numero 0 es : " + texto[1] );
        
        // texto = archivo.read_DB(archivo.FABRICANTE, 1);
        // System.out.println("El fabricante numero 1 es : " + texto[1] );
        
        // texto = archivo.read_DB(archivo.FABRICANTE, 2);
        // System.out.println("(peta)El fabricante numero 2 es : " + texto[1] );

        // texto = archivo.read_DB(archivo.PRODUCTO, 0);
        // System.out.println("El PRODUCTO numero 0 es : " + texto[3] );

        // texto = archivo.read_DB(archivo.PRODUCTO, 1);
        // System.out.println("El PRODUCTO numero 1 es : " + texto[3] );
        
        // texto = archivo.read_DB(archivo.PRODUCTO, 2);
        // System.out.println("El PRODUCTO numero 2 es : " + texto[3] );




        // texto = archivo.read_DB(archivo.CLIENTE, 0);
        // System.out.println("El CLIENTE numero 0 es : " + texto[1] );

        // texto = archivo.read_DB(archivo.CLIENTE, 1);
        // System.out.println("El CLIENTE numero 1 es : " + texto[1] );
        
        // texto = archivo.read_DB(archivo.CLIENTE, 2);
        // System.out.println("(peta)El CLIENTE numero 2 es : " + texto[1] );
        
        
        //texto = archivo.read_DB(archivo.COMPONENTE, 2);
        //System.out.println("El Producto numero 0 es : " + texto[3] );
        
        //deleted = archivo.delete_DB(archivo.COMPONENTE, 2);
        //System.out.println("Se ha eliminado?" + deleted);


        

        //System.out.println("Se ha creado?" + temp);
        

        //texto = archivo.read_DB(archivo.COMPONENTE, 2);
        //System.out.println("El Producto numero 0 es : " + texto[3] );







        //etapa1();
    }
    

}