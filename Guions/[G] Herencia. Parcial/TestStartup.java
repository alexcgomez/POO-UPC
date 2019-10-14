
public class TestStartup {

	public static void main(String[] args) {
		Startup[] startups = {new StartupTecnologica("1", "nom1", 1, 1, 1, "descripcio1", 1, 1),
				              new StartupServicios("2", "nom2", 2, 2, 2, "descripcio2", true),
				              new StartupBiotecnologica("2", "nom3", 3, 3, 3, "descripcio3", 3, 3,"Azul",3),
				              new StartupTIC("4", "nom4", 3, 3, 3, "descripcio4", 3, 3)};
		for(Startup startup: startups) {
			System.out.println(startup);
			System.out.println("Inmobilizado: "+startup.calculoInmobilizado());
			System.out.println("Inmobilizado Inmaterial: "+startup.calculoInmobilizadoInmaterial());
			System.out.println("Inmobilizado Material: "+startup.calculoInmobilizadoMaterial());
			System.out.println();
		}

		
		System.out.println(startups[1].equals(startups[2]));
		

	}
}
