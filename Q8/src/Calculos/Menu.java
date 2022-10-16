package Calculos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Menu {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    public int option;
    public double salario;
    public double imposto;
    public double aumento;
    public double novoSal;
    
    public Menu(){
        option = 0;
        salario = 0;
        imposto = 0;
        aumento = 0;
        novoSal = 0;
    }
    
    public void interfaceMenu(){
                
        System.out.println("\nMenu de opções\n");
        System.out.println("\t[1] Imposto");
        System.out.println("\t[2] Novo salário");
        System.out.println("\t[3] Classificação");
        System.out.println("\t[4] Sair");
        
        do{
            System.out.println("\nQual a opção desejada?");
            option = sc.nextInt();
            
            switch(option){
                case 1 :
                    System.out.println("Digite seu salario :");
                    salario = sc.nextDouble();
                    if(salario < 500){
                        imposto = (salario * 5)/100;                        
                        System.out.println("O imposto sob seu salário é de "+df.format(imposto)+"\nQue corresponde a 5% do seu salário ");;
                    }
                    if((salario >= 500) & (salario <= 850)){
                        imposto = (salario * 10)/100;                  
                        System.out.println("O imposto sob seu salário é de "+df.format(imposto)+"\nQue corresponde a 10% do seu salário ");
                    }
                    if(salario > 850){
                        imposto = (salario * 15)/100;
                        System.out.println("O imposto sob seu salário é de "+df.format(imposto)+"\nQue corresponde a 15% do seu salário ");
                    }                    
                    break;
                case 2 :
                    System.out.println("Digite seu salario :");
                    salario = sc.nextDouble();
                    if(salario > 1500){
                        aumento = 25;
                    }
                    if((salario <= 1500) & (salario >= 750)){
                        aumento = 50;
                    }
                    if((salario >= 450) & (salario < 750)){
                        aumento = 75;
                    }
                    if(salario < 450){
                        aumento= 100;
                    }
                    novoSal = salario + aumento;
                    System.out.println("Seu novo salario é de R$"+novoSal);
                    break;
                case 3 :
                    System.out.println("Digite seu salario :");
                    salario = sc.nextDouble();
                    if(salario >= 750){
                        System.out.println("Bem remunerado");
                    }
                    else{
                        System.out.println("Mau remunerado");
                    }
                    break;
                default:
                    if(option != 4){
                        System.out.println("Digite uma opção valida!");
                    }
                    else{
                        System.out.println("Fim!");
                    }
                    
                    
            }
                       
        }while(option != 4);
        
    }    
          
}
