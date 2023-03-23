package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> fila = new LinkedList<Integer>();
       
        for(int i=0;i<=10;i++) {
        	fila.add(i); 
        }
        System.out.println("\nElementos da fila: "+fila);
        System.out.println("\nRemovendo um elemento da fila: "+fila.remove());
        System.out.println("\nElementos da fila após a remoção: "+fila);
        System.out.println("\nAdicionando um elemento na fila: "+fila.add(11));
        System.out.println("\nElementos da fila após adição: "+fila);
        System.out.println("\nPegar o primeiro elemento da fila: "+fila.peek());//peek pega o primeiro elemento (topo da fila)
        System.out.println("\nPegar o tamanho da fila: "+fila.size());//size tamanho da fila.
        System.out.println("\nVerificar o tamanho da fila: "+fila.contains(37));//contains verifica se o número contem na fila
        System.out.println("\nExibir e vou também retirar o primeiro elemento da fila: "+fila.poll());//poll exibe e retira um numero da fila de uma vez
        System.out.println("\nElementos da fila: "+fila);
        
        Iterator<Integer> iterator = fila.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());//iterator está organizando a fila
        }
        System.out.println("\nLimpar a fila: ");
        fila.clear();
        System.out.println("\nVerificar se a fila está vazia(limpa): "+fila.isEmpty());//isEmpty mostra que realmente limpou
        System.out.println("\nElementos da fila: "+fila);
        
	}

}
