package com.example.MovieRegistry.dao;

import com.example.MovieRegistry.entity.Movie;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import java.util.List;

@Repository
public class MovieIMPL implements MovieDAO {
    private final EntityManager entityManager;

    @Autowired
    public MovieIMPL(EntityManager entityManager){ this.entityManager = entityManager; }

    @Override
    @Transactional
    public List<Movie> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Movie> myQuery = currentSession.createQuery("from Movie");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Movie.class, id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Movie theMovie){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theMovie);
    }

    @Override
    @Transactional
    public void deleteById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Movie myMovie = currentSession.get(Movie.class, id);
        currentSession.delete(myMovie);
    }
}
