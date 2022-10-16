package Calculo;

import java.util.Scanner;

public class Fatorial {
    
    Scanner sc = new Scanner(System.in);
    
    public int n;
    public int num;
    public int i;
    public long j;
    public int k;
    public long fat;
    
    
    public Fatorial(){
        n = 0;
        num = 0;
        i = 0;
        j = 0;
        k = 0;
        fat = 0;
    }
    
    public void calcFat(){
        
        System.out.println("Digite a quantidade de números que devem ser lidos :");
        n = sc.nextInt();        
        for(i = 1; i <= n; i++){
            System.out.println("\nDigite um número para que seu fatorial seja calculado :");
            num = sc.nextInt();
            fat = 1;
            for(j = 1; j <= num; j++){
                fat = fat * j;                
            }
            
            System.out.println("Fatorial de "+num+" é : ");
            for(; num >= 1; num--){               
                if(num != 1){
                    System.out.print(num+"*");
                }
                else{
                    System.out.print(num+" = "+fat+"\n");
                }
                
            }
        }  
        System.out.println("\n------------------------------------------");
    }        
    
}
