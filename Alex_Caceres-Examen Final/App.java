/**
 * App
 */
public abstract class App implements Sistema_Puntuacion{
    
    private int Num_Usuarios;
    private double puntuacion_total;
    private double puntuacion_media;
    private String Nombre;
    private String Descripcion;
    private String Developer;
    private String Version;
    //private double Precio; --> Para cada App es diferente

    public App(String nombre, String descripcion, String developer, String version) {
        Nombre = nombre;
        Descripcion = descripcion;
        Developer = developer;
        Version = version;
        Num_Usuarios = 0;
        puntuacion_media = 0;
        puntuacion_total = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    @Override
    public String toString(){
        return "Nombre de la Aplicación: " + Nombre + "\n" 
            +  "Descripción: "  + Descripcion + "\n"
            +  "Desarrollador: " + Developer + "\n"
            +  "Versión: " + Version + "\n";

    }

    @Override
    public boolean equals(App a){
        if(a != null){
            if(a.getNombre() == getNombre() && a.getDeveloper() == getDeveloper() && a.getVersion() == getVersion()) return true;
        }
        return false;
    }

    public abstract double calcularPrecio();

    @Override
    public String mostrarPuntuaciones(){
        return "Puntuación: " + puntuacion_media + "\n"
            +  "Votos realizados: " + Num_Usuarios;
    }

    @Override
    public boolean puntuar(int p){
        if(p >= 0 && p <= 10){
            Num_Usuarios++;
            puntuacion_total += p;
            puntuacion_media = puntuacion_total/Num_Usuarios;
            return true;
        }
        return false;
    }

    @Override
    public double puntuacionMedia(){
        puntuacion_media = puntuacion_total/Num_Usuarios;
        return puntuacion_media;
    }

    @Override
    public double puntuacionMedia1to10(){
        return puntuacion_media/10;
    }
    





    
}