import java.util.ArrayList;
import java.util.Date;

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
        String retorno = "Cliente " + c.getNombre() + " " + c.getApellido() + " añadido correctamente !";
        if(lista_Clientes.contains(c)) retorno = "El cliente " + c.getNombre() + " " + c.getApellido() + " ya existe!";
        return retorno;
    }
    public String addFabricante(Fabricante f){
        String retorno = "Fabricante " + f.getNombre_Fabricante() + " añadido correctamente !";
        for (int i = 0; i < lista_Fabricante.size(); i++) {
            System.out.println("entro en el for");
            if(lista_Fabricante.contains(f)){retorno = "El fabricante " + f.getNombre_Fabricante() + " ya existe!";}
        }
        lista_Fabricante.add(f);
        return retorno;
    }
    public void showCliente(){}
    public void showFabricante(){}
    public void updateStock(Componente c, int u){}
    public void addComponente(){}
    public void addCarrito(Cliente c, Date d){}
    public void showCarrito(){}
    public void showVentas(){}
    public void deleteCarrito(Cliente c){}
    public void deleteVenta(Date d){}
    public void comprarCarrito(int i, String p){}
    public void devolucion(Date d, Cliente c, int cd){}
    public void mostrarStock(){}

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