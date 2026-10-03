package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

	private int numeroEixos;

	public Caminhao(String placaCaminhao, double cargaMaximaKg, int qtdEixos) {
		super(placaCaminhao, cargaMaximaKg);
		this.numeroEixos = qtdEixos;
	}

	public int getNumeroEixos() {
		return this.numeroEixos;
	}

}