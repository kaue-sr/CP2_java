package br.com.fiapdelivery.model;

public class Entrega {

	private String destino;
	private String status;

	private Pacote pacoteTransportado;
	private Veiculo veiculoUtilizado;

	public Entrega(String enderecoDestino, Pacote pacoteEnviado, Veiculo veiculoEscolhido) {
		this.destino = enderecoDestino;
		this.pacoteTransportado = pacoteEnviado;
		this.veiculoUtilizado = veiculoEscolhido;
		this.status = "Aguardando Entregador";
		System.out.println("Nova entrega registrada - Destino: " + this.destino + " | Status: " + this.status);
	}

	public String getDestino() {
		return this.destino;
	}

	public String getStatus() {
		return this.status;
	}

	public Pacote getPacoteTransportado() {
		return this.pacoteTransportado;
	}

	public Veiculo getVeiculoUtilizado() {
		return this.veiculoUtilizado;
	}

	public void realizarEntrega() {
		this.status = "Em trânsito";
		System.out.println("Entrega em andamento - Pacote: " + this.pacoteTransportado.getCodigo() + " | Placa do Veículo de Transporte: " + this.veiculoUtilizado.getPlaca());
	}

}