import java.util.Date;

/**
 * GestionTienda
 */
public interface GestionTienda {

    public String addCliente(Cliente c);
    public String addFabricante(Fabricante f);
    public String showCliente();
    public String addProdCarrito(Carrito c, Componente p);
    public String showFabricante();
    public String updateStock(Componente c, int u);
    public String addCarrito(Cliente c, Date d);
    public String showCarrito();
    public String showVentas();
    public String deleteCarrito(Cliente c);
    public String deleteVenta(Date d);
    public String comprarCarrito(int i, String p);
    public void devolucion(Date d, Cliente c, int cd);
    public String mostrarStock();



}