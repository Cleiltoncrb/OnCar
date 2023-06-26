package br.com.oncar.carro;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCarroCliente(
        @NotBlank
        String placa,
        String marca,
        String modelo,
        String cor,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String anofabricacao
) {
}