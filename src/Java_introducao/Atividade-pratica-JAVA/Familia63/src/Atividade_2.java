package Java_introducao;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nSua média é: "+media);
		System.out.printf("\nSua média é: %,2f",media);
		
		

	}

}
