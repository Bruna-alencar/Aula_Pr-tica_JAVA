package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List_Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> minhaLista = new ArrayList<String>();
        int x;
        String cor;
        Scanner leia = new Scanner(System.in);
        
        for(x=0;x<5;x++) {
     	   System.out.println("\nDigite a cor: ");
     	   cor = leia.nextLine();
     	   minhaLista.add(cor);
        }
       System.out.println("\nTodas as cores "+minhaLista);
       
       Collections.sort(minhaLista);
       System.out.printf("\nCores em ordem crescente: "+minhaLista);
       
        
        
        
        
	}

}
