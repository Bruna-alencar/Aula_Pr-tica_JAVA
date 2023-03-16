package Java_introducao;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nome = "Lucas Vinicius";
        int idade = 26,x=7;
        double altura = 1.86,nota1,nota2,nota3,media;
        
        Scanner leia = new Scanner(System.in); 
        
        
        System.out.println("\nO seu nome é: "+nome);
        System.out.println("\nA sua idade é: "+idade+" anos");
        System.out.println("\nA sua altura é: "+altura+" metros");
        
        System.out.println("\nDigite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("\nDigite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("\nDigite a terceira nota: ");
        nota3 = leia.nextDouble();
        
        media = (nota1+nota2+nota3)/3; 
        
        System.out.println("\nMédia foi de: "+media);
        System.out.printf("\nMédia foi de: %,2f",media);
        
        nota1 = Math.sqrt(nota2);
        nota2 = Math.pow(nota3,3);
        x = idade % x;
        
        
	}

}
