/**
 * Empleados
 */
public class Empleado extends Persona{

    // ATRIBUTOS
    private int Nomina;

    // CONSTRUCTORS
    public Empleado(){}
    public Empleado(int dni, String Nom, String a1, String a2, int N){
        super(dni, Nom, a1, a2);
        setNomina(N);
    }

    // METODOS
    public int getNomina(){
        return Nomina;
    }
    public void setNomina(int N){
        Nomina = N;
    }
    public int nominaMensual(){
        return Nomina;
    }
    public String toString(){
        return "DNI: " + super.getDni() + "\n" + "Nombre y Apellidos: " + super.getNombre() + " " + super.getApellido1() + " " + super.getApellido2() + " ";
    }
    
}