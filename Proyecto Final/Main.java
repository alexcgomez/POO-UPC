import java.io.*;
import java.util.ArrayList;
import java.util.Date;
/**
 * main
 */
public class Main {

    static void print(Object a){
        System.out.println(a);
    }
    static void conexionFichero(){
    }
    static Carrito ejemploCarrito(){
        
       Fabricante F = new Fabricante(0, "Samgung", 935628130);
       Cliente C = new Cliente(0,"Alex","Caceres","4785 4455 6684 4566");
       ArrayList<Componente> Productos = new ArrayList<Componente>();

       Productos.add(new Componente(F,0,"Monitor 29'",250));
       Productos.add(new Componente(F,1,"Teclado Motospeed",80));
       Productos.add(new Componente(F,2,"NVIDIA GeForce GTX 2060",750));
       Productos.add(new Componente(F,3,"Memoria RAM Corsair 8GB",40));
       Productos.add(new Componente(F,4,"Raton inalambrico Razer",50));
       Productos.add(new Componente(F,5,"Cooler Razer CPU",60));
       Productos.add(new Componente(F,6,"Intel i7 9124 3.2GHz",350));
       Productos.add(new Componente(F,7,"Placa Base Asus G2345",120));
       Productos.add(new Componente(F,8,"Fuente de alimentación Corsair 750W",70));
       Productos.add(new Componente(F,9,"Tarjeta Wi-Fi StA",20)); 

       Carrito Carro = new Carrito(Productos, new Date(), C);
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
    
    
    public static void main(String[] args) {

            etapa1();
    
    }
}