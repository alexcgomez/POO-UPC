/**
 * Punt2D
 */
public class Punt2D {

    private double x_cor,y_cor;

    public Punt2D(double x , double y){
        setX_Cor(x);
        setY_Cor(y);
    }
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
    public double DistanciaX(Punt2D punt){
        double distX;
        distX = x_cor - punt.getX_Cor();
        return distX;
    }
    public double DistanciaY(Punt2D punt){
        double distY;
        distY = y_cor - punt.getY_Cor();
        return distY;
    }
    public double Distanciapunt(Punt2D Punt1 , Punt2D Punt2){
        double Distancia;
        Distancia = Math.abs(Math.sqrt(Math.pow(Punt1.DistanciaX(Punt2), 2)+Math.pow(Punt1.DistanciaY(Punt2), 2)));
        return Distancia;
    }


}