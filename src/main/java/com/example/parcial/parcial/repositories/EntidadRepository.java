package com.example.parcial.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial.parcial.entities.Entidad;

public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}
