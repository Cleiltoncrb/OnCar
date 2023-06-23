package br.com.oncar.cliente;

import br.com.oncar.carro.DadosCarroCliente;
import br.com.oncar.endereco.DadosEnderecoCliente;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
    @NotNull
    Long id,
    String nome,
    String email,
    String telefone,
    String cpf,
    DadosEnderecoCliente endereco,
    DadosCarroCliente carro){
}
