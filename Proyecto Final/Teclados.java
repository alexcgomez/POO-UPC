/**
 * Teclados
 */
public class Teclados extends Periferico{

    private String idioma;

    public Teclados(String puerto, String idioma) {
        super(puerto);
        this.idioma = idioma;
    }

    public Teclados(int Codigo_producto, Fabricante fabricante, String Descripcion, double PVP, String puerto,
            String idioma) {
        super(Codigo_producto, fabricante, Descripcion, PVP, puerto);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }



    
}