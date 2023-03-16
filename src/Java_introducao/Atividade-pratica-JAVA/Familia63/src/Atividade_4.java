package Java_introducao;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float n1,n2,n3,n4,diferenca;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nInsira o número 1: ");
        n1 =leia.nextFloat();
        System.out.println("\nInsira o número 2: ");
        n2 = leia.nextFloat();
        System.out.println("\nInsira o número 3: ");
        n3 = leia.nextFloat();
        System.out.println("\nInsira o número 4: ");
        n4 = leia.nextFloat();
        
        diferenca = (n1*n2)-(n3*n4);
        System.out.println("A diferença é: "+diferenca);
        
        
	}

}
