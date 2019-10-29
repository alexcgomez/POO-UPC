import java.io.*;

/**
 * Archivo
 */
public class Archivo {

    /////////// ATRIBUTOS Y CONSTANTES /////////////////////
    private final int PARAM_MAX = 7;
    private final int PARAM_MAX_FABRICANTE = 3;
    private final int PARAM_MAX_CLIENTE = 4;
    private final int PARAM_MAX_PRODUCTO = 5;
    
    public final int FABRICANTE = 0;
    public final int CLIENTE = 1;
    public final int COMPONENTE = 2;
    private File archivo_DB;

    public static String nom;


    /////////// CONSTRUCTOR ///////////////////////////////
    public Archivo(File archivo_DB )
    {
        this.archivo_DB = archivo_DB;
    }

    ////////// METODO LEER (DONE) /////////////////////////
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

                case COMPONENTE:
                
                    if( parametros[0].equals("Componente"))
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
    
    ////////// METODO AÑADIR  ( Sobreescrito ) ////////////

    //FABRICANTE
    public boolean add_DB( Fabricante f )
    {
        boolean deleted=false;
        // leer inventario.txt
        String texto_temp = Llegir_buffer(archivo_DB);
            // Separamos por lineas
        String lineas_buffer[] = texto_temp.split("\n");

        for (int i = 0; i < lineas_buffer.length; i++){
                // Para todas las lineas, separamos por comas
            String parametros[] = lineas_buffer[i].split(", ");
                // Localizamos el tipo que buscamos
            if( parametros[0].equals("Fabricante"))
            {
                if(Integer.parseInt(parametros[1])==f.getCodigo_Fabricante()){ return false;}
                System.out.println(parametros.toString());
                lineas_buffer[i] += "\n" + f.toFile();
                break;
            }
        }

        texto_temp = convert_matrix_to_string( lineas_buffer, '\n');
        //System.out.println("chivato 2:\n\n" + texto_temp);
        Escriure_buffer(archivo_DB,  texto_temp );
        return true;
    }
    // CLIENTE
    public boolean add_DB( Cliente c )
    {
        boolean deleted=false;
        // leer inventario.txt
        String texto_temp = Llegir_buffer(archivo_DB);
            // Separamos por lineas
        String lineas_buffer[] = texto_temp.split("\n");

        for (int i = 0; i < lineas_buffer.length; i++){
                // Para todas las lineas, separamos por comas
            String parametros[] = lineas_buffer[i].split(",");
                // Localizamos el tipo que buscamos
            if( parametros[0].equals("Cliente"))
            {
                lineas_buffer[i] += "\n" + c.toFile();
                break;
            }
        }

        texto_temp = convert_matrix_to_string( lineas_buffer, '\n');
        //System.out.println("chivato 2:\n\n" + texto_temp);
        Escriure_buffer(archivo_DB,  texto_temp );
        return true;
    }
    // COMPONENTE
    public boolean add_DB( Componente c )
    {
        boolean deleted=false;
        // leer inventario.txt
        String texto_temp = Llegir_buffer(archivo_DB);
            // Separamos por lineas
        String lineas_buffer[] = texto_temp.split("\n");

        for (int i = 0; i < lineas_buffer.length; i++){
                // Para todas las lineas, separamos por comas
            String parametros[] = lineas_buffer[i].split(",");
                // Localizamos el tipo que buscamos
            if( parametros[0].equals("Cliente"))
            {
                lineas_buffer[i] += "\n" + c.toFile();
                break;
            }
        }

        texto_temp = convert_matrix_to_string( lineas_buffer, '\n');
        //System.out.println("chivato 2:\n\n" + texto_temp);
        Escriure_buffer(archivo_DB,  texto_temp );
        return true;
    }
    
    ////////// METODO EDITAR (Pendiente) //////////////////
    public boolean edit_DB()
    {

        return true;
    }



    ////////// METODO BORRAR (DONE) ///////////////////////
    public boolean delete_DB( int tipo, int id )
    {   
        boolean deleted=false;
        // leer inventario.txt
        String texto_temp = Llegir_buffer(archivo_DB);
            // Separamos por lineas
        String lineas_buffer[] = texto_temp.split("\n");

        for (int i = 0; i < lineas_buffer.length; i++){
                // Para todas las lineas, separamos por comas
            String parametros[] = lineas_buffer[i].split(",");
                // Localizamos el tipo que buscamos
            switch(tipo) 
            {
                case FABRICANTE:
                    if( parametros[0].equals("Fabricante"))
                    {
                        parametros[1] = parametros[1].replace(" ", "");
                        int id_leida = Integer.parseInt(parametros[1].replace(",", ""));

                        if( id_leida == id )
                        {
                            lineas_buffer[i] = "";
                            deleted = true;
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
                            lineas_buffer[i] = "";
                            deleted = true;
                        } 
                    }
                break;

                case COMPONENTE:
                    if( parametros[0].equals("Componente"))
                    {
                        parametros[1] = parametros[1].replace(" ", "");
                        int id_leida = Integer.parseInt(parametros[1].replace(",", ""));

                        if( id_leida == id )
                        {
                            lineas_buffer[i] = "";
                            deleted = true;
                        } 
                    }
                break;
           }
           
        }

        // las IDs quedaran descuadradas
        texto_temp = convert_matrix_to_string( lineas_buffer, '\n');
        Escriure_buffer(archivo_DB,  texto_temp );
        return deleted;
    }


    ////////// METODOS PRIVADOS //////////////////////////

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

    private String convert_matrix_to_string( String[] doble, char caracter )
    {
        String simple = "";
    
        for(int i = 0; i < doble.length; i++ )
        {
            if( i != (doble.length-1) )
            {
                simple += doble[i] + caracter;
            }
            else // si és la ultima linia, no posem el char final
            {
                simple += doble[i];
            }
        }
        
        return simple;
    }

}
