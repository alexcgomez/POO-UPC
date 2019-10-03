package Examen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Venta
 */
public class main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Fabricante F = new Fabricante(100001,935710823,"PCComponentes");
        Cliente C = new Cliente(2156, "Alex", "Caceres", "4568 4565 4444 6585");
        ArrayList<Componente> Lista_Compra = new ArrayList<Componente>();
        CarritoDeLaCompra carrito;
        

        Lista_Compra.add(new Componente(F,545,"Teclado inalambrico",54.9));
        Lista_Compra.add(new Componente(F,46,"Raton inalambrico",10.2));
        Lista_Compra.add(new Componente(F,654,"Procesador intel i9",854.5));
        Lista_Compra.add(new Componente(F,15,"Monitor LG Curvo",325.9));
        Lista_Compra.add(new Componente(F,111,"Alfombrilla",5.95));
        Lista_Compra.add(new Componente(F,881,"Cooler",17.1));

        System.out.println("Añadidos productos al carrito\n");

        carrito = new CarritoDeLaCompra(Lista_Compra,new Data(2,10,2019),C);


        System.out.println("Añadir componente, introduce: Codigo");

        Lista_Compra.add(new Componente(F,scan.nextInt(),"Caja torre de cristal",56.1));
        
        System.out.println("Mostrando productos actuales\n");
        System.out.println(carrito.toString());

        System.out.println("Eliminando 1 componente\n");
        carrito.deleteComponente(881);
        
        System.out.println("Realizando Compra");
        Venta venta = new Venta(carrito.comprar(new Data(3,10,2019), "TB"));

        System.out.println("Compra realizada");
        //venta.toString();


        


    }
}