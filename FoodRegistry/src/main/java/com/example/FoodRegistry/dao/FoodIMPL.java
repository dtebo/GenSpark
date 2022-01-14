package com.example.FoodRegistry.dao;

import com.example.FoodRegistry.entity.Food;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class FoodIMPL implements FoodDAO {
    private final EntityManager entityManager;

    @Autowired
    public FoodIMPL(EntityManager entityManager){ this.entityManager = entityManager; }

    @Override
    @Transactional
    public List<Food> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Food> myQuery = currentSession.createQuery("from Food");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Food.class, id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Food theFood){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theFood);
    }

    @Override
    @Transactional
    public void deleteById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Food myFood = currentSession.get(Food.class, id);
        currentSession.delete(myFood);
    }
}
