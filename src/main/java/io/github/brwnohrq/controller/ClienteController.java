package io.github.brwnohrq.controller;

import io.github.brwnohrq.model.Cliente;
import io.github.brwnohrq.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {


    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    private final ClienteRepository clienteRepository;


    @GetMapping ("/clientes")
    public List<Cliente> listar (){
        return clienteRepository.listar();
    }
}
