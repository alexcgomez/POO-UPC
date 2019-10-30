/********************************************************************************
*
*       PROYECTO FINAL INTRODUCCIÓN A LA PROGRAMACIÓN
*                 ORIENTADA A OBJETOS
*
*
*
*
*   Autor: Alex Caceres
*   Fecha de entrega: 30/10/2019
*   Revisión: 1.0.0
*   Repositorio: https://github.com/raiben23/POO-UPC/tree/master/Proyecto%20Final
*
**********************************************************************************/

Creación de una tienda online, se han implementado todas las clases creadas en el 
examen parcial (Carrito, Fabricante, Cliente, Venta...). El proyecto se ha estructu-
rado de la siguiente forma:

    - Creada una clase base Tienda_online

    - Dicha clase implementa una interficie GestionTienda en la que recojo los meto-
        dos utilizados para llevar a cabo la funcionalidad que se pedia:

            # public String addCliente(Cliente c);
            # public String addFabricante(Fabricante f);
            # public String showCliente();
            # public String addProdCarrito(Carrito c, Componente p);
            # public String showFabricante();
            # public String updateStock(Componente c, int u);
            # public String addCarrito(Cliente c, Date d);
            # public String showCarrito();
            # public String showVentas();
            # public String deleteCarrito(Cliente c);
            # public String deleteVenta(Date d);
            # public String comprarCarrito(int i, String p);
            # public void devolucion(Date d, Cliente c, int cd);
            # public String mostrarStock();

    - Para la gestión del stock se ha creado la clase ProductoEnStock: La implementa-
        ción de esta clase no ha sido correcta, hay errores en la suma y resta de re-
        servados y en stock, y por falta de tiempo no la he podido implementar corre-
        ctamente.
    
    - Se han creado las subclases de herencia solicitadas y se han implementado en el
        sistema como si de otro componente cualquiera se tratase, de forma que se pue-
        den mostrar, buscar y modificar como los demás componentes(polimorfismo). Por 
        falta de tiempo, no se han implementado toString en estas subclases.

    - No se han hecho los ejercicios opcionales, también por falta de tiempo. En el 
        primer ejercicio se pedia listar componentes segun su tipo utilizando:
                        
                        if (n instanceof Periferico) {...}

        no se ha llevado a cabo pero si que utilizo este método en los equals para poder
        llamar al metodo nativo de la API de Java de ArrayList.contains() de forma que 
        me localize los objetos de la manera que mas me convenga. 


*Finalmente indicar que no se ha podido terminar toda la funcionalidad del proyecto ya que
 en un principio se iba a crear un proyecto que ha resultado ser mucho más denso por conte-
 ner interfaz grafica y una pequeña base de datos sql en la nube. Comencé la interfaz con 
 las librerias JAVAFX, despues usé Swing, la base de se creó con Microsoft Azure tanto ser-
 vidor como DB. Al ver que era demasiado ambicioso para el tiempo que tenia, sustituí la DB
 por un fichero .txt para poder modificarlo sin ejecutar el programa y creé sus correspondi-
 entes clases para gestionarlo, el "intento" de base de datos también lo adjunto.