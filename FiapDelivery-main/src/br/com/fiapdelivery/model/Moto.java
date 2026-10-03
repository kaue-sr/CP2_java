package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

	private boolean temBau;

	public Moto(String placaMoto, double cargaMaximaKg, boolean possuiBau) {
		super(placaMoto, cargaMaximaKg);
		this.temBau = possuiBau;
	}

	public boolean isTemBau() {
		return this.temBau;
	}

}