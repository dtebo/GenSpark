package com.example.PartsRegistry.service;

import com.example.PartsRegistry.dao.PartDAO;
import com.example.PartsRegistry.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceIMPL implements PartService {
    private final PartDAO partDAO;

    @Autowired
    public PartServiceIMPL(PartDAO partDAO){ this.partDAO = partDAO; }

    @Override
    public List<Part> findAll() { return partDAO.findAll(); }

    @Override
    public Object findById(int partId) { return partDAO.findById(partId); }

    @Override
    public void saveOrUpdate(Part thePart) { partDAO.saveOrUpdate(thePart); }

    @Override
    public void deleteById(int partId) { partDAO.deleteById(partId); }
}
