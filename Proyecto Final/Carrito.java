import java.util.ArrayList;
import java.util.Date;

/**
 * Carrito
 */
public class Carrito {

    private ArrayList<Componente> Lista_productos;
    private Date Fecha;
    private Cliente cliente;

    public Carrito(){}

    public Carrito(ArrayList<Componente> Lista_productos, Date Fecha, Cliente cliente){
        setLista_productos(Lista_productos);
        setFecha(Fecha);
        setCliente(cliente);
    }

    public ArrayList<Componente> getLista_productos() {
        return this.Lista_productos;
    }

    public void setLista_productos(ArrayList<Componente> Lista_productos) {
        if(Lista_productos!=null){
        this.Lista_productos = Lista_productos;
        }
        
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
        if(Lista_productos != null){
            for (int i = 0; i < Lista_productos.size(); i++) {
                if(Lista_productos.get(i).getCodigo_producto() == Codigo){
                    Lista_productos.remove(i);
                    //i = Lista_productos.size();
                    return true;
                } 
                
            }
            return false;
        }
        else return false;
    }

    public Venta comprar(Date fecha, String formaPago){
        if (Lista_productos != null){
            return new Venta(Lista_productos, new Date(), cliente,formaPago);
        }
        else return new Venta();
    }

    @Override
    public String toString(){
        double total=0.0;
        String texto = "\n\nCARRITO DE LA COMPRA DE "+ cliente.getNombre() + " " + cliente.getApellido() +  "\n__________________________________\n";           
        texto += "\nFabricante[Cod.Fab.] | Codigo de producto | Descripcion | Precio";
        texto += "\n";
            if(Lista_productos != null){
                for(int i = 0; i < Lista_productos.size(); i++) {
                    texto+=Lista_productos.get(i).toString()+"\n";
                    total+=Lista_productos.get(i).getPVP();
                }
                texto += "\n";
                texto+="TOTAL--------------------------------- "+total;
                texto += "\n";
                return texto;
             }

        else return "El carrito esta vacio.";   
    
    }


}