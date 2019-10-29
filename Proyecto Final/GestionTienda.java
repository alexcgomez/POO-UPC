import java.util.Date;

/**
 * GestionTienda
 */
public interface GestionTienda {

    public String addCliente(Cliente c);
    public String addFabricante(Fabricante f);
    public void showCliente();
    public void showFabricante();
    public void updateStock(Componente c, int u);
    public void addComponente();
    public void addCarrito(Cliente c, Date d);
    public void showCarrito();
    public void showVentas();
    public void deleteCarrito(Cliente c);
    public void deleteVenta(Date d);
    public void comprarCarrito(int i, String p);
    public void devolucion(Date d, Cliente c, int cd);
    public void mostrarStock();



}