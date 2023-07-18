package br.com.oncar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class OncarController {
    @GetMapping
    public String index() {
        return "index.html";
    }

    @GetMapping("/home")
    public String home() {
        return "index.html";
    }

    @GetMapping("/sobre")
    public String about() {
        return "/menu/sobre.html";
    }

    @GetMapping("/servicos")
    public String service() {
        return "/menu/servicos.html";
    }

    @GetMapping("/contato")
    public String contact() {
        return "/menu/contato.html";
    }
    @GetMapping("/cadastrarcliente")
    public String carregapaginacliente() {
        return "oficina/cadastroCliente";
    }

    @PostMapping("/agendamento")
    public String agendamento(String nome, String email, String date1, String servico, String pedidos, Model model) {
        model.addAttribute("data",date1);
        model.addAttribute("email", email);
        model.addAttribute("servico", servico);
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("nome", nome);
        return "/oficina/listaAgendamento";
    }
}
