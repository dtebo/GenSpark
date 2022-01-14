package com.example.PokemonRegistry.service;

import com.example.PokemonRegistry.dao.PokemonDAO;
import com.example.PokemonRegistry.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceIMPL implements PokemonService {
    private final PokemonDAO pokemonDAO;

    @Autowired
    public PokemonServiceIMPL(PokemonDAO pokemonDAO){ this.pokemonDAO = pokemonDAO; }

    @Override
    public List<Pokemon> findAll(){ return pokemonDAO.findAll(); }

    @Override
    public Object findById(int id){ return pokemonDAO.findById(id); }

    @Override
    public void saveOrUpdate(Pokemon thePokemon){ pokemonDAO.saveOrUpdate(thePokemon); }

    @Override
    public void deleteById(int id){ pokemonDAO.deleteById(id); }
}
