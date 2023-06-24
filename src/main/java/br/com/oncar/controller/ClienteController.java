package br.com.oncar.controller;

import br.com.oncar.cliente.Cliente;
import br.com.oncar.cliente.ClienteRepository;
import br.com.oncar.cliente.DadosCadastroCliente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public String listar() {
        return "oficina/cadastroCliente";
    }

    @PostMapping
    @Transactional
    public void cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados) {
        System.out.println("\n\n\n MOSTRAR DADOS \n\n\n" + dados);
//        System.out.println(dados);
        repository.save(new Cliente(dados));
    }
}