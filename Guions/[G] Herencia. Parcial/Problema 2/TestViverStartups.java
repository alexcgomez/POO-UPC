
public class TestViverStartups {

	public static void main(String[] args) {
		
		Startup[] startups = {new StartupTecnologica("1", "nom1", 1, 1, 1, "descripcio1", 1, 1),
	              new StartupServicios("2", "nom2", 2, 2, 2, "descripcio2", true),
	              new StartupBiotecnologica("3", "nom3", 3, 3, 3, "descripcio3", 3, 3,"blau",3),
	              new StartupTIC("4", "nom4", 3, 3, 3, "descripcio4", 3, 3)
		};
		
		Vivero viver = new Vivero(3);
		for(Startup startup: startups) {
			System.out.println("viver.numLocalsLliures(): " + viver.numLocalsLliures());
			System.out.println("viver.assignarLocal(startup): " + viver.assignarLocal(startup));
		}
		System.out.println();
		System.out.println();

		for(int i=0; i<8; i++) {
			System.out.println("viver.getStartup(" + i + "): " + viver.getStartup(i));
		}
		System.out.println();
		System.out.println();
		
		for(Startup startup: startups) {
			System.out.println("viver.getStartup(" + startup.getCIF() + "): " + viver.getLocal(startup.getCIF()));			
		}
		System.out.println();
		System.out.println();
		
		System.out.println(viver);

		
	}

}
