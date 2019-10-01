public class Data {
    
    public int dia,mes,any;

    // Constructor
    public Data(int dia, int mes, int any){

        this.dia = dia;
        this.mes = mes;
        this.any = any;

    }
    
    // Constructor de copia
    public Data(Data d){               
        dia = d.getDia();
        mes = d.getMes();
        any = d.getAny();
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAny(int any){
        this.any = any;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAny(){
        return any;
    }

    public String toString(){
        String data;
        data = getDia() + " / " + getMes() + " / " + getAny();
        return data;
    }

    public int AnteriorPosteriorIgual(Data d){

        if(d.getAny() < any) return -1;
            else if(d.getMes() < mes) return -1;
                else if(d.getDia() < dia) return -1;
                    else if(d.getDia() == dia && d.getMes() == mes && d.getAny() == any) return 0;

                        else return 1;
                    }
    
    public int AnteriorPosteriorIgual(int dia , int mes , int any){

        if(any < this.any) return -1;
            else if(mes < this.mes) return -1;
                else if(dia < this.dia) return -1;
                    else if(dia == this.dia && mes == this.mes && any == this.any) return 0;
                        else return 1;
                    }
    
}