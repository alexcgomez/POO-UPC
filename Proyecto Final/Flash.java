/**
 * Flash
 */
public class Flash extends Memoria{

    private double velocidad;

    public Flash(int gigas, double velocidad) {
        super(gigas);
        this.velocidad = velocidad;
    }

    public Flash(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, int gigas,
            double velocidad) {
        super(Codigo_producto, fabricante, Descripcion, PVP, gigas);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
}