package io.github.brwnohrq.controller;

import io.github.brwnohrq.model.PokemonModel;
import io.github.brwnohrq.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon/{nome}")
    public PokemonModel.PokemonType buscar(@PathVariable String nome) {
        return pokemonService.buscar(nome);
    }
}