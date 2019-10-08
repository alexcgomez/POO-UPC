/**
 * Ordenador
 */
public class Ordenador {

    // ATRIUBUTOS

    private String Procesador;
    private Double VelocidadCPU;
    private int MemoriaRAM;


    // CONSTRUCTORES

    public Ordenador(){
        Procesador = " - ";
        VelocidadCPU = 0.0;
        MemoriaRAM = 0;
    }
    public Ordenador(String P, Double V,int M){
        setProcesador(P);
        setVelocidadCPU(V);
        setMemoriaRAM(M);
    }

    // METODOS

        // Getters
    public String getProcesador(){
        return Procesador;
    }
    public Double getVelocidadCPU(){
        return VelocidadCPU;
    }
    public int getMemoriaRAM(){
        return MemoriaRAM;
    }
    
        // Setters
    public void setProcesador(String P){
        Procesador = P;
    }
    public void setVelocidadCPU(Double V){
        VelocidadCPU = V;
    }
    public void setMemoriaRAM(int M){
        MemoriaRAM = M;
    }
    
        // Metodos de Objeto
    public String toString(){
        return "Procesador: " + getProcesador() + "\n" + "Velocidad: " + getVelocidadCPU() + " GHz\n" + "Memoria RAM: " + getMemoriaRAM() + " GB\n";
    }



    
}