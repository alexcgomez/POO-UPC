/*
 * Persona
 */
public class Persona {

	private int dni, edad;
	private String nombre;
    private static int mayoria_edad = 18;
    private Data data_naixement;

    public Persona(int dni,  String nombre, int edad, Data data1) {
		this(dni,nombre, edad);
        data_naixement = new Data(data1);
	}
    
    public Persona(int dni,  String nombre, int edad) {
		this(nombre, edad);
		this.dni = dni;
	}
		
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	public Persona(){
        
    }
		
	public int diferenciaEdad(int edad){
		return Math.abs(this.edad-edad);
	}
		
	public int diferenciaEdad(Persona p){
		return Math.abs(this.edad-p.getEdad());
	}

	public void aniversario(){
		edad=edad+1;
	}

	public String getNombre() {
    	return nombre;
	}

	public void setNombre(String n) {
		nombre = n; 
	}

	public static int getMayoria_edad() {
    	return mayoria_edad;
	}

	public static void setMayoria_edad(int mayoria_edad) {
    	Persona.mayoria_edad = mayoria_edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public String getData_neix(){
		return data_naixement.getData();
	}

	public void setEdad(int edad) {
		if (edad>=0 && edad<120){
			this.edad = edad;
		}
	}
}
