package Clases;

public class Max3{

    
    int[] x = {0, 0, 0};
    int Max3 = 0;
    
    public Max3(int x1,int x2, int x3){
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
        
    }
 
    public int maxim3(){
        
    for(int i=0;i < 3; i++) {
        if (Max3<x[i]) Max3=x[i];
        }
    return Max3;
    
    }

}
