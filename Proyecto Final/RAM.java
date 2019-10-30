/**
 * RAM
 */
public class RAM extends Memoria{

    private String tipo;

    public RAM(int gigas, String tipo) {
        super(gigas);
        this.tipo = tipo;
    }

    public RAM(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, int gigas, String tipo) {
        super(Codigo_producto, fabricante, Descripcion, PVP, gigas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}