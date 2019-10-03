package Examen;
import java.util.ArrayList;
/**
 * Venta
 */
public class Venta {

    private ArrayList<Componente> Lista_venta;
    private Cliente Cte_Vta;
    private Data Dat_Vta;
    private String Pago;


    // CONSTRUCTORES
    public Venta(CarritoDeLaCompra L, Data Fecha, String Pago){
       setLista(L.getComp());
       setPago(Pago);
       setData(Fecha);

    }
    public Venta(Venta V){
        setLista(V.getListaVenta());
        setCliente(V.getCliente());
        setData(V.getData());
        setPago(V.getPago());
    }

    // METODOS DE CLASE

    // Getters
    public ArrayList<Componente> getListaVenta(){return new ArrayList<Componente>(Lista_venta);} 
    public Cliente getCliente(){return new Cliente(Cte_Vta);}
    public Data getData(){return new Data(Dat_Vta);}
    public String getPago(){return Pago;}

    // Setters
    public void setLista(ArrayList<Componente> L){
        Lista_venta = new ArrayList<Componente>(L);
    }   
    public void setCliente(Cliente C){
        Cte_Vta = new Cliente(C);
    }
    public void setData(Data D){
        Dat_Vta = new Data(D);
    }
    public void setPago(String P){
        if (P == "TB")Pago = P;
        else if (P == "PT") Pago = P;
        else P = "Error: Metodo de pago incorrecto";
    }

    // Metodos

    public String toString(){
        String Venta = "FACTURA DE VENTA\n___________________\n";
        double total=0;
        for (int i = 0; i < Lista_venta.size(); i++) {
            Venta += Lista_venta.get(i).getCod() + "   " + Lista_venta.get(i).getDes() + "   " + Lista_venta.get(i).getPVP() + "\n";
            total += Lista_venta.get(i).getPVP();
        }
        Venta += "_________________________________\nTOTAL Vendido:"+total;
        return Venta;
    }


}