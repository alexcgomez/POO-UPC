/**
 * Empleados
 */
public class Empleados extends Persona{

    // ATRIBUTOS
    private int Nomina;

    // CONSTRUCTORS
    public Empleados(){
        Nomina = 0;
    }
    public Empleados(int dni, String Nom, int N){
        super(dni, Nom);
        setNomina(N);
    }

    // METODOS
    public int getNomina(){
        return Nomina;
    }
    public void setNomina(int N){
        Nomina = N;
    }

    public String toString(){
        return super.toString() + "Nomina Mensual: " + getNomina();
    }
    
}