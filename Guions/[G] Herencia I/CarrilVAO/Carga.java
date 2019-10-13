/**
 * Carga
 */
public class Carga extends Vehiculo{

    private boolean permiso =  false;


    public Carga(){}
    public Carga(String M, int N,boolean p){
        super(M,N);
    }

    public void setPermiso(boolean p){
        permiso = p;
    }
    public boolean getPermiso(){
        return permiso;
    }


    public String potCircular(int hora, int ocupantes){
        
        if (super.potCircular(hora,ocupantes) == "No" && permiso == true){
            return "Si";
        }

        else if(super.potCircular(hora,ocupantes)=="Si") return "Si";
        else return "No";  
    
    }
}