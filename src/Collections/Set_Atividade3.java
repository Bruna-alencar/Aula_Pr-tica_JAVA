package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        int numero;
        
        Set<Integer> meuSet = new HashSet<Integer>();
        
       for(int x=0;x<10;x++) {
    	   System.out.println("\nDigite um número");
    	   numero = leia.nextInt();
    	   meuSet.add(numero);
       }
       
       System.out.println("\nListar dados do Set:");
       
       Iterator<Integer> imeuSet = meuSet.iterator();
       
       while (imeuSet.hasNext()) {
    	   System.out.println(imeuSet.next());
       }
	}

}
