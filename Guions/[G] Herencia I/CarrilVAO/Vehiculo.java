/**
 * Vehiculo
 */
public class Vehiculo {

    private String Matricula;
    private int numPlazas;

    // Constructores
    public Vehiculo(){}
    public Vehiculo(String M, int N){
        setMatricula(M);
        setNumPlazas(N);
    }


    // Getters y Setters
    public String getMatricula(){
        return Matricula;
    }
    public int getNumPlazas(){
        return numPlazas;
    }
    public void setMatricula(String M){
        Matricula = M;
    }
    public void setNumPlazas(int N){
        numPlazas = N;
    }
    
    // Metodos
    public String potCircular(int hora, int o){
        if(hora >= 22 && hora <= 6){
            return "Si";
        }
        else return "No";
    }
}