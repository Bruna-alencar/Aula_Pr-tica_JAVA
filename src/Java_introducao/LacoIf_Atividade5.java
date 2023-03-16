package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int codigo;
        int quantidade;
        int produto;
        int total;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\n\t\tMenu");
        System.out.println("\n1- Cachorro Quente");
        System.out.println("\n2- X-Salada");
        System.out.println("\n3- X-Bacon");
        System.out.println("\n4- Bauru");
        System.out.println("\n5- Refrigerante");
        System.out.println("\n6- Suco de laranja");
        System.out.println("\nDigite a sua opção: ");
        produto = leia.nextInt();
        
        System.out.println("\nDigite a quantidade: ");
        quantidade = leia.nextInt();
        
        switch(produto) {
        
        case 1:
        
        	{
        		total = 10*quantidade; 
        	};
        	System.out.println("\nValor total:R$ "+total);
        	break; 
        case 2:
        
        	{
        		total = 15*quantidade; 
        	};
        	System.out.println("\nValor total:R$ "+total);
        	break; 
        case 3:
        	 {
        		total = 18*quantidade; 
        	};
        	System.out.println("\nValor total:R$ "+total);
        	break;
        case 4:
        	{
        		total = 12*quantidade; 
        	};	
        	System.out.println("\nValor total:R$ "+total);
        	break; 
        case 5:
        	{
        		total = 8*quantidade; 
        	};
        	System.out.println("\nValor total:R$ "+total);
        	break; 
        case 6:
        	{
        		total = 13*quantidade; 
        	};
        	System.out.println("\nValor total:R$ "+total);
        	break; 
        default:
 		   System.out.println("\nOpção inválida");
	}
	
}
}

