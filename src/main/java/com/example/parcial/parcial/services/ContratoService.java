package com.example.parcial.parcial.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcial.parcial.DTO.ContratoDTO;
import com.example.parcial.parcial.repositories.ContratoRepository;

@Service
public class ContratoService {

    @Autowired
    ContratoRepository contratoRepository;
    @Autowired
    ModelMapper modelMapper;

    public Iterable<ContratoDTO> getAllContratosByEntidad() {
        return contratoRepository.findAll().stream()
                .map(contrato -> modelMapper.map(contrato, ContratoDTO.class))
                .toList();
    }

}
