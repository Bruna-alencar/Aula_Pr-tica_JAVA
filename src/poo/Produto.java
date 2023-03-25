package poo;

public class Produto {
      private String marca;
      private String modelo;
      private int ano;
      private String cor;
      private String controle;
	public Produto(String marca, String modelo, int ano, String cor, String controle) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.controle = controle;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getControle() {
		return controle;
	}
	public void setControle(String controle) {
		this.controle = controle;
	}
      
      public void visualizar() {
    	  System.out.println("O videogame do modelo "+modelo+" da cor "+cor+" está disponível no estoque");
      }
}
