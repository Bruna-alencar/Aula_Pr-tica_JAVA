package Java_introducao;

import java.util.Scanner;

public class LacoIf {

	public static void main(String[] args) {
		
		/*
		 Operador Lógico E --> &&
		 Entrada1   Entrada2   Saída
		 V          V          V
		 V          F          F
		 F          V          F
		 F          F          F
		 
		 Operador Lógico OU --> ||
		 Entrada1   Entrada2   Saída
		 V          V          V
		 V          F          V
		 F          V          V
		 F          F          F
		 */
		
		// TODO Auto-generated method stub
        float n1,n2,n3,media;
        int op;
        
        
        Scanner leia = new Scanner(System.in);
        
       System.out.println("\nEnte com a primeira nota: ");
       n1 = leia.nextFloat();
       System.out.println("\nEnte com a segunda nota: ");
       n2 = leia.nextFloat();
       System.out.println("\nEnte com a terceira nota: ");
       n3 = leia.nextFloat();
       
       media = (n1+n2+n3)/3;
       System.out.printf("\nMedia foi de: %.2f",media);//
       
       if(media>=7 && media<=10) {
    	 System.out.println("\nAluno aprovado!!");  
       }else if(media>=5 && media<7) {
    	   System.out.println("\nAluno de exame!!");   
       }
       else {
    	   System.out.println("\nAluno reprovado!!"); 
       }
       
       System.out.println("\n\t\tMenu de elogios");
       System.out.println("\n1- Feliz");
       System.out.println("\n2- Acolhedora");
       System.out.println("\n3- Está de parabéns");
       System.out.println("\n4- Nota 10");
       System.out.println("\n5- Show");
       System.out.println("\nDigite a sua opção: ");
       op = leia.nextInt();
       
       switch(op) {
       
       case 1:
    	   System.out.println("\nFamília feliz");
    	   break;
       case 2:
    	   System.out.println("\nFamília acolhedora");
    	   break;
       case 3:
    	   System.out.println("\nFamília está de parabéns");
    	   break;
       case 4:
    	   System.out.println("\nFamília nota 10");
    	   break;
       case 5:
    	   System.out.println("\nFamília show");
    	   break;
       default:
    		   System.out.println("\nOpção inválida");
    		   
    		   
       }
       
        
	}

}
