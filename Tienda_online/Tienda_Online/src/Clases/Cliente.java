/**
 * Clientes
 */
public class Cliente{

    private int Codigo_Cliente;
    private String Nombre;
    private String Apellido;
    private String Tarjeta_Bancaria;

    public Cliente(){}

    public Cliente(int Codigo_Cliente, String Nombre, String Apellido, String Tarjeta_Bancaria){
        setCodigo_Cliente(Codigo_Cliente);
        setNombre(Nombre);
        setApellido(Apellido);
        setTarjeta_Bancaria(Tarjeta_Bancaria);
    }

    public int getCodigo_Cliente() {
        return this.Codigo_Cliente;
    }

    public void setCodigo_Cliente(int Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTarjeta_Bancaria() {
        return this.Tarjeta_Bancaria;
    }

    public void setTarjeta_Bancaria(String Tarjeta_Bancaria) {
        this.Tarjeta_Bancaria = Tarjeta_Bancaria;
    }

    @Override
    public String toString(){
        return "Cliente [Codigo]: " + Nombre + " " + Apellido + " [" + Codigo_Cliente + "]";
    }
    
}