package Calculo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Numeros {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    public int num;
    public double n;    
    //Calcs
    public double somaT;
    public double mediaT;
    // Max/Min
    public double maiorN;
    public double menorN;
    // Pares/Impares
    public double somaP;
    public int contP;
    public int contI;
    public double pcntI;
    
    public Numeros(){
        num = 0;
        n = 0;
        somaT = 0;
        mediaT = 0;
        maiorN = 0;
        menorN = 30000;
        somaP = 0;
        contP = 0;
        contI = 0;
        pcntI = 0;
    }
    
    public void DigitacaoNum(){
        
        System.out.println("Quantos números você quer digitar?");
        num = sc.nextInt();
        
        //Onde os números serão armazenados
        double [] numD = new double[num+1];
        
        for(int i = 0; i < num; i++){
            System.out.println("Digite um número :");
            n = sc.nextDouble();
            numD[i] = n;
            if(n > maiorN){
                maiorN = n;
                menorN = maiorN;
            }
            if(n % 2 == 0){
                somaP = somaP + n;
                contP++;
            }
            else{
                contI++;
            }            
        }
        
        System.out.println("\nO numero 30000 será adicionado à sua digitalização!");    
        numD[num] = 30000;
        
        for(int m = 0; m < numD.length; m++){
            somaT = somaT + numD[m];
            mediaT = somaT/(num+1);
            if((numD[m] < menorN) & (numD[m] != 30000)){
                menorN = numD[m];
            }
        }
        
        System.out.println("\nA soma dos números digitados é : "+ somaT);
        System.out.println((num+1)+" números foram digitados");
        System.out.println("A média aritimética dos números digitados é : "+df.format(mediaT));
        System.out.println("O maior número digitado foi : "+maiorN);
        System.out.println("O menor Número digitado foi : "+menorN);
        if(contP != 0){
            System.out.println("A média dos números pares é : "+(somaP/contP));
        }
        else{
            System.out.println("Não foram digitados números pares!");
        }
        System.out.println("A % de números impares digitados é : "+((contI*100)/num)+"%");
        
    }
    
}
