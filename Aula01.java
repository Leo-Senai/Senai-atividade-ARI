package AulaCase;

import java.util.Scanner;

public class Aula01 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int meses ;
	
	System.out.println("Informar o mes de 1 a 12 : ");
	meses =ler.nextInt();
	
	switch (meses) {
	case 1 :
		System.out.println("O mes escolhido foi Janeiro ");
		break;
	case 2 :
		System.out.println("O mes escolhido foi Fevereiro ");
		break;
	case 3 :
		System.out.println("O mes escolhido foi Março ");
		break;
	case 4 :
		System.out.println("O mes escolhido foi Abril ");
		break;
	case 5 :
		System.out.println("O mes escolhido foi Maio ");
		break;
	case 6 :
		System.out.println("O mes escolhido foi Junho ");
		break;
	case 7 :
		System.out.println("O mes escolhido foi Julho ");
		break;
	case 8 :
		System.out.println("O mes escolhido foi Agosto");
		break;
	case 9 :
		System.out.println("O mes escolhido foi Setembro");
		break;
	case 10 :
		System.out.println("O mes escolhido foi Outubro");
		break;
	case 11 :
		System.out.println("O mes escolhido foi Novembro");
		break;
	case 12 :
		System.out.println("O mes escolhido foi Dezembro");
		break;
		default:
			System.out.println("Informe um mes válido ");
	}
		ler.close();
	}
}

