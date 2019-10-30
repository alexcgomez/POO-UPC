/**
 * Impresoras
 */
public class Impresoras extends Periferico{

        private String tipo_impresion;

    public Impresoras(String puerto, String tipo_impresion) {
        super(puerto);
        this.tipo_impresion = tipo_impresion;
    }

    public Impresoras(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, String puerto,
            String tipo_impresion) {
        super(Codigo_producto, fabricante, Descripcion, PVP, puerto);
        this.tipo_impresion = tipo_impresion;
    }

    public String getTipo_impresion() {
        return tipo_impresion;
    }

    public void setTipo_impresion(String tipo_impresion) {
        this.tipo_impresion = tipo_impresion;
    }



    
}