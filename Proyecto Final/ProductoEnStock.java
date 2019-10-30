/**
 * ProductoEnStock
 */
public class ProductoEnStock {

    private Componente producto;
    private int Stock;
    private int reservados;

    public ProductoEnStock(Componente producto, int stock, int reservados) {
        this.producto = producto;
        Stock = stock;
        this.reservados = reservados;
    }

    public Componente getProducto() {
        return producto;
    }

    public void setProducto(Componente producto) {
        this.producto = producto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getReservados() {
        return reservados;
    }

    public void addReservados() {
        this.reservados++;
    }

    @Override
    public String toString(){
        return "Producto: " + producto.getDescripcion() + "\n" + 
                "Unidades en stock: " + Stock + "\n" +
                "Unidades reservadas: " + reservados;
    }
}