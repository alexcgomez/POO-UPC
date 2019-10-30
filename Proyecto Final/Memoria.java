/**
 * Memoria
 */
public class Memoria extends Componente{

    private int gigas;

    public Memoria(int gigas) {
        this.gigas = gigas;
    }

    public Memoria(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, int gigas) {
        super(Codigo_producto, fabricante, Descripcion, PVP);
        this.gigas = gigas;
    }

    public int getGigas() {
        return gigas;
    }

    public void setGigas(int gigas) {
        this.gigas = gigas;
    }
    


    
}