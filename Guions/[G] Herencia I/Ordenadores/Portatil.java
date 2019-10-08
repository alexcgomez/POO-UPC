/**
 * Portatil
 */
public class Portatil extends Ordenador{

    // ATRIBUTOS

    private Double Peso;
    private int Autonomia;

    // CONSTRUCTORES

    public Portatil(){
        Peso = 0.0;
        Autonomia = 0;
    };
    public Portatil(Double P ,int A){
        setPeso(P);
        setAutonomia(A);
    }

    // METODOS

        // Getters
    public Double getPeso(){
        return Peso;
    }
    public int getAutonomia(){
        return Autonomia;
    }
        // Setters
    public void setPeso(Double P){
        Peso = P;
    }
    public void setAutonomia(int A){
        Autonomia = A;
    }
    
        // Metodos de Objeto
    public String toString(){
        return super.toString() + "Peso : " + getPeso() + " Kg\n" + "Autonomia: " + getAutonomia() + " Horas\n";
    }

}