import java.util.ArrayList;

/**
 * TopTen
 */
public class TopTen {

    private ArrayList<Sistema_Puntuacion> top = new ArrayList<Sistema_Puntuacion>(10);

    public TopTen(ArrayList<Sistema_Puntuacion> e) {
        setTop(e);
    }

    public ArrayList<Sistema_Puntuacion> getTop() {
        return top;
    }

    public void setTop(ArrayList<Sistema_Puntuacion> top) {
        this.top = top;
    }


    public void actualizarTop(App a){
        for (int i = 0; i < top.size(); i++) {
            if(a.puntuacionMedia1to10()> top.get(i).puntuacionMedia1to10())top.add(i,a);
        }
    }

    public String listaTop(){
        String t ="";
        for (int i = 0; i < top.size(); i++) {
            t += top.get(i) + "\n";
            t += "Puntuación media: " + top.get(i).puntuacionMedia() + "\n" ;
        }
        return t;
    }

  
}