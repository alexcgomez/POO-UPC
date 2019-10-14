/**
 * Startup
 */
public class Startup {

    private String CIF;
    private String Nombre;
    private double CapSocial;
    private double Inversiones;
    private int Trabajadores;
    private String Descripcion;

    // Constructores

    public Startup(String C, String N, double Cap, double Inv, int T, String Des){
        CIF = C;
        Nombre = N;
        CapSocial = Cap;
        Inversiones = Inv;
        Trabajadores = T;
        Descripcion = Des;
    }


    // Getters y Setters

    public String getCIF() {
        return this.CIF;
    }

    // public void setCIF(String CIF) {
    //     this.CIF = CIF;
    // }

    public String getNombre() {
        return this.Nombre;
    }

    // public void setNombre(String Nombre) {
    //     this.Nombre = Nombre;
    // }

    public double getCapSocial() {
        return this.CapSocial;
    }

    public void setCapSocial(double CapSocial) {
        this.CapSocial = CapSocial;
    }

    public double getInversiones() {
        return this.Inversiones;
    }

    public void setInversiones(double Inversiones) {
        this.Inversiones = Inversiones;
    }

    public int getTrabajadores() {
        return this.Trabajadores;
    }

    public void setTrabajadores(int Trabajadores) {
        this.Trabajadores = Trabajadores;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    // Metodos

    public void addTrabajador(){
        Trabajadores++;    
    }

    public Boolean deleteTrabajador(){
        if (Trabajadores >= 1){ 
        Trabajadores--;
        return true;
        }
        else return false;
    }

    public double calculoInmobilizadoInmaterial(){
        return 0;
    }

    public double calculoInmobilizadoMaterial(){
        return 0;
    }

    public double calculoInmobilizado(){
        return calculoInmobilizadoInmaterial()+calculoInmobilizadoMaterial();
    }

    public boolean equals(Startup s){
        if(this.CIF == s.getCIF()) return true;
        else return false;
    }

    @Override
    public String toString(){
        return "Nombre[CIF]: " + Nombre + " [" + CIF + "] \n" + "Capital Social: " + CapSocial + "\nInversores: " + Inversiones + "\nTrabajadores: " + Trabajadores + "\nDescripción: " + Descripcion;
    }
}