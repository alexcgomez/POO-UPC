/**
 * Dibuix
 */
public class Dibuix {

    private Rectangle2D taula_rectangle[];
    private int num_max = 100, color, num_rec;

    // Constructor
    public Dibuix(Rectangle2D llista_rectangle[], int color) {
        this.color = color;

        taula_rectangle = new Rectangle2D[num_max];

        if (llista_rectangle.length <= num_max) {
            for (int i = 0; i < llista_rectangle.length; i++) {
                num_rec = i; // Contador de rectangulos en array
                taula_rectangle[i] = new Rectangle2D(llista_rectangle[i]);
            }
        }

        else {
            for (int i = 0; i < num_max; i++) {
                num_rec = i; // Contador de rectangulos en array
                taula_rectangle[i] = new Rectangle2D(llista_rectangle[i]);
            }
        }
    }

    // GETTERS Y SETTERS

    public void setRectangles() {

    }

    public void setColor() {

    }

    public void setMaxRec() {

    }

    public void setNumRec(){

    }

    public Rectangle2D getRectangles() {

    }

    public int getColor() {

    }

    public int getMaxRec() {

    }

    public int getNumRec() {

    }

    // METODOS DE CLASE

    public void addRec(Rectangle2D rectangle){                      // Sumamos contador y añadimos objeto
        if(num_rec<num_max){
            num_rec++;
            taula_rectangle[num_rec] = new Rectangle2D(rectangle);
        }

        else System.out.println("La tabla esta llena!");
    }

    public void deleteRec(int c){
        
        if (c < num_rec){
            for (int i = c; i <= num_rec; i++) {
                taula_rectangle[i] = taula_rectangle[i++];
            }
            //taula_rectangle[num_rec] = taula_rectangle[num_rec++];// hago que valga lo del siguiente (nulo)
            num_rec--;//luego resto uno del numero de rectangulo
        }
        
        else (c == num_rec){

        }
    }

    public void subRec(int c, Rectangle2D rectangle){
        taula_rectangle[c] = new Rectangle2D(rectangle);
    }
    
}
