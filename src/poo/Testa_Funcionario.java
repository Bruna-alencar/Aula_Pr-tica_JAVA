package poo;

public class Testa_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Funcionario func1 = new Funcionario ("Guilherme",428201,"Sênior",625364,"Quinta");
        Funcionario func2 = new Funcionario ("Noah",54321,"Junior",938716,"Terça");
        Funcionario func3 = new Funcionario ("Bruna",98765,"Gerente",548312,"Quarta");
        
        func1.visualizar();
        func2.visualizar();
        func3.visualizar();
	}

}
