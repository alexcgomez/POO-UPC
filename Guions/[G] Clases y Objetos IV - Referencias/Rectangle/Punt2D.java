/**
 * Punt2D
 */
import java.util.Scanner;

public class Punt2D {

    private double x_cor,y_cor;


    // Constructor
    public Punt2D(double x , double y){
        setX_Cor(x);
        setY_Cor(y);
    }
    // Constructor de copia
    public Punt2D(Punt2D P){
        setX_Cor(P.getX_Cor());
        setY_Cor(P.getY_Cor());
    }
    // Constructor sense parametres
    public Punt2D(){
        setX_Cor(0);
        setY_Cor(0);
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

    // Distancia X amb Punt2D per parametre
    public double distanciaX(Punt2D punt){
        double distX;
        distX = x_cor - punt.getX_Cor();
        return distX;
    }

    // Distancia X amb double per parametre
    public double distanciaX(double x){
        double distX;
        distX = x_cor - x;
        return distX;
    }

    // Distancia Y amb Punt2D per parametre
    public double distanciaY(Punt2D punt){
        double distY;
        distY = y_cor - punt.getY_Cor();
        return distY;
    }

    // Distancia Y amb double per parametre
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

    public void insertCor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la coordenada X: ");
        setX_Cor(scan.nextDouble());
        System.out.println("Introduce la coordenada Y: ");
        setY_Cor(scan.nextDouble());
        scan.close();
    }

}