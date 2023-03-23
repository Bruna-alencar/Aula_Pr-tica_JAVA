package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Pilha_Stack_Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		String nome;
		int opcao;
		
		while (true) {
			
			 System.out.println("\n********************************"); 
		       System.out.println("\n\tLivraria NB!\t\t");
		       System.out.println("\n********************************");
		       System.out.println("\n1 - Adicionar livro na pilha");
		       System.out.println("\n2 - Listar todos os livros");
		       System.out.println("\n3 - Retirar livro da pilha");
		       System.out.println("\n0 - Sair");
		       System.out.println("\n********************************");
		       
		       System.out.println("\nEntre com a opção desejada: ");
		       opcao = leia.nextInt();
		       
		       if(opcao == 0) {
		     	  System.out.println("\nLivraria NB! Obriga por utilizar nossos serviços");
		     	  leia.close();
		 			System.exit(0);
		 		}
		       switch(opcao) {
		       case 1:
		    	   System.out.println("\nDigite o nome do livro: ");
		    	   leia.nextLine();
		    	   nome = leia.nextLine();
		    	   pilha.push(nome);
		    	   System.out.println("\nPilha de livros: "+pilha);
		    	   System.out.println("\nLivro adicionado!");
		    	   break;
		       case 2:
		    	   System.out.println("\nPilha de livros: "+pilha);
		    	   break;
		       case 3: 
		    	   if(pilha.size() == 0) {
		    		   System.out.println("\nA pilha está vazia!");
		    	   }else {
		    		   System.out.println("\nLivro retirado: "+pilha.pop());
		        	   System.out.println("\nClientes na fila após a chamada: "+pilha);
		    	   }
		    	   break;
		       default:
	    		   System.out.println("\nOpção inválida");
		       }
		       
		
	}

}
}

