package poo;

public class Teste_Automovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //instanciando um obejto da classe automovel
		
		Automovel auto1 = new Automovel("Bruna","Kombi","NOA2008",1998);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferência de Proprietário");
	
       auto1.setNomeProprietario("Larissa Pimenta");
       auto1.imprimirInfo();
       
       System.out.println("\nMudança de placa");
       
       auto1.setPlaca("ABC888");
       auto1.imprimirInfo();
	}
	
	

}
