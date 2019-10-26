import java.util.ArrayList;
import java.util.Date;
/**
 * Venta
 */
public class Venta {

    private ArrayList<Componente> Lista_productos;
    private Date FechaVenta;
    private Cliente cliente;
    private String Formapago;

    public Venta(){
    }

    public Venta(ArrayList<Componente> lista_productos, Date fechaVenta, Cliente cliente,String Formapago) {
        Lista_productos = lista_productos;
        FechaVenta = fechaVenta;
        this.cliente = cliente;
        this.Formapago = Formapago;
    }

    public ArrayList<Componente> getLista_productos() {
        return Lista_productos;
    }

    public void setLista_productos(ArrayList<Componente> lista_productos) {
       if(Lista_productos!=null){
        Lista_productos = lista_productos;
       }
    }

    public String getFormapago() {
        return Formapago;
    }

    public void setFormapago(String formapago) {
        Formapago = formapago;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        FechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        double total=0.0;
        String texto = "\n\nFACTURA DE VENTA\n______________________\n";           
        texto += "\nFabricante[Cod.Fab.] | Codigo de producto | Descripcion | Precio";
        texto += "\n";
        for(int i = 0; i < Lista_productos.size(); i++) {
            texto+=Lista_productos.get(i).toString()+"\n";
            total+=Lista_productos.get(i).getPVP();
        }
        texto += "\n";
        texto+="TOTAL--------------------------------- "+total;
        texto += "\n";
        return texto;
    }

   
    
}
    
