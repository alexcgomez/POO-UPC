
package Clases;


public class Max2 {
    
    int x,y,Max;
   
    public Max2(int x1,int y1){
           
        x = x1;
        y = y1;        
    }
    
    public int maxim2(){
        
        if (x>y) Max=x;
        else if(y>x)Max=y;
        return Max;   
    }
    
    
}
