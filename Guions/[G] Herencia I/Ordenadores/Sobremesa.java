/**
 * Sobremesa
 */
public class Sobremesa extends Ordenador{

    // ATRIBUTOS

    private String Monitor;

    // CONSTRUCTORES

    public Sobremesa(){
        Monitor = "Sin Monitor";
    };
    public Sobremesa(String M){
        setMonitor(M);
    }

    // METODOS

        // Getters
    public String getMonitor(){
        return Monitor;
    }

        // Setters
    public void setMonitor(String M){
        Monitor = M;
    }
    
        // Metodos de Objeto
    public String toString(){
        return super.toString() + "Monitor : " + getMonitor() + "\n";
    }

}