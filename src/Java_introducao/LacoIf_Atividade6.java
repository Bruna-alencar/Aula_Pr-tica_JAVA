package Java_introducao;

import java.util.Scanner;

public class LacoIf_Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nome;
        int cargo;
        float salario;
        double novoSalario;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\n1- Gerente");
        System.out.println("\n2- Vendedor");
        System.out.println("\n3- Supervisor");
        System.out.println("\n4- Motorista ");
        System.out.println("\n5- Estoquista ");
        System.out.println("\n6- Técnico de TI ");
        System.out.println("\nNome do Colaborador: ");
        nome = leia.nextLine();
        System.out.println("\nDigite o código do cargo: ");
        cargo = leia.nextInt();
        System.out.println("\nDigite o salário: ");
        salario = leia.nextFloat();
        
        switch(cargo) {
        
        case 1:
        {
        	novoSalario = salario + (0.1 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        case 2:
        {
        	novoSalario = salario + (0.07 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        case 3:
        {
        	novoSalario = salario + (0.09 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        case 4:
        {
        	novoSalario = salario + (0.06 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        case 5:
        {
        	novoSalario = salario + (0.05 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        case 6:
        {
        	novoSalario = salario + (0.08 * salario);
        };
        System.out.println("\nSalário com reajuste: "+novoSalario);
        break;
        default:
        	System.out.println("\nOpção inválida");
        }
        
        
	}

}
