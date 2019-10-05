package Dibuix;

import java.util.ArrayList;

public class Dibuix {

    // ATRIBUTOS
    ArrayList<Rectangle2D> taula_rectangle = new ArrayList<Rectangle2D>();
    private int max_rec = 100;
    private int color;

    // CONSTRUCTORES
    public Dibuix(ArrayList<Rectangle2D> llista_rectangle) {
        setRectangles(llista_rectangle);
    }

    // METODOS DE OBJETO

    // Getters
    public Rectangle2D getRectangles(int i) {
        return taula_rectangle.get(i);
    }
    public int getColor() {
        return color;
    }
    public int getMaxRec() {
        return max_rec;
    }
    public int getNumRec() {
        return taula_rectangle.size();
    }
    
    // Setters
    public void setRectangles(ArrayList<Rectangle2D> llista_rectangle) {
        if (llista_rectangle.size() <= max_rec) {
            for (int i = 0; i < llista_rectangle.size(); i++) {
                taula_rectangle.add(llista_rectangle.get(i));
            }
        }
        else {
            for (int i = 0; i < max_rec; i++) { 
                taula_rectangle.add(llista_rectangle.get(i));
            }
        }
    }
    public void setColor(int c) {
        color = c;
    }
    public void setMaxRec() {
        max_rec = 100;
    }
    
    // Metodos
    public void addRec(Rectangle2D rectangle){               
        if(taula_rectangle.size()<max_rec){
            taula_rectangle.add(rectangle);
        }

        else System.out.println("La tabla esta llena!");
    }
    public void deleteRec(int c){
        taula_rectangle.remove(c);
    }
    public void subRec(int c, Rectangle2D rectangle){
       taula_rectangle.set(c, rectangle);
    }
    
}
