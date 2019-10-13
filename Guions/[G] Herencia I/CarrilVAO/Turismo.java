/**
 * Turismo
 */
public class Turismo extends Vehiculo{

    
    public Turismo(){}
    public Turismo(String M, int N){
        super(M,N);
    }

    public String potCircular(int hora, int ocupantes){
        String puede = super.potCircular(hora, ocupantes);
        if (puede == "No"){
            if(ocupantes >= super.getNumPlazas()*0.5){
                puede = "Si";
            }
            else puede = "No";
        }
        return puede;
    }
    
}