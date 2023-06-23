package br.com.oncar.controller;

import br.com.oncar.cliente.Cliente;
import br.com.oncar.cliente.ClienteRepository;
import br.com.oncar.cliente.DadosCadastroCliente;
import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public String listar(){
        return "<h1> Mostrando na tela </>";
    }




    @PostMapping
    @Transient
    public void cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }
}