/**
 * Periferico
 */
public class Periferico extends Componente{

    private String puerto;

    public Periferico(String puerto) {
        this.puerto = puerto;
    }

    public Periferico(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, String puerto) {
        super(Codigo_producto, fabricante, Descripcion, PVP);
        this.puerto = puerto;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

}