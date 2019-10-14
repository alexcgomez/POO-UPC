/**
 * StartupServicios
 */
public class StartupServicios extends Startup{

    private boolean Callcenter;


    public StartupServicios(String C, String N, double Cap, double Inv, int T, String Des, Boolean Call){
        super(C,N,Cap,Inv,T,Des);
        Callcenter = Call;
    }

    public boolean getCallcenter() {
        return this.Callcenter;
    }

    public void setCallcenter(boolean Callcenter) {
        this.Callcenter = Callcenter;
    }


    
}