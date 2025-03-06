package br.edu.ifrs.poa.pw1.veiculos;

import br.edu.ifrs.poa.pw1.pessoas.Proprietario;

public class Veiculo  {
	//atributos
	private String marca;
	private int ano;
	private String modelo;
	private String placa;
	private Proprietario proprietario;
	
	//construtores
	public Veiculo() {}
	public Veiculo(String marca, int ano, 
			       String modelo, String placa,
			       Proprietario proprietario) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.placa = placa;
		this.proprietario = proprietario;
	}
	//métodos
	@Override
	public String toString() {
		return "Veiculo -> \n"+
	            "Marca:" + marca + "\n"+
				"Ano:" + ano + "\n"+
				"Modelo:" + modelo + "\n"+
				"Placa:" + placa +"\n"+
				(proprietario!=null?
						proprietario.toString():
						"Proprietário inválido");
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
}
