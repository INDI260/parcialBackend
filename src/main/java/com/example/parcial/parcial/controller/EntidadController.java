package com.example.parcial.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcial.parcial.DTO.EntidadDTO;
import com.example.parcial.parcial.services.EntidadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/entidades")
@CrossOrigin
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping("/{id}")
    public EntidadDTO get(@PathVariable Long id) {
        return entidadService.getEntidadById(id);
    }

    @GetMapping("/")
    public Iterable<EntidadDTO> getAll() {
        return entidadService.getAllEntidades();
    }

    @GetMapping("/create")
    public EntidadDTO create(@RequestParam String nit, @RequestParam String nombre) {
        EntidadDTO entidadDTO = new EntidadDTO();
        entidadDTO.setNit(nit);
        entidadDTO.setNombre(nombre);
        return entidadService.saveEntidad(entidadDTO);
    }
}
