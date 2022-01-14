package com.example.PartsRegistry.controller;

import com.example.PartsRegistry.entity.Part;
import com.example.PartsRegistry.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class PartController {
    private final PartService partService;

    @Autowired
    public PartController(@Qualifier("partServiceIMPL")PartService partService){
        this.partService = partService;
    }

    @GetMapping("/retrieveAllParts")
    public List<Part> findAll(){ return partService.findAll(); }

    @PostMapping("/addPart")
    public Part addPart(@RequestBody Part thePart){
        thePart.setId(0);

        partService.saveOrUpdate(thePart);
        return thePart;
    }

    @PutMapping("/updatePart")
    public Part updatePart(@RequestBody Part updatePart){
        partService.saveOrUpdate(updatePart);
        return updatePart;
    }

    @DeleteMapping("/deletePart/{partId}")
    public String deletePart(@PathVariable int partId){
        partService.deleteById(partId);
        return "Deleted part id: " + partId;
    }
}
