package Calculo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Baskara {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df0 = new DecimalFormat("0");
    
    public double a;
    public double b;
    public double c;
    public double delta;
    public double r1;
    public double r2;
    
    public Baskara(){
        double a = 0;
        double b = 0;
        double c = 0;
        double delta = 0;
        double r1 = 0;
        double r2 = 0;
    }
   
    public void baskara(){
                     
        System.out.println("O progama resolve equações do tipo mais simples \n ax² + bx + c = 0");
        System.out.println("Digite o valor de a :");
        a = sc.nextFloat();
        System.out.println("Digite o valor de b :");
        b = sc.nextFloat();
        System.out.println("Digite o valor de c :");
        c = sc.nextFloat();      
        System.out.println("A equação digitada é : "+ df0.format(a)+"x²+"+df0.format(b)+"x+"+df0.format(c)+" = 0");
        
        delta = (Math.pow(b,2) - (4 * a * c));
        System.out.println("Delta vale : "+ delta);
        
        if(delta == 0){
            System.out.println("A equação fornecida apresenta duas raízes reias iguais");
            r1 = r2 = ((-b + Math.pow(delta,0.5))/2 * a);
            System.out.println("que são respectivamente : "+ r1 +" e "+ r2+"!");
        }
        else if(delta >=1){
            System.out.println("A equação fornecida apresenta duas raízes reais e distintas");
            r1 = ((-b + Math.pow(delta,0.5))/2*a);
            r2 = ((-b - Math.pow(delta,0.5))/2*a);
            System.out.println("que são respectivamente : "+ r1 +" e "+ r2 +"!");
        }
        else{
            System.out.println("A equação fornecida não apresenta raízes reais(R)!");
        }
        
        
    }
    
}
