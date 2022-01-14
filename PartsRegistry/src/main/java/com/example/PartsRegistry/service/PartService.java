package com.example.PartsRegistry.service;

import com.example.PartsRegistry.entity.Part;

import java.util.List;

public interface PartService {
    List<Part> findAll();
    Object findById(int partId);
    void saveOrUpdate(Part thePart);
    void deleteById(int partId);
}
