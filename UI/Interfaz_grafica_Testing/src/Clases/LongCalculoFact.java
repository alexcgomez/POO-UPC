package Clases;


public class LongCalculoFact {
    
    long n, fact = 1;
    
    public LongCalculoFact(long n1){
        
        n = n1; 
    
    }
        
        public long CalcFact(){
        for (long i = n; i > 1; i--) {

            fact = fact*i;
                        
            }
        return fact;
        }       
}