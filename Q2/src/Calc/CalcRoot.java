package Calc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcRoot {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0");
    
    public double num1;
    public double num2;
    public double sum;
    public double num3;
    public double raiz
    public int option;
    
    public CalcRoot(){
        num1 = 0;
        num2 = 0;
        sum = 0;
        num3 = 0;
        raiz = 0;
        option = 0;        
    }
    
    
    public void Menu(){
        
        System.out.println("\tMenu");
        System.out.println("[1] Para somar dois numeros");
        System.out.println("[2] Para realizar a raiz quadrada de um numero.");

        option = sc.nextInt();

        switch (option) {
            case 1 :            
                System.out.println("Seu primeiro numero a ser somado: ");
                num1 = sc.nextDouble();
                System.out.println("Seu segundo numero a ser somado: ");
                num2 = sc.nextDouble();
                sum = num1 + num2;
                System.out.println("O resultado da soma é: " + sum);
                break;
            case 2 :
                System.out.println("Escolha o numero para realizar sua raiz quadrada.");
                num3 = sc.nextDouble();
                raiz = Math.pow(num3, 0.5);
                if(raiz == Math.round(raiz)){
                    System.out.println("A raiz quadrada é: " + df.format(raiz));
                }
                else{                
                    System.out.println("A raiz quadrada é: " +raiz);
                }
                
                break;
            default :
                System.out.println("Por favor escolha uma opção valida!");
            }
    }
    
}
