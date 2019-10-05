package Dibuix;

import java.util.Scanner;

public class Punt2D {

    // ATRIBUTOS
    private double x_cor, y_cor;


    // CONSTRUCTORES
    public Punt2D(double x , double y){ 
        setX_Cor(x);
        setY_Cor(y);
    }
    public Punt2D(Punt2D P){
        setX_Cor(P.x_cor);
        setY_Cor(P.y_cor);
    }
    public Punt2D(){
        x_cor = 0;
        y_cor = 0;
    }

    // METODOS DE OBJETO

    // Getters
    public double getX_Cor(){
        return x_cor;
    }
    public double getY_Cor(){
        return y_cor;
    }
    
    // Setters
    public void setX_Cor(double x){
        x_cor = x;
    }
    public void setY_Cor(double y){
        y_cor = y;
    }

    // Metodos
    public double distanciaX(Punt2D P){
        return Math.abs(x_cor-P.x_cor);
    }
    public double distanciaX(double x){
        return Math.abs(x_cor-x);
    }
    public double distanciaY(Punt2D P){
        return Math.abs(x_cor-P.x_cor);
    }
    public double distanciaY(double y){
        return Math.abs(y_cor-y);
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