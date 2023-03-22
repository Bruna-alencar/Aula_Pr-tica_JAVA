package Java_introducao;

import java.util.Scanner;

public class Revisao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] dado = new int[10];
        int somaLanc=0,quantMaior=0,x;
        float mediaLanc;
        
        Scanner leia = new Scanner(System.in);
        
        for(x=0;x<10;x++) {
        	System.out.println("\nDigite o valor do lançamento: ");
        	dado[x] = leia.nextInt();
        	while(dado[x]<1 || dado[x]>6) {
        		System.out.println("\nDigite o valor do lançamento novamente: ");
            	dado[x] = leia.nextInt();
        	}
        	
        	somaLanc += dado[x];
        	
        	if(dado[x] == 6) {
        		quantMaior++; 
        	}
        }
        mediaLanc = somaLanc / 10;
        System.out.println("\nQuantidade de vezes que saiu o maior valor: "+quantMaior);
        System.out.println("\nMédia dos lançamentos: "+mediaLanc);
	}

}
