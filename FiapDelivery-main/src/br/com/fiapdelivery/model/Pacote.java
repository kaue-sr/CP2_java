package br.com.fiapdelivery.model;

public class Pacote {

	private String codigo;
	private double pesoKg;

	public Pacote(String codigoPacote, double pesoPacoteKg) {
		this.codigo = codigoPacote;
		this.pesoKg = pesoPacoteKg;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public double getPesoKg() {
		return this.pesoKg;
	}

}