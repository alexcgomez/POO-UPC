public class Data {
    
    public int dia,mes,any;

    public Data(int dia, int mes, int any){

        this.dia = dia;
        this.mes = mes;
        this.any = any;

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
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAny(){
        return this.any;
    }

    public int AnteriorPosteriorIgual(Data d){

        if(d.getAny() < this.any) return -1;
            else if(d.getMes() < this.mes) return -1;
                else if(d.getDia() < this.dia) return -1;
                    else if(d.getDia() == this.dia && d.getMes() == this.mes && d.getAny() == this.any) return 0;

                        else return 1;
                    }

    




}