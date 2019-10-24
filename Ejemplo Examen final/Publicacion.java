/**
 * Publicacion
 */
public abstract class Publicacion {

    private int CodigoPub;
    private String Descripcion;
    private static int dias_max = 15;
    private boolean prestado = false;

    public Publicacion(int codigoPub, String descripcion) {
        CodigoPub = codigoPub;
        Descripcion = descripcion;
    }

    public int getCodigoPub() {
        return CodigoPub;
    }

    public void setCodigoPub(int codigoPub) {
        CodigoPub = codigoPub;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String toString(){
        return "Publicación: [Código = " + CodigoPub + ", Descripción: " + Descripcion + " ]";
    }

    public boolean isPrestado(){
        return prestado;
    }

    public boolean prestar(){
        if(!isPrestado()){
            prestado = true;
            return prestado;
        }
        return false;
    }

    public int devolver(int num_dias){
        
 


        
        
        return 0;


    }








}