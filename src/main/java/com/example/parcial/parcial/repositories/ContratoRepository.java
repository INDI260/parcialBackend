package com.example.parcial.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial.parcial.entities.Contrato;
import java.util.List;
import com.example.parcial.parcial.entities.Entidad;


public interface ContratoRepository extends JpaRepository<Contrato, Long> {
    List<Contrato> findByEntidad(Entidad entidad);
}
