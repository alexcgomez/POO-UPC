package Examen;

/**
 * Cliente
 */
public class Cliente {

    private int Cod_Cte;
    private String Nom_Cte, Ape_Cte, Tar_Ban;

    // Constructores
    public Cliente(int C, String N, String A, String T){
        setCod(C);
        setNom(N);
        setApe(A);
        setTar(T);
    }

    public Cliente(Cliente C){
        setCod(C.getCod());
        setNom(C.getNom());
        setApe(C.getApe());
        setTar(C.getTar());
    }



    // METODOS DE CLASE

    //Getters
    public int getCod(){return Cod_Cte;}
    public String getNom(){return Nom_Cte;}
    public String getApe(){return Ape_Cte;}
    public String getTar(){return Tar_Ban;}
    //Setters
    public void setCod(int C){Cod_Cte = C;}
    public void setNom(String N){Nom_Cte = N;}
    public void setApe(String A){Ape_Cte = A;}
    public void setTar(String T){Tar_Ban = T;}

    // Metodos


}