package com.example.parcial.parcial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcial.parcial.DTO.EntidadDTO;
import com.example.parcial.parcial.repositories.EntidadRepository;

import org.modelmapper.ModelMapper;

@Service
public class EntidadService {

    @Autowired
    private EntidadRepository entidadRepository;
    @Autowired
    ModelMapper modelMapper;

    public EntidadDTO getEntidadById(Long id) {
        return modelMapper.map(entidadRepository.findById(id).orElse(null), EntidadDTO.class);
    }

    public Iterable<EntidadDTO> getAllEntidades() {
        return entidadRepository.findAll().stream()
                .map(entidad -> modelMapper.map(entidad, EntidadDTO.class))
                .toList();
    }

    public EntidadDTO saveEntidad(EntidadDTO entidadDTO) {
        return modelMapper.map(entidadRepository.save(modelMapper.map(entidadDTO, com.example.parcial.parcial.entities.Entidad.class)), EntidadDTO.class);
    }

    public void deleteEntidad(Long id) {
        entidadRepository.deleteById(id);
    }

    public EntidadDTO updateEntidad(Long id, EntidadDTO entidadDTO) {
        if (entidadRepository.existsById(id)) {
            entidadDTO.setId(id);
            return saveEntidad(entidadDTO);
        }
        return null; // or throw an exception
    }
    
}
