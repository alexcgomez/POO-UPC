/*
 * Persona
 */
public class Persona {

	// Atributos

	private int dni, edad;
	private String nombre, ap1,ap2;
    private static int mayoria_edad = 18;
    private Data data_naixement;

	// Constructores

	public Persona(){}
	public Persona(int d, String N, String A1, String A2){
		setDni(d);
		setNombre(N);
		setApellido1(A1);
		setApellido2(A2);
	}
	public Persona(int d, String N, String A1, String A2, int e){
		this(d, N, A1, A2);
		edad = e;
	}
	public Persona(int d, String N, String A1, String A2, int e, Data dat){
		this(d, N, A1, A2, e);
		data_naixement = dat;
	}
	
	// Metodos de Objeto
	
		// Getters
	public String getNombre() {
			return nombre;
		}
	public static int getMayoria_edad() {
			return mayoria_edad;
		}
	public int getDni() {
			return dni;
		}
	public int getEdad() {
			return edad;
		}
	public Data getData_neix(){
			return new Data(data_naixement);
		}
	public String getApellido1(){
		return ap1;
	}
	public String getApellido2(){
		return ap2;
	}		
	
		// Setters
	public void setApellido1(String a){
		ap1 = a;
	}
	public void setApellido2(String a){
		ap2 = a;
	}
	public static void setMayoria_edad(int mayoria_edad) {
			Persona.mayoria_edad = mayoria_edad;
		}
	public void setNombre(String n) {
		nombre = n; 
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setEdad(int edad) {
		if (edad>=0 && edad<120){
			this.edad = edad;
		}
	}
	
		// Metodos
	public String toString(){
		return "DNI: " + getDni() + "\nNombre y apellidos: " + getNombre() + "\n";
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

}
