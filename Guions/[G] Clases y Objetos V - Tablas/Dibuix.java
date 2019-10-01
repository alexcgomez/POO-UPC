/**
 * Dibuix
 */
public class Dibuix {

    private int Color;
    private Rectangle2D rectangles[];
    private int max_rec;

    public Dibuix(Rectangle2D rectangles[]){

        this.rectangles = new Rectangle2D[max_rec];

        if (rectangles.length <= 100){
            this.rectangles = rectangles;
        }
        else for (int i = 0; i < 100; i++) {
            this.rectangles[i] = rectangles[i];
        }
    }

    public void setColor(int Color){
        this.Color = Color;
    }

    public void setMaxRectangles(int max_rec){
        this.max_rec = max_rec;
    }

    public int getColor(){
        return Color;
    }

    public int getMaxRectangles(){
        return max_rec;
    }
    
    public Rectangle2D getRectangle(int i){
        return rectangles[i];
    }

    public int num_Rectangles(){
        return rectangles.length;
    }
}