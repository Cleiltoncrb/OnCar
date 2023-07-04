package br.com.oncar.cliente;

import br.com.oncar.carro.DadosCarroCliente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
    @NotNull
    Long id,
    String nome,
    String email,
    String telefone,
    String cpf,
    String endereco,
    DadosCarroCliente carro){
}
