package io.github.brwnohrq.controller;

import io.github.brwnohrq.model.Conta;
import io.github.brwnohrq.model.TipoConta;
import io.github.brwnohrq.repository.ContaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContaController {

    public ContaController (ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }



    private final ContaRepository contaRepository;


    @GetMapping ("/conta")
    public List <Conta> contas (){
        return contaRepository.contas();
    }

    @GetMapping("/bloqueada")
    public List <Conta> listar (){
        return contaRepository.lisar();
    }

    @GetMapping ("/contaCliente")
    public List <Conta> contaCliente (){
        return contaRepository.contaCliente();
    }

    @GetMapping ("/contaRica")
    public List <Conta> contaRica (){
        return contaRepository.contaRica();
    }

    @GetMapping("/contas/{id}")
    public List<Conta> buscarId(@PathVariable int id) {
        return contaRepository.buscarId(id);
    }

}

