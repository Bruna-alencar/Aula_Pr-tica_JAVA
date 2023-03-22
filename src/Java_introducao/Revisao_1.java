package Java_introducao;

import java.util.Scanner;

public class Revisao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] vet = new int[5];
        int maiorPontuacao=0,x;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nEntre com um valor: ");
    	vet[0] = leia.nextInt(); //qualquer número que for inserido, vai ser o maior, por enquanto
    	maiorPontuacao = vet[0];
    	
        for(x=1;x<5;x++) {
        	System.out.println("\nEntre com um valor: ");
        	vet[x] = leia.nextInt();
        	
        	if(maiorPontuacao < vet[x]) {//vet[x] é a posição. maiorPontuacao é maior que a posição "anterior"?
        		maiorPontuacao = vet[x]; //se sim, então vai trocar a maiorPontuacao pela posição atual.
        	}
        }
        System.out.println("\nMaior pontuação é: "+maiorPontuacao);
	}

}
