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

	public void setLocal(Startup s) {
		for (int i = 0; i < locales.length; i++) {
            if(locales[i].getClass()==null) 
        }
	}

	public int getNumLoc() {
		return this.numLoc;
	}

	public void setNumLoc(int numLoc) {
		this.numLoc = numLoc;
	}

    
}