/**
 * App_Pago
 */
public class App_Pago extends App{

    private double precio;

    public App_Pago(String nombre, String descripcion, String developer, String version, double precio) {
        super(nombre, descripcion, developer, version);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return super.toString() 
            +  "Precio: " + precio + "\n";

    }

    @Override
    public double calcularPrecio(){
        return precio;
    }
    
}