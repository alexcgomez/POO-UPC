/**
 * StartupTecnologica
 */
public class StartupTecnologica extends Startup{

    private int patentes;
    private double valormediopat;

    

    public StartupTecnologica(String C, String N, double Cap, double Inv, int T, String Des,int pat, double valor){
        super(C,N,Cap,Inv,T,Des);
        patentes = pat;
        valormediopat = valor;
    }


    public int getPatentes() {
        return this.patentes;
    }

    public void setPatentes(int patentes) {
        this.patentes = patentes;
    }

    public double getValormediopat() {
        return this.valormediopat;
    }

    public void setValormediopat(int valormediopat) {
        this.valormediopat = valormediopat;
    }

    @Override
    public double calculoInmobilizadoInmaterial(){
        return patentes;
    }
    
}