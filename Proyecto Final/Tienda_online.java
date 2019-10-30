import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Tienda_online
 */
public class Tienda_online implements GestionTienda{

    private ArrayList<Cliente> lista_Clientes;
    private ArrayList<Fabricante> lista_Fabricante;
    private ArrayList<ProductoEnStock> lista_Stock;
    private ArrayList<Carrito> lista_Carritos;
    private ArrayList<Venta> ventas;

    public Tienda_online(){};

    public Tienda_online(ArrayList<Cliente> lista_Clientes, ArrayList<Fabricante> lista_Fabricante,
    ArrayList<ProductoEnStock> lista_Stock, ArrayList<Carrito> lista_Carritos, ArrayList<Venta> ventas) {
        this.lista_Clientes = lista_Clientes;
        this.lista_Fabricante = lista_Fabricante;
        this.lista_Stock = lista_Stock;
        this.lista_Carritos = lista_Carritos;
        this.ventas = ventas;
    }

    public String addCliente(Cliente c){
        if(lista_Clientes.contains(c)) return "El cliente " + c.getNombre() + " " + c.getApellido() + " ya existe!";
        lista_Clientes.add(c);
        return "Cliente " + c.getNombre() + " " + c.getApellido() + " añadido correctamente !";
    }
    public String addFabricante(Fabricante f){
        if(lista_Fabricante.contains(f))return  "El fabricante " + f.getNombre_Fabricante() + " ya existe!";
        lista_Fabricante.add(f);
        return "Fabricante " + f.getNombre_Fabricante() + " añadido correctamente !";
    }
    public String showCliente(){
        Iterator<Cliente> it = lista_Clientes.iterator();
        String retorno = "";
        while(it.hasNext()){
			retorno += "\n" + it.next();
        }
        return retorno;
    }
    public String showFabricante(){
        Iterator<Fabricante> it = lista_Fabricante.iterator();
        String retorno = "";
        while(it.hasNext()){
			retorno += "\n" + it.next();
        }
        return retorno;
    }
    public String updateStock(Componente c, int u){
        for (int i = 0; i < lista_Stock.size(); i++) {
            if(lista_Stock.get(i).getProducto().equals(c)){
            lista_Stock.get(i).setStock(u);
            return "Producto " + c.getDescripcion() + " hallado en inventario, sumadas/restadas " + u + " unidades del stock";}
        }
        lista_Stock.add(new ProductoEnStock(c,u,0));
        return "Producto " + c.getDescripcion() + " añadido al inventario con " + u + " unidades en stock."; 
    }
    public String addProdCarrito(Carrito c, Componente p){

        String retorno = "";
        // Antes de añadir paso el control del producto en stock
        for (int i = 0; i < lista_Stock.size(); i++) {
            if(lista_Stock.get(i).getProducto().equals(p)){
                if (lista_Stock.get(i).getStock() > lista_Stock.get(i).getReservados()){
                    lista_Stock.get(i).addReservados();
                    c.añadirProducto(p);
                    retorno = "Añadido " + lista_Stock.get(i).getProducto().getDescripcion() +" a carrito de " + c.getCliente().getNombre() + " " + c.getCliente().getApellido();
                }
                else retorno =  "No hay unidades disponibles de: " + lista_Stock.get(i).getProducto().getDescripcion();
            }
        }
        return retorno;
    }
    public String addCarrito(Cliente c, Date d){
        
        for (int i = 0; i < lista_Carritos.size(); i++) {
            if(lista_Carritos.get(i).getCliente().equals(c)){
                return "El cliente " + c.getNombre() + " " + c.getApellido() + " ya tiene un carrito de compra con fecha de: " + lista_Carritos.get(i).getFecha();
            }
        }
        lista_Carritos.add(new Carrito(new ArrayList<Componente>(),d,c));
        return "Se ha creado carrito de compra a nombre de: " + c.getNombre() + " " + c.getApellido() + " con fecha de " + d;
    }
    public String showCarrito(){
        Iterator<Carrito> it = lista_Carritos.iterator();
        String retorno = "";
        while(it.hasNext()){
			retorno += "\n" + it.next();
        }
        return retorno;
    }
    public String showVentas(){
        Iterator<Venta> it = ventas.iterator();
        String retorno = "";
        while(it.hasNext()){
			retorno += "\n" + it.next();
        }
        return retorno;
    }
    public String deleteCarrito(Cliente c){
        for (int i = 0; i < lista_Carritos.size(); i++) {
            if(lista_Carritos.get(i).getCliente().equals(c)){
                lista_Carritos.remove(i);
                return "Carrito eliminado del sistema";
            }
        }
        return "No se ha localizado el carrito en el sistema.";
    }
    public String deleteVenta(Date d){
        for (int i = 0; i < ventas.size(); i++) {
            if(ventas.get(i).getFechaVenta().equals(d)){
                for (int j = 0; j < ventas.get(i).getLista_productos().size(); j++) {
                    for (int j2 = 0; j2 < lista_Stock.size(); j2++) {
                        if(lista_Stock.get(j2).getProducto().equals(ventas.get(i).getLista_productos().get(j)))lista_Stock.get(j2).setStock(+1);
                    }
                }
                ventas.remove(i);
                return "Devolución completa de la venta";
            }
        }
        return "Venta no hallada en el sistema";
    }
    public String comprarCarrito(int i, String p){

        for (int j = 0; j < lista_Carritos.get(i).getLista_productos().size() ;j++) {
            for (int j2 = 0; j2 < lista_Stock.size(); j2++) {
                if(lista_Stock.get(j2).getProducto().equals(lista_Carritos.get(i).getLista_productos().get(j))){
                    lista_Stock.get(j2).setStock(lista_Stock.get(j2).getStock()- lista_Stock.get(j2).getReservados());
                }
            }
        }
        ventas.add(lista_Carritos.get(i).comprar(new Date(), p));
        return "Venta de carrito de " + lista_Carritos.get(i).getCliente().getNombre() + " realizada con " + p;

    }
    public void devolucion(Date d, Cliente c, int cd){

        // for (int i = 0; i < array.length; i++) {
            
        // }

    }
    public String mostrarStock(){
        Iterator<ProductoEnStock> it = lista_Stock.iterator();
        String retorno = "";
        while(it.hasNext()){
			retorno += "\n" + it.next();
        }
        return retorno;
    }

