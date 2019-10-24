/**
 * App_Gratuita
 */
public class App_Gratuita extends App {

    private String Patrocinador;
    private String Publicidad = "Haz click en el enlace para obtener más juegos!!";

    public App_Gratuita(String nombre, String descripcion, String developer, String version,String patrocinador) {

        super(nombre, descripcion, developer, version); 
        Patrocinador = patrocinador;
    }

    public String getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }

    public String getPatrocinador() {
        return Patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        Patrocinador = patrocinador;
    }
    
    public void publicidad(){
       System.out.println(Publicidad);
    }
    
    @Override
    public String toString(){
        return super.toString() 
            +  "Patrocinador: " + Patrocinador + "\n"
            +  "Publicidad: "  + Publicidad;

    }

    @Override
    public double calcularPrecio(){
        return 0;
    }

}