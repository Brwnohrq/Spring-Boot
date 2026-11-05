package io.github.brwnohrq.service;

import io.github.brwnohrq.model.PokemonModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PokemonService {

    private final RestClient abobora = RestClient.create();

    public PokemonModel.PokemonType buscar(String nome) {
        return abobora.get()
                .uri("https://pokeapi.co/api/v2/pokemon/" + nome)
                .retrieve()
                .body(PokemonModel.PokemonType.class);
    }
}