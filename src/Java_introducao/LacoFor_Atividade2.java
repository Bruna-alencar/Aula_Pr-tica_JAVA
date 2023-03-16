package Java_introducao;

import java.util.Scanner;

public class LacoFor_Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
		System.out.println("\n Digite um número: ");
		n = leia.nextInt();
		
	       if(n % 2 == 0) {
	    	   contPar ++;
	    	   
	       }else {
	    	   contImpar++;
	    	   
	       }
		}
		System.out.println("\nQuantidade de números pares foi de: "+contPar);
		System.out.println("\nQuantidade de números impares foi de: "+contImpar);
	      
	       
	       
	       
		
		
		
		
		
		
		

	}

}
