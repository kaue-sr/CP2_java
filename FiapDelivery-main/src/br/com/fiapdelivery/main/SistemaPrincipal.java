package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Entrega;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAP DELIVERY ---\n");

        Pacote pacoteLeve = new Pacote("PKG-999", 2.5);
        Pacote pacotePesado = new Pacote("PKG-888", 850.0);

        System.out.println("Pacote Registrado: " + pacoteLeve.getCodigo() + " | Peso: " + pacoteLeve.getPesoKg() + "kg");
        System.out.println("Pacote Registrado: " + pacotePesado.getCodigo() + " | Peso: " + pacotePesado.getPesoKg() + "kg\n");

        Moto motoEntregadora = new Moto("ABC-1234", 15.0, true);
        Caminhao caminhaoDeCarga = new Caminhao("DEF-5678", 5000.0, 3);

        System.out.println("Veículo: Moto | Placa: " + motoEntregadora.getPlaca() + " | Baú: " + motoEntregadora.isTemBau() + " | Capacidade de carga (kg): " + motoEntregadora.getCapacidadeCargaKg() + "kg");
        System.out.println("Veículo: Caminhão | Placa: " + caminhaoDeCarga.getPlaca() + " | Eixos: " + caminhaoDeCarga.getNumeroEixos() + " | Capacidade de carga (kg): " + caminhaoDeCarga.getCapacidadeCargaKg() + "kg\n");

        Entrega entregaDeMoto = new Entrega("Av. Paulista, 1106", pacoteLeve, motoEntregadora);
        Entrega entregaDeCaminhao = new Entrega("Rua Serra de São Domingos, 72", pacotePesado, caminhaoDeCarga);

        entregaDeMoto.realizarEntrega();
        entregaDeCaminhao.realizarEntrega();

        System.out.println("\nResumo da Entrega 1:");
        System.out.println("Destino: " + entregaDeMoto.getDestino() + " | Status: " + entregaDeMoto.getStatus() + " | Veículo utilizado: " + entregaDeMoto.getVeiculoUtilizado().getPlaca());

        System.out.println("\nResumo da Entrega 2:");
        System.out.println("Destino: " + entregaDeCaminhao.getDestino() + " | Status: " + entregaDeCaminhao.getStatus() + " | Veículo utilizado: " + entregaDeCaminhao.getVeiculoUtilizado().getPlaca());
    }
}