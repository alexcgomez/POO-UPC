/**
 * StartupTIC
 */
public class StartupTIC extends StartupTecnologica{

    private static double Costo= 2300;

    public StartupTIC(String C, String N, double Cap, double Inv, int T, String Des,int pat, int valor){
        super(C,N,Cap,Inv,T,Des,pat,valor);
    }


    public static double getCosto() {
        return Costo;
    }

    public static void setCosto(int C) {
        Costo = C;                              // Porque no this???
    }

    @Override
    public double calculoInmobilizadoMaterial(){
        return Costo;
    }

    
}