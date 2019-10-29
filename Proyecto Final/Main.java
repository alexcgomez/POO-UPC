import java.util.*;




public class main {

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

       
        System.out.println(tienda.addFabricante(new Fabricante(0, "Samsung", 935102156)));
        System.out.println(tienda.addFabricante(new Fabricante(0, "Samsung", 935102156)));
        System.out.println(tienda.addFabricante(new Fabricante(1, "Intel", 951753825)));
        System.out.println(tienda.addFabricante(new Fabricante(2, "Corsair", 945456852)));
        System.out.println(tienda.addFabricante(new Fabricante(3, "AMD", 985753654)));
        System.out.println(tienda.addFabricante(new Fabricante(4, "Razer", 952123456)));
       

        
        System.out.println(tienda.addCliente(new Cliente(0, "Alex", "Caceres", "1234 4658 1235 4568")));
        System.out.println(tienda.addCliente(new Cliente(0, "Alex", "Caceres", "1234 4658 1235 4568")));
        System.out.println(tienda.addCliente(new Cliente(1, "Daniel", "Caceres", "1234 4658 1235 4568")));
        System.out.println(tienda.addCliente(new Cliente(2, "Jordi", "Navarro", "1234 4658 1235 4568")));
        System.out.println(tienda.addCliente(new Cliente(3, "Noelia", "Gámez", "1234 4658 1235 4568")));
        System.out.println(tienda.addCliente(new Cliente(4, "Roberto", "Garcia", "1234 4658 1235 4568")));
        
        
        // // 3.- Creo varios componentes y sus correspondientes productosenStock y los añado a la tienda.

        
        // new Componente(0, lista_Fabricante.get(0), "Monitor 29'", 200);
        // new Componente(1, lista_Fabricante.get(2), "Teclado mecanico", 80);
        // new Componente(2, lista_Fabricante.get(3), "Procesador A10 3.2GHz", 150);
        // new Componente(3, lista_Fabricante.get(3), "Ryzen 4.2GHz", 350);
        // new Componente(4, lista_Fabricante.get(4), "Mouse optico", 50);
        // new Componente(5, lista_Fabricante.get(1), "Procesador i9 serie 9012", 500);

        
        // new ProductoEnStock(lista_Componentes.get(0), 20, 0);
        // new ProductoEnStock(lista_Componentes.get(1), 12, 0);
        // new ProductoEnStock(lista_Componentes.get(2), 5, 0);
        // new ProductoEnStock(lista_Componentes.get(3), 2, 0);
        // new ProductoEnStock(lista_Componentes.get(4), 15, 0);
        // new ProductoEnStock(lista_Componentes.get(5), 6, 0);

        // // 4.- Añado productos en stock en la tienda virtual

        // tienda.setLista_Stock(lista_Stock);

        // // 5.- Creo un carrito de la compra añadiendo ciertos productos y lo añado a la tienda

        
        // ArrayList<Componente> lista_productos = new ArrayList<Componente>();
        // lista_Componentes.get(5);
        // lista_Componentes.get(1);
        // lista_Componentes.get(3);
        // lista_Componentes.get(3);
        // lista_Componentes.get(3);
        // lista_Componentes.get(3);
        // lista_Componentes.get(0);
        // lista_Carritos.add(new Carrito(lista_productos, new Date(), lista_Clientes.get(0)));

        // String p = tienda.setLista_Carritos(lista_Carritos);
        // System.out.println(p);

        // // 6.-

        


        




























    }
}