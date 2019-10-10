/**
 * Directivos
 */
public class Directivo extends EmpleadoCom {

    // ATRIBUTOS
    private int CompDir;
    
    // CONSTRUCTORS
    public Directivo(){}
    public Directivo(int dni, String Nom, String a1, String a2, int N, int C,int plusDir){
        super(dni, Nom, a1, a2, N, C);
        setCompDir(plusDir);
    }
        
    // METODOS
    public int getCompDir(){
        return CompDir;
    }
    public void setCompDir(int C){
        CompDir = C;
    }
    public int nominaMensual(){
        return super.nominaMensual()+CompDir;
    }
  

}