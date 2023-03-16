package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro valor: ");
		A = leia.nextInt();
		System.out.println("\nInsira o segundo valor: ");
		B = leia.nextInt();
		System.out.println("\nInsira o terceiro valor: ");
		C = leia.nextInt();
		
		soma = (A+B);
		System.out.println("\nA soma é: "+soma);
		
		if(soma<C) {
			System.out.println("\nO valor de C é menor que a soma.");
		} 
		else if(soma>C) {
			System.out.println("\nO valor de C é maior que a soma.");
		}
		else {
				System.out.println("\nO valor de C é igual a soma.");			
		}
	
			
		

	}

}
