import java.io.*;

/**
 * Archivo
 */
public class Archivo {

// constantes
    private final int PARAM_MAX = 7;
    private final int PARAM_MAX_FABRICANTE = 3;
    private final int PARAM_MAX_CLIENTE = 4;
    private final int PARAM_MAX_PRODUCTO = 5;
    
    public final int FABRICANTE = 0;
    public final int CLIENTE = 1;
    public final int PRODUCTO = 2;
    private File archivo_DB;

// Atributos globales
    public static String nom;


// Metodos public

    public String[] read_DB( int tipo, int id ) // Leemos info de fabricante, cliente o producto
    {
        String retorno[] = new String[PARAM_MAX];
        retorno[0] = "Error, metodo leer";

        String texto_temp = Llegir_buffer(archivo_DB);
        String lineas_buffer[] = texto_temp.split("\n");

        for (int i = 0; i < lineas_buffer.length; i++)
        {
            String parametros[] = lineas_buffer[i].split(",");

            switch(tipo) // hay un error con el return, arreglar
            {
                case FABRICANTE:
                    if( parametros[0].equals("Fabricante"))
                    {
                        parametros[1] = parametros[1].replace(" ", "");
                        int id_leida = Integer.parseInt(parametros[1].replace(",", ""));

                        if( id_leida == id )
                        {
                            return leerFabricante(parametros, id);
                        }
                    }
                break;

                case CLIENTE:
                
                    if( parametros[0].equals("Cliente"))
                    {
                        parametros[1] = parametros[1].replace(" ", "");
                        int id_leida = Integer.parseInt(parametros[1].replace(",", ""));

                        if( id_leida == id )
                        {
                            return leerCliente(parametros, id);
                        }
                    }
                    
                break;

                case PRODUCTO:
                
                    if( parametros[0].equals("Producto"))
                    {
                        parametros[1] = parametros[1].replace(" ", "");
                        int id_leida = Integer.parseInt(parametros[1].replace(",", ""));

                        if( id_leida == id )
                        {
                            return leerProducto(parametros, id);
                        }
                    }
                    
                break;
            }
        }
        return retorno;
    }

    // añadir -> fabricante, cliente, producto
    public boolean add_DB( int tipo )
    {

        return true;
    }

    // editar( id, nombre );
    public boolean edit_DB()
    {

        return true;
    }

    // eliminar( id );
    public boolean delete_DB()
    {
        return true;
    }


//  Metodos Private

    private Archivo(File archivo_DB )
    {
        this.archivo_DB = archivo_DB;
    }

    private String Llegir_buffer(File arxiu) {

        String content = null;
        File file = new File(arxiu.getPath());
        FileReader reader = null;

        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            nom = arxiu.getName();
            reader.close();
        } catch (IOException e) {
            // e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException en) {

                }
            }
        }

        return content;
    }

    private void Escriure_buffer(File arxiu, String buffer)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(arxiu.getPath()));
            writer.write(buffer);
            writer.close();
        } catch (IOException e) {}
    }

    private String[] leerFabricante(String[] linea_actual, int id) // no va por lo del return de arriba
    {
        String retorno[] = new String[PARAM_MAX_FABRICANTE];

        retorno[0] = linea_actual[1].replace(",", ""); // ID
        retorno[1] = linea_actual[2].replace(",", ""); // Nombre
        retorno[2] = linea_actual[3].replace(",", ""); // Telefono

        return retorno;
    }

    private String[] leerCliente(String[] linea_actual, int id)
    {
        String retorno[] = new String[PARAM_MAX_CLIENTE];
        
        retorno[0] = linea_actual[1].replace(",", ""); // ID
        retorno[1] = linea_actual[2].replace(",", ""); // Nombre
        retorno[2] = linea_actual[3].replace(",", ""); // Apellido
        retorno[3] = linea_actual[4].replace(",", ""); // Tarjeta

        return retorno;
    }

    private String[] leerProducto(String[] linea_actual, int id)
    {
        String retorno[] = new String[PARAM_MAX_PRODUCTO];

        retorno[0] = linea_actual[1].replace(",", ""); // ID fabricante
        retorno[1] = linea_actual[2].replace(",", ""); // ID producto
        retorno[2] = linea_actual[3].replace(",", ""); // Cantidad
        retorno[3] = linea_actual[4].replace(",", ""); // producto
        retorno[4] = linea_actual[5].replace(",", ""); // precio

        return retorno;
    }
}
