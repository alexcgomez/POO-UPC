/**
 * Empleados Complemento
 */
public class EmpleadoCom extends Empleado{

    // ATRIBUTOS
    private int Complemento;

    // CONSTRUCTORS
    public EmpleadoCom(){}
    public EmpleadoCom(int dni, String Nom, String a1, String a2, int N, int C){
        super(dni, Nom, a1, a2, N);
        setComplemento(C);
    }

    // METODOS
    public int getComplemento(){
        return Complemento;
    }
    public void setComplemento(int C){
        Complemento = C;
    }
    public int nominaMensual(){
        return super.nominaMensual()+Complemento;
    }
    public String toString(){
        return super.toString();
    }
    
}