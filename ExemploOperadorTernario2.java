package AulaCase;

import java.util.Scanner;

public class ExemploOperadorTernario2 {
public static void main(String[] args) {
		int numero1 = 10;
	int numero2 =20;
	System.out.println("Informar a idade");
	
	String msg = numero1 >= numero2 ? "Maior ou igual":"Menor";
	System.out.println(msg);
	
}
}