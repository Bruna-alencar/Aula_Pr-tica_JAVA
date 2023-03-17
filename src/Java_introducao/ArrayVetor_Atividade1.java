package Java_introducao;

import java.util.Scanner;

public class ArrayVetor_Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] num = new int[10];
        int numero,pos,x,cont=0;
        
        Scanner leia = new Scanner(System.in);
        
        
        for(x=0;x<10;x++) {
        	System.out.println("\nEntre com um número do Vetor: ");
        	num[x] = leia.nextInt();
        }
        
        System.out.println("\nDigite um número: ");
        numero = leia.nextInt();
        
        for(x=0;x<10;x++) {
        	if(num[x] == numero) {
        		System.out.println("\nA posição do número digitado é: "+x);
        		cont++;
        	}
        		
        	}
        if(cont == 0) {
        	System.out.println("\nNão foi encontrado");
        	}
	}
}
        
	


