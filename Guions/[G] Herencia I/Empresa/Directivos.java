/**
 * Directivos
 */
public class Directivos extends EmpleadosCom {

    private int CompDir;

    public Directivos(){
        CompDir = 0;
    }
    public Directivos(int dni, String Nom, int N, int C,int plusDir){
        super(dni, Nom, N, C);
        setCompDir(plusDir);
    }

    public int getCompDir(){
        return CompDir;
    }
    public void setCompDir(int C){
        CompDir = C;
    }

    public String toString(){
        return super.toString() + CompDir;
    }

}