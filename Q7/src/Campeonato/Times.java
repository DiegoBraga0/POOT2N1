package Campeonato;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Times {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat ("0.00");
    // Atributos do jogador
    public double peso;
    public double altura;
    public int idade;
    // Times   
    public int times;
    public int jogadores;
    // Contadores 
    public int contI;
    public int contP;
    // Calculos
    public double mediaAltura;
    public double mediaIdade;
    public double porcPeso80;
    
    // Construtor 
    public Times(){        
        peso = 0;
        altura = 0;
        idade = 0;
        times = 5;
        jogadores = 11;
        contI = 0;
        contP = 0;
        mediaAltura = 0;
        mediaIdade = 0;
        porcPeso80 = 0;
    }
    
    public void jogador(){
        
        System.out.println("Qual a idade do jogador :");
        idade = sc.nextInt();
        //idade = 17; // valor teste
        if(idade < 18){
            contI++;
        }
        mediaIdade = mediaIdade + idade;
        
        System.out.println("Qual o peso do jogador :");
        peso = sc.nextDouble();
        //peso = 81; // valor teste
        if(peso > 80){
            contP++;
        }
        
        System.out.println("Qual a altua do jogador :");
		     altura = sc.nextDouble();
        //altura = 1.80; // valor teste
        mediaAltura = mediaAltura + altura;
        
    }

    public void CalcMediaIdadeT(int i){
        
        mediaIdade = mediaIdade/11;
        System.out.println("\nA média das idades do "+i+"° time é = "+mediaIdade+"\n");
        mediaIdade = 0;  
        
    }
    
    public void CalcMediaAltura(){
        
        mediaAltura = mediaAltura/(jogadores * times);
        System.out.println("\nA média das alturas do jogadores do campeonato é "+df.format(mediaAltura)+"m de altura");
    
    }
    public void CalcPorcPeso80(){
        
        porcPeso80 = (contP * 100)/(jogadores*times);
        System.out.println("\nA % de jogadores no campeonato que pesam mais de 80kg é de "+df.format(porcPeso80)+"%");
    
    }
    
    // Método principal que chama todos os outros 
    public void DadosDosTimes(){
        
        for(int i = 1; i <= times; i++){
            System.out.println("\t"+i+"° Time : \n");
            for(int j = 1;j <= jogadores; j++){
                System.out.println(j+"° Jogador do "+i+"° Time : ");
                jogador();
            }
            CalcMediaIdadeT(i);
                   
        }
        System.out.println("\tSobre os times do campeonato :");
        System.out.println("\nA quantidade de jogadores que tem menos de 18 anos no campeonato é de "+contI+" jogadores");
        CalcMediaAltura();
        CalcPorcPeso80();
        
    }
       
}