    public ArrayList<Cliente> getLista_Clientes() {
        return lista_Clientes;
    }

    public void setLista_Clientes(ArrayList<Cliente> lista_Clientes) {
        this.lista_Clientes = lista_Clientes;
    }

    public ArrayList<Fabricante> getLista_Fabricante() {
        return lista_Fabricante;
    }

    public void setLista_Fabricante(ArrayList<Fabricante> lista_Fabricante) {
        this.lista_Fabricante = lista_Fabricante;
    }

    public ArrayList<ProductoEnStock> getLista_Stock() {
        return lista_Stock;
    }

    public void setLista_Stock(ArrayList<ProductoEnStock> lista_Stock) {
        this.lista_Stock = lista_Stock;
    }

    public ArrayList<Carrito> getLista_Carritos() {
        return lista_Carritos;
    }

    public String setLista_Carritos(ArrayList<Carrito> lista_Carritos) {

        // Verifico que ningun cliente tenga más de un carrito.
        

        // Me pasan una lista de carritos y compruebo si se pueden reservar las unidades, si es asi, sumo 1 a las unidades reservadas de cada producto.
        String retorno = "Carritos añadidos correctamente.";;
        for (int i = 0; i < lista_Carritos.size(); i++) {
            for (int j = 0; j < lista_Carritos.get(i).getLista_productos().size(); j++) {
               for (int k = 0; k < lista_Stock.size(); k++) {
                   if (lista_Carritos.get(i).getLista_productos().get(j).getCodigo_producto() == lista_Stock.get(k).getProducto().getCodigo_producto() ) {
                       if (lista_Stock.get(k).getReservados() < lista_Stock.get(k).getStock()) {
                        lista_Stock.get(k).addReservados();
                       }    
                       else retorno = "El producto " + lista_Carritos.get(i).getLista_productos().get(j).getDescripcion() + " del carrito de " + lista_Carritos.get(i).getCliente().getNombre() + " " + lista_Carritos.get(i).getCliente().getApellido() + " no se ha podido añadir a la compra ya que se encuentran todas las unidades reservadas";
                   }
               }
            }
        }
        
        return retorno;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

 

    
}