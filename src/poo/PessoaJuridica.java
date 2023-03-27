package poo;

public class PessoaJuridica extends Cliente {
       private String cnpj;

	public PessoaJuridica(String nomeCliente, String endereco, int telefone, int idade, int cpf, String cnpj) {
		super(nomeCliente, endereco, telefone, idade, cpf);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
       
	public void visualizar() {
		System.out.println("\nNome do cliente: "+getNomeCliente()+"\nCNPJ do cliente: "+getCnpj());
}
}
