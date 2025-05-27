package com.example.parcial.parcial.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ContratoDTO {

    private Long id;
    private String identificador;
    private Double valor;
    private String nombre_contratante;
    private String documento_contratante;
    private String nombre_contratantista;
    private String documento_contratantista;
    private LocalDate fecha_inicio;
    private LocalDate fecha_final;
}
