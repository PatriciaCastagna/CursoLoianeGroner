

/**
 *
 * @author Patricia
 */
public class Arrays {
    public static void main (String[] args){
        double tempDia001 = 31.3;
        double tempDia002 = 33.3;
        double tempDia003 = 35.3;
        double tempDia004 = 38.3;
        double tempDia005 = 30.3;
        
        double[] temperaturas = new double [365];
        temperaturas [0] = 31.3;
        temperaturas [1] = 33.3;
        temperaturas [2] = 35.3;
        temperaturas [3] = 38.3;
        temperaturas [4] = 30.3;
        
    System.out.println ("O valor da temperatura do dia 01 é " + temperaturas[0]);
    
    System.out.println ("O tamanho do Array:" + temperaturas.length);
    
    System.out.println ("Valores do Array:");
    
    for (int i=0; i<temperaturas.length; i++){
    System.out.println("O valor da temperatura do dia " + (i+1)+ "é"+ temperaturas[i]);    
    }
        
        
    }
    
}
