/**
 * PlacaBase
 */
public class PlacaBase extends Componente{

    private String procesador;
    private int ancho;
    private int largo;
    private String TipoRanura;

    public PlacaBase(String procesador, int ancho, int largo, String tipoRanura) {
        this.procesador = procesador;
        this.ancho = ancho;
        this.largo = largo;
        TipoRanura = tipoRanura;
    }

    public PlacaBase(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, String procesador,
            int ancho, int largo, String tipoRanura) {
        super(Codigo_producto, fabricante, Descripcion, PVP);
        this.procesador = procesador;
        this.ancho = ancho;
        this.largo = largo;
        TipoRanura = tipoRanura;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getTipoRanura() {
        return TipoRanura;
    }

    public void setTipoRanura(String tipoRanura) {
        TipoRanura = tipoRanura;
    }
}