public class Tesoro{
    
    public String Descripcion;
    public int Altura;
    public double Valor;
    public Boolean esValioso;

    public static int  Limite_valor = 150;
    
    public Tesoro(String D,int A, Double V) {
        Descripcion = D;
        Altura = A;
        Valor = V;                
    }

    public void ActuTesoro(String D, double V){
        Descripcion = D;
        Valor = V;
    }

    public boolean esValioso(){
        return Valor>=Limite_valor;
    }

}