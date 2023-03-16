package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nPrimeira doação de sangue? ");
		doacao = leia.nextBoolean(); 
		
		if(idade >= 18 && idade <=60) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}else if(idade > 60 && idade <=69 && doacao == false) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}else if(idade > 60 && idade <=69 && doacao == true) {
			System.out.println(nome+" não está apto(a) para doar sangue");
		}else {
			System.out.println(nome+" não está apto(a) para doar sangue");
		}

	}

}
