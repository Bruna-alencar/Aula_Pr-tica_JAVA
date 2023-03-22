package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1,n2;
     int numeros,operacao,total;
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("\n\t\tOperação");
     System.out.println("\n1- Soma");
     System.out.println("\n2- Subtração");
     System.out.println("\n3- Multiplicação");
     System.out.println("\n4- Divisão");
     System.out.println("\nDigite o 1º número: ");
     n1 = leia.nextInt();
     System.out.println("\nDigite o 2º número: ");
     n2 = leia.nextInt();
     System.out.println("\nDigite o código da operação: ");
     operacao = leia.nextInt();
     
     switch(operacao) {
     case 1:
     {
    	 total = n1 + n2;
     };
     System.out.println("\nTotal= "+total);
     break;
     case 2:
     {
    	 total = n1 - n2;
     };
     System.out.println("\nTotal= "+total);
     break;
     case 3:
     {
    	 total = n1 * n2;
     };
     System.out.println("\nTotal= "+total);
     break;
     case 4:
     {
    	 total = n1 / n2;
     };
     System.out.println("\nTotal= "+total);
     break;
     default:
    	 System.out.println("\nOpção inválida");
     }
     
	}

}
