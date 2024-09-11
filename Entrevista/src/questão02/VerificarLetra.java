package questão02;

import java.util.Iterator;
import java.util.Scanner;

public class VerificarLetra {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");
		String nome = leitor.nextLine();		
		int contador = 0;
		String padronizar = nome.toLowerCase();
		
		char [] letra = padronizar.toCharArray();
		
		for (int i = 0; i < letra.length; i++) {
			if (letra[i] == 'a'){
				contador++;
			}
			
		}
		
		if (contador != 0){
			System.out.println("A letra (a) existe na palavra, e aparece "+contador+" vezes");
		}
		
		
		

	}

}
