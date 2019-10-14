/**
 * StartupBiotecnologica
 */
public class StartupBiotecnologica extends StartupTecnologica{

    private String Ambito;
    private double ValorLab;

   

    public StartupBiotecnologica(String C, String N, double Cap, double Inv, int T, String Des,int pat, double valor, String A, double V){
        super(C,N,Cap,Inv,T,Des,pat,valor);
        Ambito = A;
        ValorLab = V;
    }

    
    public String getAmbito() {
        return this.Ambito;
    }

    public void setAmbito(String Ambito) {
        if(Ambito == "Blanca" || Ambito == "Verde" || Ambito == "Azul"|| Ambito == "Gris")this.Ambito = Ambito;
        
    }

    public double getValorLab() {
        return this.ValorLab;
    }

    public void setValorLab(int ValorLab) {
        this.ValorLab = ValorLab;
    }

    @Override
    public double calculoInmobilizadoMaterial(){
        return ValorLab;
    }
    
}