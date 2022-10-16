package Data;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Day {
    
    Scanner sc = new Scanner(System.in);
	
    public int t;
    public int dia;
    public int mes;
    public int ano;
    public int hora;
    public int min;
    
    public Day(){
        t = 0;
        dia = 0;
        mes = 0;
        ano = 0;
        hora = 0;
        min = 0;        
    }
    
    public void DataAtual(){
        
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        cal.setTime(d);
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH);
        ano = cal.get(Calendar.YEAR);
        hora = cal.get(Calendar.HOUR) + 9; //Esse +9 é pra regular o fuso horário.
        min = cal.get(Calendar.MINUTE);
        
        if ( mes == 1 ) {
            System.out.println("Data Atual: " + dia + " de Janeiro de " + ano);
     	}			
	else if ( mes == 2 ) {
            System.out.println("Data Atual: " + dia + " de Fevereiro de " + ano);
        }
     	else if ( mes == 3 ) {
            System.out.println("Data Atual: " + dia + " de Março de " + ano);
     	}
     	else if ( mes == 4 ) {
            System.out.println("Data Atual: " + dia + " de Abril de " + ano);	
     	}
	else if ( mes == 5 ) {
            System.out.println("Data Atual: " + dia + " de Maio de " + ano);
     	}
      	else if ( mes == 6 ) {
            System.out.println("Data Atual: " + dia + " de Junho de " + ano);
     	}
	else if ( mes == 7 ) {
            System.out.println("Data Atual: " + dia + " de Julho de " + ano);
	}
	else if ( mes == 8 ) {
            System.out.println("Data Atual: " + dia + " de Agosto de " + ano);
	}
     	else if ( mes == 9 ) {
            System.out.println("Data Atual: " + dia + " de Setembro de " + ano);
     	}
     	else if ( mes == 10 ) {
            System.out.println("Data Atual: " + dia + " de Outubro de " + ano);
     	}
     	else if ( mes == 11 ) {
            System.out.println("Data Atual: " + dia + " de Novembro de " + ano);
	}
     	else if ( mes == 12 ) {
            System.out.println("Data Atual: " + dia + " de Dezembro de " + ano);
        }
	else {
            System.out.println("Insira uma data corretamente. Siga o exemplo!");
       	}

       	if (hora == 1 ) {
            System.out.println("Horário Atual: " + hora + " hora e " + min + " minutos.");
	}
        else { 
            System.out.println("Horario Atual: " + hora + " horas e " + min + " minutos.");
        }
    }
}
