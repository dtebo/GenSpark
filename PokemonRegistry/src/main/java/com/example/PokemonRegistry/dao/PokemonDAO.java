package com.example.PokemonRegistry.dao;

import com.example.PokemonRegistry.entity.Pokemon;

import java.util.List;

public interface PokemonDAO {
    List<Pokemon> findAll();
    Object findById(int id);
    void saveOrUpdate(Pokemon thePokemon);
    void deleteById(int id);
}
