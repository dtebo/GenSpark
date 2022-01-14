package com.example.MedicationRegistry.dao;

import com.example.MedicationRegistry.entity.Medication;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MedicationIMPL implements MedicationDAO {
    private final EntityManager entityManager;

    @Autowired
    public MedicationIMPL(EntityManager entityManager) { this.entityManager = entityManager; }

    @Override
    @Transactional
    public List<Medication> findAll(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Medication> myQuery = currentSession.createQuery("from Medication");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Medication.class, id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Medication theMedication){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theMedication);
    }

    @Override
    @Transactional
    public void deleteById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Medication myMedication = currentSession.get(Medication.class, id);
        currentSession.delete(myMedication);
    }
}
