package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque_aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int op;
        
        Scanner leia = new Scanner(System.in);
        
        ArrayList<String> estoque = new ArrayList();
        
        do {
        	System.out.println("\n\t\tMenu do Estoque");
        	System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
        	System.out.println("\n(2) Deseja remover produtos do estoque?");
        	System.out.println("\n(3) Deseja atualizar produtos do estoque?");
        	System.out.println("\n(4) Deseja mostrar produtos do estoque?");
        	System.out.println("\n(0) Deseja encerrar o programa de estoque?");
        	System.out.println("\nDigite a sua opção: ");
        	op = leia.nextInt();
        	
        	switch(op) {
        	case 1:
        		leia.nextLine();
        		System.out.println("\nDigite o produto para adicionar ao estoque: ");
        		String produto = leia.nextLine();
        		estoque.add(produto);
        		break;
        		
        	case 2:
        		leia.nextLine();
        		System.out.println("\nDigite o produto para remover do estoque: ");
        	    String produtor = leia.nextLine();
        	    if(estoque.contains(produtor)) {
        	    	estoque.remove(produtor); 
        	    }else {
        	    	System.out.println("\nEsse produto não existe");
        	    }
        	    System.out.println("\nProdutos do estoque: ");
        	    System.out.println(estoque);
        	    break;
        	    
        	case 3: 
        		leia.nextLine();
        		System.out.println("\nDigite o produto para atualizar do estoque: ");
        		String verifica = leia.nextLine();
        		System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+" : ");
        		String novo = leia.nextLine();
        		  if(estoque.contains(verifica)) {
          	    	estoque.remove(verifica); 
          	    	estoque.add(novo);
          	    }else {
          	    	System.out.println("\nEsse produto não existe");
          	    }
        		  System.out.println("\nProdutos do estoque: ");
          	    System.out.println(estoque);
          	    break; 
        	case 4:
        		System.out.println("\nProdutos do estoque: ");
        	    System.out.println(estoque);
        	    break;
        	    
        	case 0:
        		System.out.println("\nObrigado por utilizar nosso sistema!");
        		break;
        		default:
        			System.out.println("\nOpção inválida. Digite novamente");
        	}
        	
        	
        }while(op != 0);
	}

}
