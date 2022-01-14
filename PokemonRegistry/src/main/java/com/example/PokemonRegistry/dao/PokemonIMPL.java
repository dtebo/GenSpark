package com.example.PokemonRegistry.dao;

import com.example.PokemonRegistry.entity.Pokemon;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PokemonIMPL implements PokemonDAO {
    private final EntityManager entityManager;

    @Autowired
    public PokemonIMPL(EntityManager entityManager) { this.entityManager = entityManager; }

    @Override
    @Transactional
    public List<Pokemon> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Pokemon> myQuery = currentSession.createQuery("from Pokemon");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Pokemon.class, id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Pokemon thePokemon){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(thePokemon);
    }

    @Override
    @Transactional
    public void deleteById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Pokemon myPokemon = currentSession.get(Pokemon.class, id);
        currentSession.delete(myPokemon);
    }
}
