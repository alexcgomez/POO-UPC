/**
 * Punt2D
 */
public class Punt2D {

    // Atributos
    private double x_cor,y_cor;

    // Constructores
    public Punt2D(double x , double y){
        setX_Cor(x);
        setY_Cor(y);
    }
    public Punt2D(Punt2D P){
        setX_Cor(P.getX_Cor());
        setY_Cor(P.getY_Cor());
    }
    public Punt2D(){
        setX_Cor(0);
        setY_Cor(0);
    }
    
    // Metodos de clase
    public double getX_Cor(){
        return x_cor;
    }
    public double getY_Cor(){
        return y_cor;
    }
    public void setX_Cor(double x){
        x_cor = x;
    }
    public void setY_Cor(double y){
        y_cor = y;
    }
    public double distanciaX(Punt2D punt){
        double distX;
        distX = x_cor - punt.getX_Cor();
        return distX;
    }
    public double distanciaX(double x){
        double distX;
        distX = x_cor - x;
        return distX;
    }
    public double distanciaY(Punt2D punt){
        double distY;
        distY = y_cor - punt.getY_Cor();
        return distY;
    }
    public double distanciaY(double y){
        double distY;
        distY = y_cor - y;
        return distY;
    }
    public double distanciapunt(double x , double y){
        double Distancia,dist_x,dist_y;
        dist_x = distanciaX(x);
        dist_y = distanciaY(y);
        Distancia = Math.sqrt(Math.pow(dist_x, 2)+Math.pow(dist_y, 2));
        return Distancia;
    }
    public double distanciapunt(Punt2D p){
        double dist = distanciapunt(distanciaX(p), distanciaY(p));
        return dist;
    }
    public String toString(){
        String string_punt;
        string_punt = "(" + x_cor + "," + y_cor + ")"; 
        return string_punt;
    }
}