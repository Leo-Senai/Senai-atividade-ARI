package AulaCase;

import java.util.Scanner;

public class DesafioTabuada {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int n;
	
   System.out.println("Digite o valor inicial para descobrir a tabuada: ");
   n=ler.nextInt();
  
    for(int  i=0; i <= 10; i++) {
    System.out.println(n+"x"+i+"="+ (n*i) );
   }
    ler.close();
}
}
