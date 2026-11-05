package io.github.brwnohrq.controller;

import io.github.brwnohrq.service.BankService;
import io.github.brwnohrq.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {

    @Autowired
    private PokemonService pokemonService;




}
