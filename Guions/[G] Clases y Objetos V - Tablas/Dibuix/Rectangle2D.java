public class Rectangle2D {
    
    // ATRIBUTOS
    private Punt2D punt1 , punt2;

    // CONSTRUCTORES
    public Rectangle2D (Punt2D a, Punt2D b) {	
		punt1 = new Punt2D(a);
		punt2 = new Punt2D(b);
	}
    public Rectangle2D(Rectangle2D R) {
        punt1 = R.getPunt1();
        punt2 = R.getPunt2();
    }
 
    // METODOS DE OBJETO

    // Getters
    public Punt2D getPunt1() {
        return punt1;
    }
    public Punt2D getPunt2() {
        return punt2;
    }
    
    // Setters
    public void setPunt1(Punt2D p) {
        punt1 = new Punt2D(p);
    }
    public void setPunt2(Punt2D p) {
        punt2 = new Punt2D(p);
    }
    
    // Metodos
    public double area() {
        return Math.abs(punt1.distanciaX(punt2)*punt1.distanciaY(punt2));
    }
    public double perimetre() {
        return (punt1.distanciaX(punt2)+punt2.distanciaY(punt2))*2;
    }
    public String toString() {
        return "El area del rectagulo formado es: " + area() + "\nEl perimetro del rectagulo formado es: " + perimetre();
    }
    
    
    
}