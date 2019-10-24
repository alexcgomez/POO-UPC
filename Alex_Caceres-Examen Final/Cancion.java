/**
 * Cancion
 */
public class Cancion implements Sistema_Puntuacion{
    private int estrelles_totales;

    // Esto no es necesario se podria haber hecho con un array usuarios[] pero ya no me da tiempo de cambiarlo, lo dejo asi.
    private int usuarios0;
    private int usuarios1;
    private int usuarios2;
    private int usuarios3;
    private int usuarios4;
    private int estrelles_media;
    private String Titulo;
    private String Cantante;
    private double Precio;

    public Cancion(String titulo, String cantante, double precio) {
        Titulo = titulo;
        Cantante = cantante;
        Precio = precio;
        estrelles_totales = 0;
        usuarios0 = 0;
        usuarios1 = 0;
        usuarios2 = 0;
        usuarios3 = 0;
        usuarios4 = 0;
        estrelles_media = 0;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCantante() {
        return Cantante;
    }

    public void setCantante(String cantante) {
        Cantante = cantante;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString(){
        return "Titulo de la cancion: " + Titulo + "\n"
            +  "Autor: " + Cantante + "\n"
            +  "Precio: " + Precio;
    }

    @Override 
    public boolean equals(Cancion c){
        if(c != null){
            if(c.getTitulo() == getTitulo() && c.getCantante() == getCantante()) return true;
        }
        return false;
    }


    @Override
    public String mostrarPuntuaciones(){
        return "Puntuación: " +  "\n"
            +  "0*    " + usuarios0 + "\n"
            +  "1*    " + usuarios1 + "\n"
            +  "2*    " + usuarios2 + "\n"
            +  "3*    " + usuarios3 + "\n"
            +  "4*    " + usuarios4 + "\n";
            
    }

    @Override
    public boolean puntuar(int p){
        if(p >= 0 && p <=4){
            if(p == 0){
                usuarios0++;
                estrelles_totales += 0;
                return true;}
            else if(p == 1){
                usuarios1++;
                estrelles_totales += 1;
                return true;
            }
            else if(p == 2){
                usuarios2++;
                estrelles_totales += 2;
                return true;
            }
            else if(p == 3){
                usuarios3++;
                estrelles_totales += 3;
                return true;
            }
            else if(p == 4){
                usuarios4++;
                estrelles_totales += 4;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public double puntuacionMedia(){
        estrelles_media = estrelles_totales/(usuarios0+usuarios1+usuarios2+usuarios3+usuarios4);
        return estrelles_media;
    }

    @Override
    public double puntuacionMedia1to10(){
        return estrelles_media/4;
    }
    


}