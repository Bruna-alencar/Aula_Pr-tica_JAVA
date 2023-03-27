package poo;

public class PessoaFisica extends Cliente {
	private int codigoCliente;

	public PessoaFisica(String nomeCliente, String endereco, int telefone, int idade, int cpf, int codigoCliente) {
		super(nomeCliente, endereco, telefone, idade, cpf);
		this.codigoCliente = codigoCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public void visualizar() {
		System.out.println("\nNome do cliente: "+getNomeCliente()+"\nCódigo do cliente: "+getCodigoCliente());
	}

}
