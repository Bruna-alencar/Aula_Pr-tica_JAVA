package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);
        
        System.out.println("\nDigite o número que você deseja encontrar: ");
        int n = leia.nextInt();
        
        //verificando a posição
        int posicao = numeros.indexOf(n); //indexOf vai pegar o 'n' e procurar o índice (posição) do valor
	    
        if(posicao != -1) {//-1 pq é uma posição inválida. A posição começa em 0
        	System.out.println("\nO número "+n+" está na posição: "+posicao);
        }else {
        	System.out.println("\nO número "+n+" não foi encontrado =(");
        }
	}

}
