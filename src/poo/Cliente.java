package poo;

public class Cliente {
   private String nomeCliente;
   private String endereco;
   private int telefone;
   private int idade;
   private int cpf;
public Cliente(String nomeCliente, String endereco, int telefone, int idade, int cpf) {
	super();
	this.nomeCliente = nomeCliente;
	this.endereco = endereco;
	this.telefone = telefone;
	this.idade = idade;
	this.cpf = cpf;
}
public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
	this.cpf = cpf;
}
   
 public void visualizar() {
	 System.out.println(nomeCliente+", com número de CPF "+cpf);
 }
	
}
