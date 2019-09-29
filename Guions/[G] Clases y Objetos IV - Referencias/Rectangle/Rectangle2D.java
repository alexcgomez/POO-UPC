/**
 * Rectangle2D
 */
public class Rectangle2D {

    private Punt2D punt;

    // Constructores

    public Rectangle2D(Punt2D p) {

        punt = new Punt2D(p);
    }

    public Rectangle2D(Rectangle2D R) {

        punt = R.getPunt();

    }


    // Metodos de clase

    public Punt2D getPunt() {
        return punt;
    }

    public void setPunt(Punt2D p) {
        punt = p;
    }

    public double area() {

        return Math.abs(punt.distanciaX(0) * punt.distanciaY(0));

    }

    public double perimetre() {

        return 2 * punt.distanciaX(0) + 2 * punt.distanciaY(0);
    }

    public void showDatos(){
        System.out.println("El area del rectagulo formado es: " + area());
        System.out.println("El perimetro del rectagulo formado es: " + perimetre());
    }
}