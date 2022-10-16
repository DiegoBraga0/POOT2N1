package Calculo;

import java.util.Scanner;

public class Par {
    
    Scanner sc = new Scanner(System.in);
    
    public int num;
    
    public Par(){	
        num = 0;
    }
    
    public void Verification(){
        
        System.out.println("Digite o número que você deseja verificar : ");
        
        num = sc.nextInt();				
	if(num % 2 == 0) {
	    System.out.println("Par!");
	}
        else{
	    System.out.println("Impar!");							
	}
																								
    }				

}

