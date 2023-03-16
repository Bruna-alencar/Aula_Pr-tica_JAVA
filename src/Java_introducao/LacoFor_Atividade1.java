package Java_introducao;

import java.util.Scanner;

public class LacoFor_Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1,n2,intervalo;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nDigite um número: ");
        n1 = leia.nextInt();
        System.out.println("\nDigite outro número: ");
        n2 = leia.nextInt();
        
        if(n1 < n2) {
        	for(intervalo = n1; intervalo<= n2; intervalo++) {
        	if(intervalo % 3 == 0 && intervalo % 5 ==0) {
        		System.out.println("\nO número"+intervalo+" é divisível por 3 e 5");
        		
        	}
        	}
        }
	}

}
