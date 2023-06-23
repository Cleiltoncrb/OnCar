package br.com.oncar.carro;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CarroCliente {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private String anofabricacao;

    public CarroCliente(DadosCarroCliente dados) {
        this.placa = dados.placa();
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.cor = dados.cor();
        this.anofabricacao = dados.anofabricacao();
    }

    public void atualizarInformacoesCarro(DadosCarroCliente dados) {
        if (dados.placa() != null) {
            this.placa = dados.placa();
        }
        if (dados.marca() != null) {
            this.marca = dados.marca();
        }
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if (dados.cor() != null) {
            this.cor = dados.cor();
        }
        if (dados.anofabricacao() != null) {
            this.anofabricacao = dados.anofabricacao();
        }
    }
}
