package Examen;

/**
 * Fabricante
 */
public class Fabricante {

    private int Cod_Fab, Tel_Fab;
    private String Nom_Fab;


    // Constructores


    public Fabricante(int C,int T, String N){
        setCod(C);
        setNom(N);
        setTel(T);
    }

    public Fabricante(Fabricante F){
        setCod(F.getCod());
        setTel(F.getTel());
        setNom(F.getNom());
    }

    // METODOS DE CLASE

    // Getters
    public int getCod(){return Cod_Fab;}
    public int getTel(){return Tel_Fab;}
    public String getNom(){return Nom_Fab;}
    // Setters
    public void setCod(int C){Cod_Fab = C;}
    public void setTel(int T){Tel_Fab = T;}
    public void setNom(String N){Nom_Fab = N;}

    // Metodos
    public String toString(){
        return "Fabricante: " + getNom() + " (" + getCod() + ") ";
    }
}