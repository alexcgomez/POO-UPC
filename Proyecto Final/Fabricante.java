/**
 * Fabricante
 */
public class Fabricante {

    private int Codigo_Fabricante;
    private String Nombre_Fabricante;
    private int Telefono_Fabricante;

    public Fabricante(){}

    public Fabricante(int Codigo_Fabricante,String Nombre_Fabricante, int Telefono_Fabricante){
        setCodigo_Fabricante(Codigo_Fabricante);
        setNombre_Fabricante(Nombre_Fabricante);
        setTelefono_Fabricante(Telefono_Fabricante);
    }

    public int getCodigo_Fabricante() {
        return this.Codigo_Fabricante;
    }

    public void setCodigo_Fabricante(int Codigo_Fabricante) {
        this.Codigo_Fabricante = Codigo_Fabricante;
    }

    public String getNombre_Fabricante() {
        return this.Nombre_Fabricante;
    }

    public void setNombre_Fabricante(String Nombre_Fabricante) {
        this.Nombre_Fabricante = Nombre_Fabricante;
    }

    public int getTelefono_Fabricante() {
        return this.Telefono_Fabricante;
    }

    public void setTelefono_Fabricante(int Telefono_Fabricante) {
        this.Telefono_Fabricante = Telefono_Fabricante;
    }

    @Override
    public String toString(){
        return "Fabricante [Codigo]: " + Nombre_Fabricante + " [" + Codigo_Fabricante + "] ";
    }
}