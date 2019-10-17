import java.util.*;

/**
 * main
 */
public class Main {

    public static void print(Object a){
        System.out.println(a);
    }

    public static void main(String[] args) {

        print("");
        print("");
        print("");
        print("");
        Cliente a = new Cliente(1,"Alex", "Caceres", "D1243");
        Fabricante b = new Fabricante(1,"Samsung",912345621);
        Componente c = new Componente(b,1,"Monitor 29'",300.0);
        ArrayList<Componente> productos = new ArrayList<Componente>();
        productos.add(new Componente(b,2,"producto1",329));
        productos.add(new Componente(b,3,"producto2",310));
        productos.add(new Componente(b,4,"producto3",320));
        productos.add(new Componente(b,5,"producto4",330));
        productos.add(new Componente(b,6,"producto5",340));
        productos.add(new Componente(b,7,"producto6",350));

        //productos.forEach(p->print(p));

        Carrito carrito = new Carrito(productos,new Date(),a);

        //print(productos.size());
        
        // print("PRUEBAS: CLIENTE, FABRICANTE, PRODUCTO");
        // print(a);
        // print(b);
        // print(c);
        print("PRUEBAS: CARRITO DE LA COMPRA");
        print(carrito);

    }
}