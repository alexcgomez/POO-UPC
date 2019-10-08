public class Main {
	public static void main(String[] args) {
		Empleados empleats[] = {
		new Empleados(32456789,"Josep Segarra Sans",1000),
		new Empleados(32456788,"Carles Farre Almerich",1200),
		new EmpleadosCom(32456787,"Joan Hernandez Ferrer", 1200,800),
		new Empleados(32456786,"Josep Llop Giro",1000),
		new EmpleadosCom(32456785,"Joan Diaz Cunit",1500,1200),
		new Directivos(32456784,"Pere Vazquez Sanchez",1500,1200,3000),
		new EmpleadosCom(32456783,"Marta Adria Companys", 1200,800),
		new Directivos(32456782,"Anna Gomez Cortes",1500,1200, 2800)};
		for(Empleados e: empleats) {
			System.out.println(e);
			System.out.println("Nomina mensual: " + e.getNomina());
			System.out.println();
		}
	}
}