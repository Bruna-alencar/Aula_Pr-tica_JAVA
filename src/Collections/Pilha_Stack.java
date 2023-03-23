package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Pilha_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> pilha = new Stack<String>();
        
        pilha.push("Prato verde");//adicionar elementos na pilha
        pilha.push("Prato vermelho");
        pilha.push("Prato preto");
        pilha.push("Prato preto");
        pilha.push("Prato preto");
        
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());//pop remover elemento da pilha
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nElemento no topo da pilha: "+pilha.peek());//peek pega o último elemento (topo da pilha)
        System.out.println("\nAdicionar um elemento na pilha chamado Prato roxo :"+pilha.push("Prato roxo"));
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nTamanho da pilha: "+pilha.size());//size tamanho da pilha
        System.out.println("\nVerificar um elemento na pilha: "+pilha.contains("Prato azul"));
        System.out.println("\nExibir todos os elementos da minha pilha...");
        
        Iterator<String> iterator = pilha.iterator();
        
        while(iterator.hasNext()) { 
        	System.out.println(iterator.next());
        }
	}

}
