import java.util.ArrayList;
import java.util.Date;

/**
 * Carrito
 */
public class Carrito {

    private ArrayList<Componente> Lista_productos;
    Date Fecha;
    Cliente cliente;

    public Carrito(){}

    public Carrito(ArrayList<Componente> productos, Date Fecha, Cliente cliente){
        setLista_productos(Lista_productos);
        setFecha(Fecha);
        setCliente(cliente);
    }

    public ArrayList<Componente> getLista_productos() {
        return this.Lista_productos;
    }

    public void setLista_productos(ArrayList<Componente> Lista_productos) {
        
        this.Lista_productos = Lista_productos;
    }

    public Date getFecha() {
        return this.Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void añadirProducto(Componente C){
        Lista_productos.add(C);
    }

    public boolean eliminarProducto(int Codigo){
        if(Lista_productos.size()==0) return false;
        else {
            Lista_productos.remove(Codigo);
            return true;
        }
    }

    @Override
    public String toString(){
        double total=0.0;
        String texto = "CARRITO DE LA COMPRA\n_________________________\n";
        if(Lista_productos.size() != 0){
            for(int i = 0; i < Lista_productos.size(); i++) {
                texto+=Lista_productos.get(i).toString()+"\n";
                total+=Lista_productos.get(i).getPVP();
            }
            texto+="TOTAL--------------------------------- "+total;
            return texto;
        }
        else return "El carrito esta vacio.";
    }



}