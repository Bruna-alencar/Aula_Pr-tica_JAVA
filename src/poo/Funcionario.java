package poo;

public class Funcionario {
     
	private String nomeFuncionario;
	private double ra;
	private String cargo;
	private int cpf;
	private String folga;
	public Funcionario(String nomeFuncionario, double ra, String cargo, int cpf, String folga) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.ra = ra;
		this.cargo = cargo;
		this.cpf = cpf;
		this.folga = folga;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public double getRa() {
		return ra;
	}
	public void setRa(double ra) {
		this.ra = ra;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getFolga() {
		return folga;
	}
	public void setFolga(String folga) {
		this.folga = folga;
	}
	
	public void visualizar () {
		System.out.println(nomeFuncionario+" folga na "+folga);	
	}
	

		
	
}
