package io.github.brwnohrq.model;

import java.util.List;

public class PokemonModel {



    public record PokemonType (String name, int height, int weight, List <TipoSlot> types, List <abilities> abilities){

    }

    public record TipoSlot (TipoInfo type){

    }

    public record TipoInfo (String name){

    }

    public record abilities (TipoInfo ability){

    }

    public record ability (String name){

    }



}
