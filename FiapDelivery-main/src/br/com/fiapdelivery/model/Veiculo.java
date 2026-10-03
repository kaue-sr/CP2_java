package br.com.fiapdelivery.model;

public class Veiculo {

	private String placa;
	private double capacidadeCargaKg;

	public Veiculo(String placaVeiculo, double cargaMaximaKg) {
		this.setPlaca(placaVeiculo);
		this.capacidadeCargaKg = cargaMaximaKg;
	}

	public String getPlaca() {
		return this.placa;
	}

	public double getCapacidadeCargaKg() {
		return this.capacidadeCargaKg;
	}

	private void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}

}