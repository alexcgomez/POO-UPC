package Examen;

/**
 * Componente
 */
public class Componente {

    private Fabricante Fab_Comp;
    private int Cod_Comp;
    private String Des_Comp;
    private double Pvp_Comp;

    // CONSTRUCTORES

    public Componente(Fabricante F, int C, String D, double P){
        setFab(F);
        setCod(C);
        setDes(D);
        setPVP(P);
    }

    public Componente(Componente C){
        setFab(C.getFab());
        setCod(C.getCod());
        setDes(C.getDes());
        setPVP(C.getPVP());
    }



    // METODOS DE CLASE

    // Getters
    public Fabricante getFab(){return Fab_Comp;}
    public int getCod(){return Cod_Comp;}
    public String getDes(){return Des_Comp;}
    public double getPVP(){return Pvp_Comp;}

    // Setters
    public void setFab(Fabricante F){Fab_Comp = new Fabricante(F);}
    public void setCod(int C){Cod_Comp = C;}
    public void setDes(String D){Des_Comp = D;}
    public void setPVP(double P){Pvp_Comp = P;}
    
    // Metodos
    public String toString(){
        return "Producto: " + getCod() + " - " + getDes() + "\n" +
        "Precio: " + getPVP() + "\n" + 
        Fab_Comp.toString();
    }

}