import java.util.*;

public class main {

    public static void println(Object o){
        System.out.println(o);
    } 
    

    public static void main(String[] args) {
        
        ArrayList<Cliente> lista_Clientes = new ArrayList<Cliente>();
        ArrayList<Fabricante> lista_Fabricante = new ArrayList<Fabricante>();
        ArrayList<Componente> lista_Componentes = new ArrayList<Componente>();
        ArrayList<ProductoEnStock> lista_Stock = new ArrayList<ProductoEnStock>();
        ArrayList<Carrito> lista_Carritos = new ArrayList<Carrito>();
        ArrayList<Venta> lista_ventas = new ArrayList<Venta>();

        // 1.- Creo nueva tienda online.

        Tienda_online tienda = new Tienda_online(lista_Clientes, lista_Fabricante, lista_Stock, lista_Carritos, lista_ventas);

        // 2.- Creo varios clientes y fabricantes y los añado a la tienda online

        println("\n\n");
        println("/////////// AÑADIENDO FABRICANTES //////////////\n");
        println(tienda.addFabricante(new Fabricante(0, "Samsung", 935102156)));
        println(tienda.addFabricante(new Fabricante(1, "Intel", 951753825)));
        println(tienda.addFabricante(new Fabricante(2, "Corsair", 945456852)));
        println(tienda.addFabricante(new Fabricante(3, "AMD", 985753654)));
        println(tienda.addFabricante(new Fabricante(4, "Razer", 952123456)));
        println("\n----> Intento añadir fabricante repetido (Samsung): \n");
        println(tienda.addFabricante(new Fabricante(0, "Samsung", 935102156)));
      
      
        println("\n\n");
        println("/////////// AÑADIENDO CLIENTES ///////////////\n");
        println(tienda.addCliente(new Cliente(0, "Alex", "Caceres", "1234 4658 1235 4568")));
        println(tienda.addCliente(new Cliente(2, "Jordi", "Navarro", "1234 4658 1235 4568")));
        println(tienda.addCliente(new Cliente(3, "Noelia", "Gámez", "1234 4658 1235 4568")));
        println(tienda.addCliente(new Cliente(1, "Daniel", "Caceres", "1234 4658 1235 4568")));
        println(tienda.addCliente(new Cliente(4, "Roberto", "Garcia", "1234 4658 1235 4568")));
        println("\n----> Intento añadir Cliente repetido (Alex Caceres): \n");
        println(tienda.addCliente(new Cliente(0, "Alex", "Caceres", "1234 4658 1235 4568")));
        
        println("\n/////////// MUESTRO FABRICANTES ///////////////\n");
        println(tienda.showFabricante());
        println("\n/////////// MUESTRO CLIENTES /////////////////\n");
        println(tienda.showCliente());
        
        
        // 3.- Creo varios componentes y sus correspondientes productosenStock y los añado a la tienda.

        println("\n/////////// AÑADO PRODUCTOS AL INVENTARIO //////////\n");
        println(tienda.updateStock(new Componente(0, lista_Fabricante.get(0), "Monitor 29'", 200), 3)); 
        println(tienda.updateStock(new Componente(1, lista_Fabricante.get(2), "Teclado mecanico", 80), 10));
        println(tienda.updateStock(new Componente(2, lista_Fabricante.get(3), "Procesador A10 3.2GHz", 150), 1));
        println(tienda.updateStock(new Componente(3, lista_Fabricante.get(3), "Ryzen 4.2GHz", 350), 3));
        println(tienda.updateStock(new Componente(4, lista_Fabricante.get(4), "Mouse optico", 50), 5));
        println(tienda.updateStock(new Componente(5, lista_Fabricante.get(1), "Procesador i9 serie 9012", 500), 2));
        println("\n----> Intento añadir Producto ya en stock (Procesador i9 serie 9012): \n");
        println(tienda.updateStock(new Componente(5, lista_Fabricante.get(1), "Procesador i9 serie 9012", 500), 2));

        
        // 4.- Añado productos en stock en la tienda virtual

        println("\n/////////// MUESTRO PRODUCTOS DISPONIBLES EN STOCK //////////\n");
        println(tienda.mostrarStock());

        // 5.- Creo un carrito de la compra añadiendo ciertos productos y lo añado a la tienda

        println("\n/////////// CREO UN CARRITO NUEVO Y AÑADO PRODUCTOS //////////\n");
        println(tienda.addCarrito(tienda.getLista_Clientes().get(0), new Date()));
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(2).getProducto()));
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(1).getProducto()));
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(4).getProducto()));
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(0).getProducto()));
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(3).getProducto()));
        println("\n----> Intento añadir productos no disponibles en stock: \n");
        println(tienda.addProdCarrito(tienda.getLista_Carritos().get(0), tienda.getLista_Stock().get(2).getProducto()));
        println("\n----> Intento crear un carrito para el mismo cliente: \n");
        println(tienda.addCarrito(tienda.getLista_Clientes().get(0), new Date()));

        println("\n/////////// MUESTRO LISTA DE CARRITOS //////////\n");
        println(tienda.showCarrito());

        // 6.- Realizo la venta de un carrito creado.
        println("\n/////////// REALIZO VENTA DE CARRITO //////////\n");
        println(tienda.comprarCarrito(0, "Tarjeta de credito"));
        println("\n/////////// MUESTRO LISTA DE VENTAS REALIZADAS //////////\n");
        println(tienda.showVentas());
        println("\n/////////// MUESTRO PRODUCTOS DISPONIBLES EN STOCK //////////\n");
        println(tienda.mostrarStock());

        // 7.- Elimino venta y despues carrito

        println("\n/////////// ELIMINO UNA VENTA REALIZADA //////////\n");
        println(tienda.deleteVenta(tienda.getVentas().get(0).getFechaVenta()));
        println("\n/////////// ELIMINO UN CARRITO DETERMINADO //////////\n");
        println(tienda.deleteCarrito(tienda.getLista_Carritos().get(0).getCliente()));
       
        /*

        POR FALTA DE TIEMPO, NO HE PODIDO TERMINAR TODAS LAS FUNCIONALIDADES
        FALTARÍA, LA PARTE DE HERENCIA Y POLIMORFISMO Y ARREGLAR CIERTOS ERRORES
        EN LA GESTIÓN DEL STOCK DE LA TIENDA, SE HA INTENTADO REALIZAR EL PROYECTO
        MEDIANTE UNA PEQUEÑA BASE DE DATOS GESTIONADA POR UN FICHERO .TXT EN EL QUE 
        SE PODIAN INTRODUCIR LOS DATOS DESDE FUERA DEL PROGRAMA PARA UNA GESTIÓN DE 
        LA TIENDA MAS VISUAL, PERO FINALMENTE, DECIDÍ COMENZAR EL PROYECTO DE NUEVO
        DE AHI LA FALTA DE TIEMPO. ADJUNTO DE TODOS MODOS PARTE DEL CODIGO QUE DISEÑE
        PARA LA BASE DE DATOS

        */
    



        


        




























    }
}