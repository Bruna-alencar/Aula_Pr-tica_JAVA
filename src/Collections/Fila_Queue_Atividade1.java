package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Queue_Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<String> ordem = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        String nome;
      
        while(true) {
        	
        
       System.out.println("\n********************************"); 
       System.out.println("\n\tBanco Bra!\t\t");
       System.out.println("\n********************************");
       System.out.println("\n1 - Adicionar cliente na fila");
       System.out.println("\n2 - Listar todos os clientes");
       System.out.println("\n3 - Retirar cliente da fila");
       System.out.println("\n0 - Sair");
       System.out.println("\n********************************");
       
       System.out.println("\nEntre com a opção desejada: ");
       opcao = leia.nextInt();
       
       if(opcao == 0) {
    	  System.out.println("\nBanco Bra! Obriga por utilizar nossos serviços");
    	  leia.close();
			System.exit(0);
       }
       switch(opcao) {
       case 1:
    	   System.out.println("\nDigite o nome do cliente");
    	   leia.nextLine();
    	   nome = leia.nextLine();
    	   ordem.add(nome);
    	   System.out.println("\nFila: "+ordem);
    	   System.out.println("Cliente adicionado");
    	   break;
       case 2:
    	   System.out.println("\nFila: "+ordem);
    	   break;
       case 3:
    	   if(ordem.size() == 0) {
    		   System.out.println("\nA fila está vazia!");
    	   }else {
    	   System.out.println("\nCliente chamado: "+ordem.remove());
    	   System.out.println("\nClientes na fila após a chamada: "+ordem);
    	   }
    	   break;
    	   default:
    		   System.out.println("\nOpção inválida");
       
	}
	}
 
}
}
