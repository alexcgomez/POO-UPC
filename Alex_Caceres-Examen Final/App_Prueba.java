/**
 * App_Prueba
 */
public class App_Prueba extends App {

    private static int Periodo_prueba = 2;
    private boolean Demana_movil;
    private double Precio;

    public App_Prueba(String nombre, String descripcion, String developer, String version, boolean movil, double precio) {
        super(nombre, descripcion, developer, version);
        setDemana_movil(movil);
        setPrecio(precio);
    }

    public boolean isDemana_movil() {
        return Demana_movil;
    }

    public void setDemana_movil(boolean demana_movil) {
        this.Demana_movil = demana_movil;
    }

    public static int getPeriodo_prueba() {
        return Periodo_prueba;
    }

    public static void setPeriodo_prueba(int periodo_prueba) {
        Periodo_prueba = periodo_prueba;
    }

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
    }
    
    @Override
    public String toString(){
        return super.toString() 
            +  "Periodo de prueba: " + Periodo_prueba + "\n"
            +  "Requiere de movil para descargar: "  + Demana_movil;

    }

    @Override
    public double calcularPrecio(){
        if(Periodo_prueba == 0){return Precio;}
        else return 0;
    }

    

    

}