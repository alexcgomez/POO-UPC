public class Tesoro{
    
    public String Descripcion;
    public int Altura;
    public float Valor;
    public bool esValioso;

    public static int  Limite_valor = 150;
    
    public Tesoro(String D,int A, float V) {
        Descripcion = D;
        Altura = A;
        Valor = V;                
    }

    public void ActuTesoro(String D, double V){
        Descripcion = D;
        Valor = V;
    }

    public boolean esValioso(){
        if (Valor >= Limite_valor) this.esValioso = true;
        else this.esValioso = false;
    }

}