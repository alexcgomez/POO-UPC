/**
 * Joc_Tresor 3: Implementació de modificacions Sobrecàrrega de constructors i
 * métodes
 *
 */

public class TesoroIV {

    // Atributos
    private String Descripcion;
    private int Altura;
    private double Valor;
    private static double Limite_valor = 150;
    private Punt2D Punt;
    private String nombre;

    // Constructores
    public TesoroIV() {
    };

    public TesoroIV(String D, int A, Double V) {
        setDescripcion(D);
        setAltura(A);
        setValor(V);
    }

    public TesoroIV(Punt2D punt, String D, int A, Double V) {
        setDescripcion(D);
        setAltura(A);
        setValor(V);
        Punt = new Punt2D(punt);
    }

    // Metodos de clase
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getAltura() {
        return Altura;
    }

    public double getValor() {
        return Valor;
    }

    public double getLimite_valor() {
        return Limite_valor;
    }

    public Punt2D getPunt() {
        return Punt;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setDescripcion(String D) {
        Descripcion = D;
    }

    public void setAltura(int A) {
        Altura = A;
    }

    public void setValor(double V) {
        if (V > 0)
            Valor = V;
    }

    public void setPunt(Punt2D punt) {
        Punt = new Punt2D(punt);
    }

    public void ActuTesoro(String D, double V) {
        setDescripcion(D);
        setValor(V);
    }

    public boolean esValioso() {
        return Valor >= Limite_valor;

    }

    public void showTesoro() {

        if (nombre == null) {
            System.out.println("Tesoro");
            System.out.println("            Descripcion: " + getDescripcion());
            System.out.println("            Altura: " + getAltura());
            System.out.println("            Valor: " + getValor());
            System.out.println("            Coordenadas: " + getPunt().toString());
        }
            else{
                System.out.println("Tesoro" + nombre);
                System.out.println("            Descripcion: " + getDescripcion());
                System.out.println("            Altura: " + getAltura());
                System.out.println("            Valor: " + getValor());
                System.out.println("            Coordenadas: " + getPunt().toString());
            }        
    }

    // Metodos sobrecargados
    public boolean esMasValioso(Tesoro2 t) {
        return Valor > t.getValor();
    }

    public boolean esMasValioso(Double valor) {
        return Valor > valor;
    }

    public double distancia(TesoroIV t) {
        //double dist = this.Punt.distanciapunt(t.Punt);
        return dist;
    }

    public double distancia(Punt2D p) {
        //double dist = Punt.distanciapunt(p);
        return dist;
    }
}