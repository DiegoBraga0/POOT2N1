package Tabuada;

public class Tab {
    
    public void TabuadaNum(){
        
        for(int n = 1; n < 11; n++){
            System.out.println("\n");
            System.out.println("Tabuada do " + n + " : \n");
            for(int i = 1; i < 11; i++){
                System.out.println(n + " x " + i + " = "+ n*i);
            }
        }
    }  
}
