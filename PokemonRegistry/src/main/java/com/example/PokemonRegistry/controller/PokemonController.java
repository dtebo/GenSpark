package com.example.PokemonRegistry.controller;

import com.example.PokemonRegistry.entity.Pokemon;
import com.example.PokemonRegistry.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class PokemonController {
    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(@Qualifier("pokemonServiceIMPL")PokemonService pokemonService){ this.pokemonService = pokemonService; }

    @GetMapping("/retrieveAllPokemon")
    public List<Pokemon> findAll(){ return pokemonService.findAll(); }

    @PostMapping("/addPokemon")
    public Pokemon addPokemon(@RequestBody Pokemon thePokemon){
        thePokemon.setId(0);

        pokemonService.saveOrUpdate(thePokemon);
        return thePokemon;
    }

    @PutMapping("/updatePokemon")
    public Pokemon updatePokemon(@RequestBody Pokemon updatePokemon){
        pokemonService.saveOrUpdate(updatePokemon);
        return updatePokemon;
    }

    @DeleteMapping("/deletePokemon/{pokemonId}")
    public String deletePokemon(@PathVariable int pokemonId){
        pokemonService.deleteById(pokemonId);
        return "Deleted pokemon id: " + pokemonId;
    }
}
