package br.com.oncar.controller;

import br.com.oncar.cliente.Cliente;
import br.com.oncar.cliente.ClienteRepository;
import br.com.oncar.cliente.DadosCadastroCliente;
import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public String listar() {
        return "oficina/cadastrarCliente";
    }


    @PostMapping
    @Transient
    public void cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }
}