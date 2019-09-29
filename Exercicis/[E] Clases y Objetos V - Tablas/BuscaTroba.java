/**
 * BuscaTroba
 */
public class BuscaTroba {

    private TesoroIV tesoros[];
    

    public BuscaTroba(Punt2D[] tpunts, int[] talt) {

        tesoros = new TesoroIV[tpunts.length];

        for (int i = 0; i < tpunts.length; i++) {
            tesoros[i] = new TesoroIV();
            tesoros[i].setPunt(tpunts[i]);
            tesoros[i].setAltura(talt[i]);
        }

    }

    public void actualitzaTresor(int i, String newDesc, double newVal) {
        tesoros[i].setDescripcion(newDesc);
        tesoros[i].setValor(newVal);
    }

    public TesoroIV getTresor(int i) {
        return tesoros[i];
    }

    public int quantsTresors(){
        return tesoros.length;
    }
}