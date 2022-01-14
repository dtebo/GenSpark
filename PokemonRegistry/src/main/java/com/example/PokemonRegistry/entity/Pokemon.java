package com.example.PokemonRegistry.entity;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pokemon_name")
    private String pokemonName;

    @Column(name = "pokemon_type")
    private String pokemonType;

    @Column(name = "hp")
    private int hp;

    @Column(name = "region")
    private String region;

    public Pokemon() {
    }

    public Pokemon(String pokemonName, String pokemonType, int hp, String region) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.hp = hp;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString(){
        return "Pokemon{" +
                "id=" + id +
                ", pokemonName=" + pokemonName + '\'' +
                ", pokemonType=" + pokemonType + '\'' +
                ", hp=" + hp + '\'' +
                ", region=" + region + '\'' +
                "}";
    }
}
