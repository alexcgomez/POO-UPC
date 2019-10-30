/**
 * Ratones
 */
public class Ratones extends Periferico{

    private int num_botones;

    public Ratones(String puerto, int num_botones) {
        super(puerto);
        this.num_botones = num_botones;
    }

    public Ratones(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, String puerto,
            int num_botones) {
        super(Codigo_producto, fabricante, Descripcion, PVP, puerto);
        this.num_botones = num_botones;
    }

    public int getNum_botones() {
        return num_botones;
    }

    public void setNum_botones(int num_botones) {
        this.num_botones = num_botones;
    }


    
}