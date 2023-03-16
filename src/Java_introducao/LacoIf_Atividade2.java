package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,res;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nDigite um número: ");
        num = leia.nextInt();
        
        if(num>0 && num%2 ==0) {
        	System.out.printf("\nO número %d é par e positivo.",num);	
        }
        else if(num<0 && num%2 ==0) {
        	System.out.printf("\nO número %d é par e negativo.",num);
        }
        else if(num>0 && num%2 ==1) {
        	System.out.printf("\nO número %d é ímpar e positivo.",num);
        }
        else if(num<0 && num%2 ==-1) {
        	System.out.printf("\nO número %d é ímpar e negativo.",num);
        }
        
        
	}

}
