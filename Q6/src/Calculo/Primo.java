package Calculo;

import java.util.Scanner;

public class Primo {
				
	Scanner sc = new Scanner(System.in);
				
	public int num;
	public int contD;
				
	public Prime(){
	    num = 0;
	    contD = 0;
	}
				
	public void VerificaPrimo(){
								
	System.out.println("Digite o numero natural que você deseja verificar: ");
	num = sc.nextInt();
	for(int i = 1; i <= num; i++){
	    if(num % i == 0){
		contD++;																
	    }
	}
	if(contD == 2){
	    System.out.println("O número "+num+" é um número primo!");
       	}
	else{
	    System.out.println("O número "+num+" não é um número primo!");
 	}
    }				
}
