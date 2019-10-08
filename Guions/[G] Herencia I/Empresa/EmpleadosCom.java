/**
 * Empleados Complemento
 */
public class EmpleadosCom extends Empleados{

    // ATRIBUTOS
   
    private int Complemento;

    // CONSTRUCTORS
    public EmpleadosCom(){
        Complemento = 0;
    }
   
    public EmpleadosCom(int dni, String Nom, int N, int C){
        super(dni, Nom, N);
        setComplemento(C);
    }

    // METODOS

    public int getComplemento(){
        return Complemento;
    }
    public void setComplemento(int C){
        Complemento = C;
    }
    public String toString(){
        return super.toString() + getComplemento();
    }
    
}