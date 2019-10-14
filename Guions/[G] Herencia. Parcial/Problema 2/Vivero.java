/**
 * Vivero
 */
public class Vivero {

    private Startup locales[];
    private int numLoc;

    public Vivero(int L){
        locales = new Startup[L];
    }

    
	public Startup getLocal(int i) {
		return this.locales[i];
	}

	public void setLocal() {
		
		locales[0] = new Startup("1", "1", 1, 1, 1, "1");
		for (int i = 0; i < locales.length; i++) {
			if(locales[i] == null)
			System.out.println("Algo: " + i);

			System.out.println("Otra i: " +i );
		}
			
            
        }


	public int getNumLoc() {
		return this.numLoc;
	}

	public void setNumLoc(int numLoc) {
		this.numLoc = numLoc;
	}

    
}