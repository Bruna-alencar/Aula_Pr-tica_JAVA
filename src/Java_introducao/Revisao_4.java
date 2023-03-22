/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela
 *  e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */


package Java_introducao;

import java.util.Scanner;

public class Revisao_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] numeros = new int[3][3];
        int linha,coluna,somaTotal=0,somaDiagonal=0;
        
   Scanner leia = new Scanner(System.in);
        
        for(linha=0;linha<3;linha++) {
        	for(coluna=0;coluna<3;coluna++) {
        		System.out.println("\nEntre com um número: ");
        		numeros[linha][coluna] = leia.nextInt();
        		somaTotal += numeros[linha][coluna];
        		
        		if(linha == coluna) {
        			somaDiagonal += numeros[linha][coluna];
        		}
        	}
        }
        System.out.println("\nSoma dos valores da matriz: "+somaTotal);
        System.out.println("\nSoma dos valores da diagonal principal: "+somaDiagonal);
	}

}
