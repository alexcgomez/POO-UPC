/**
 * Dibuix
 */
public class Dibuix {

    private int Color;
    private Rectangle2D rectangles[];
    private int max_rec = 100;

    public Dibuix(Rectangle2D rectangles[]){

        this.rectangles = new Rectangle2D[max_rec];

        if (rectangles.length <= max_rec){
            for (int i = 0; i < rectangles.length; i++) {
                this.rectangles[i] = new Rectangle2D(rectangle[i]);
            }
        }
        else for (int i = 0; i < max_rec; i++) {
            this.rectangles[i] = new Rectangle2D(rectangles[i]);
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