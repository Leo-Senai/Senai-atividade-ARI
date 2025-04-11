package AulaCase;

import java.util.Scanner;

public class TorneioDosNumeros {
	public static void main(String[] args) {
		
		//DECLARAÇÃO VARIAVEIS
		int impar =0;
		int pares =0;
		int num;
		int neutro;
		
	
		Scanner ler=new Scanner(System.in);
		
		for(int i=0 ; i < 10; i ++) {
			System.out.println("Escreva 1 numero : ");
			num=ler.nextInt();
			
			if(num == 0) {
		    neutro ++;
		     
			}else if(num % 2 == 0) {
				pares++;
			
			}else {
	          impar++;
			
			}
	    
	}
		 System.out.println(" Pares " + pares + " Impar " + impar + " Neutro "+ neutro);
		 if(pares > impar) {
			 System.out.println("Par vencedor");
			 
		 }else if(pares ==impar) {
			 
		 System.out.println("Empate");
		 
		 }else {
		 System.out.println("Impar vencedor");
		 }
		 ler.close();
 }
     
 }
   