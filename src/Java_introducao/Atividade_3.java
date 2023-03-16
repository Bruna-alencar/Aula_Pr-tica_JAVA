package Java_introducao;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float salariob,adicionaln,horasextras,descontos,salariol;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual seu Salário Bruto? ");
        salariob = leia.nextFloat();
        System.out.println("Qual valor do seu Adicional Noturno? ");
        adicionaln = leia.nextFloat();
        System.out.println("Qual valor das suas Horas Extras? ");
        horasextras = leia.nextFloat();
        System.out.println("Qual valor do seus Descontos? ");
        descontos = leia.nextFloat();
        
        salariol = (salariob+adicionaln+(horasextras*5)-descontos);
        
        System.out.println("\nSeu Salário Líquido é no valor de: "+salariol);
        
        
        
        
	}

}
