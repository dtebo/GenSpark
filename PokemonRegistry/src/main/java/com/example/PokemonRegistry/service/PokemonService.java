package com.example.PokemonRegistry.service;

import com.example.PokemonRegistry.entity.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> findAll();
    Object findById(int id);
    void saveOrUpdate(Pokemon thePokemon);
    void deleteById(int id);
}
