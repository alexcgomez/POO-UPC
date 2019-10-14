/**
 * StartupTIC
 */
public class StartupTIC extends StartupTecnologica{

    private double Costo= 2300;

    public StartupTIC(String C, String N, double Cap, double Inv, int T, String Des,int pat, int valor){
        super(C,N,Cap,Inv,T,Des,pat,valor);
    }


    public double getCosto() {
        return this.Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    @Override
    public double calculoInmobilizadoMaterial(){
        return Costo;
    }

    
}