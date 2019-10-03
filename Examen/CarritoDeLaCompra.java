package Examen;

import java.util.ArrayList;

/**
 * CarritoDeLaCompra
 */
public class CarritoDeLaCompra {

    private ArrayList<Componente> Lista_Compra;
    private Data Dat_Car;
    private Cliente Cte_Car;
   

    // CONSTRUCTORES
    public CarritoDeLaCompra(){                             
        Lista_Compra = new ArrayList<Componente>(); 
    }

    public CarritoDeLaCompra(ArrayList<Componente> L,Data D, Cliente C){
        setLlista(L);
        setData(D);
        setCliente(C);
    }



    // METODOS DE CLASE

    // Getters
    public ArrayList<Componente> getComp(){return new ArrayList<Componente>(Lista_Compra);}
    public Data getData(){return new Data(Dat_Car);}
    public Cliente getCliente(){return new Cliente(Cte_Car);}

    // Setters
    public void setLlista(ArrayList<Componente> L){Lista_Compra = L;}    
    public void setData(Data D){Dat_Car = new Data(D);}
    public void setCliente(Cliente C){Cte_Car = new Cliente(C);}    

    // Metodos 
    public void addComponente(Componente C){Lista_Compra.add(C);}
    public void deleteComponente(int codigo){
        Boolean eliminado =false;
        for (int i = 0; i < Lista_Compra.size(); i++) {
            if (codigo == Lista_Compra.get(i).getCod()) {
            Lista_Compra.remove(i); 
            i = Lista_Compra.size(); // Salgo del loop despues de eliminar el Producto (Solo elimina 1).
            }
            eliminado =true;
        }
        if (eliminado = false) System.out.println("El producto no esta en el carrito.");
    }   
    public String toString(){
        double total=0;
        String Carrito = "    CARRITO DE LA COMPRA\n_________________________________\n\n";

        if(Lista_Compra.size() != 0){
        for (int i = 0; i < Lista_Compra.size(); i++) {
            Carrito += Lista_Compra.get(i).getCod() + "   " + Lista_Compra.get(i).getDes() + "   " + Lista_Compra.get(i).getPVP() + "\n";
            total += Lista_Compra.get(i).getPVP();
        }
        Carrito += "_________________________________\nTOTAL:                       " + total;
        return Carrito;}
        else return "El carrito esta vacio";
    }

    public Venta comprar(Data D,String P){
        return new Venta(this,D,P);
    }
    
}